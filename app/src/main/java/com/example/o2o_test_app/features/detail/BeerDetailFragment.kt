package com.example.o2o_test_app.features.detail

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.o2o_test_app.R
import com.example.o2o_test_app.databinding.DialogBigImageBinding
import com.example.o2o_test_app.databinding.FragmentBeerDetailBinding
import com.example.o2o_test_app.models.view.BeerBean
import com.example.o2o_test_app.setup.BaseFragment
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject

class BeerDetailFragment: BaseFragment() {
    //region Vars
    private lateinit var binding: FragmentBeerDetailBinding
    private val viewModel: BeerDetailViewModel by inject()

    private val selectedBeer by lazy {
        arguments?.let {
            BeerDetailFragmentArgs.fromBundle(it).selectedBeer
        }
    }
    //endregion Vars

    //region Override Methods
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBeerDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViewModel()
        fillUI()
        onImageClickListener()
        beerObserver()
    }
    //endregion Override Methods

    //region Methods
    private fun beerObserver() {
        viewModel.beerItem.observe(viewLifecycleOwner) {
            fillOnlineUI(it)
        }
    }

    private fun setupViewModel() {
        selectedBeer?.let {
            viewModel.getBeer(it.id)
        }
    }

    private fun fillUI() {
        binding.titleBeer.text = selectedBeer?.name
        Picasso.get()
            .load(selectedBeer?.imageUrl ?: getString(R.string.image_beer_placeholder_url))
            .placeholder(R.drawable.ic_launcher_foreground).into(binding.imageBeer)
    }

    private fun fillOnlineUI(beerItem: BeerBean) {
        binding.textAbvBeer.text = beerItem.abv
        binding.textTaglineBeer.text = beerItem.tagline
        binding.textDescriptionBeer.text = beerItem.description
        beerItem.foodPairing.forEach { food ->
            binding.linearFoodPairings.addView(TextView(context).apply{ text = food})
        }
    }

    private fun onImageClickListener() {
        binding.imageBeer.setOnLongClickListener {
            showDialogBigImage()
            true
        }
    }

    private fun showDialogBigImage() {
        context?.let {
            Dialog(it).apply {
                val bind = DialogBigImageBinding.inflate(layoutInflater)
                setCancelable(true)
                setContentView(R.layout.dialog_big_image)

                val urlImage = selectedBeer?.imageUrl ?: getString(R.string.image_beer_placeholder_url)
                Picasso.get().load(urlImage).into(bind.imageBig)

                window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                show()
            }
        }
    }
    //endregion Methods

}