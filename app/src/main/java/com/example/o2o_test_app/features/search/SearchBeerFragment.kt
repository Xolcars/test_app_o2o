package com.example.o2o_test_app.features.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.o2o_test_app.R
import com.example.o2o_test_app.databinding.FragmentSearchBeerBinding
import com.example.o2o_test_app.models.view.SearchBeerBean
import com.example.o2o_test_app.setup.BaseFragment
import org.koin.android.ext.android.inject

class SearchBeerFragment : BaseFragment(), SearchBeerAdapter.OnItemListDelegate {
    //region Vars
    private lateinit var binding: FragmentSearchBeerBinding
    private val viewModel: SearchBeerViewModel by inject()
    private lateinit var adapter: SearchBeerAdapter
    //endregion Vars

    //region Override Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSearchBeerBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerAdapter()
        observers()
        initSearchView()
    }
    //endregion Override Methods

    private fun initRecyclerAdapter() {
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        context?.let { context ->
            adapter = SearchBeerAdapter(context, viewModel.beerList.value ?: mutableListOf(), this)
        }
        binding.refreshRecycler.setOnRefreshListener {
            if(binding.searchView.query.length >= MIN_SEARCH_CHARACTERS) {
                viewModel.performSearch(binding.searchView.query.toString())
            } else {
                binding.refreshRecycler.isRefreshing = false
            }
        }
        binding.recyclerView.adapter = adapter
    }

    private fun initSearchView() {
        binding.searchView.setOnQueryTextListener(handleSearch())
        binding.searchView.setOnCloseListener(handleSearchClose())
    }

    private fun handleSearch(): SearchView.OnQueryTextListener {
        return object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    if(query.length >= MIN_SEARCH_CHARACTERS) {
                        viewModel.performSearch(query)
                    }
                }
                hideKeyboard()
                return true
            }

            override fun onQueryTextChange(query: String?): Boolean {
                query?.let {
                    if(query.length >= MIN_SEARCH_CHARACTERS) {
                        viewModel.performSearch(query)
                    }
                }
                return true
            }

        }
    }

    private fun handleSearchClose(): SearchView.OnCloseListener {
        return SearchView.OnCloseListener {
            viewModel.clearSearch()
            hideKeyboard()
            true
        }
    }

    //region Observers
    private fun observers() {
        isLoadingObserver()
        beerListObserver()
        onErrorObserver()
        isEmptyObserver()
    }

    private fun beerListObserver() {
        viewModel.beerList.observe(viewLifecycleOwner) {
            adapter.update(it)
        }
    }

    private fun isLoadingObserver() {
        viewModel.isLoading.observe(viewLifecycleOwner) {
            binding.refreshRecycler.isRefreshing = it
        }
    }

    private fun onErrorObserver() {
        viewModel.onError.observe(viewLifecycleOwner) { onError ->
            if (onError == true) {
                hideKeyboard()
                if (!viewModel.onErrorMessage.value.isNullOrBlank()) {
                    view?.let { view ->
                        showError(viewModel.onErrorMessage.value!!, view)
                    }
                } else {
                    view?.let { view ->
                        showError(getString(R.string.network_error), view)
                    }
                }
            }
        }
    }

    private fun isEmptyObserver() {
        viewModel.isEmpty.observe(viewLifecycleOwner) {
            when (it) {
                true -> binding.emptyPlaceholder.visibility = View.VISIBLE
                false -> binding.emptyPlaceholder.visibility = View.GONE
            }
        }
    }

    override fun onItemClicked(item: SearchBeerBean) {
        hideKeyboard()
        val action = SearchBeerFragmentDirections.actionSearchBeerFragmentToBeerDetailFragment(item)
        findNavController().navigate(action)
    }
    //endregion Observers

    companion object {
        const val MIN_SEARCH_CHARACTERS = 3
    }
}