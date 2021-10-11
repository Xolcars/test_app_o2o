package com.example.o2o_test_app.features.search

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.o2o_test_app.R
import com.example.o2o_test_app.databinding.CellBeerItemBinding
import com.example.o2o_test_app.models.view.SearchBeerBean
import com.squareup.picasso.Picasso

class SearchBeerAdapter(
    private val context: Context,
    private var list: MutableList<SearchBeerBean>,
    private val listener: OnItemListDelegate
) : RecyclerView.Adapter<SearchBeerAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.cell_beer_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item) {
            listener.onItemClicked(item)
        }
    }

    interface OnItemListDelegate {
        fun onItemClicked(item: SearchBeerBean)
    }

    fun update(data: MutableList<SearchBeerBean>) {
        list = data
        notifyDataSetChanged()
    }

    //region ViewHolder
    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        private val binding = CellBeerItemBinding.bind(view)
        private lateinit var item: SearchBeerBean
        private lateinit var listener: (SearchBeerBean) -> Unit

        init {
            view.setOnClickListener {
                listener(this.item)
            }
        }

        fun bind(item: SearchBeerBean, listener: (SearchBeerBean) -> Unit) {
            this.item = item
            this.listener = listener

            fillCellView()
        }

        @SuppressLint("StringFormatInvalid")
        private fun fillCellView() {
            binding.textName.text = item.name
            if (item.firstBrewed.isNotBlank()) {
                binding.textFirstBrewed.text = item.firstBrewed
            } else {
                binding.textFirstBrewed.text = ""
            }
            Picasso.get().load(item.imageUrl).placeholder(R.drawable.ic_launcher_foreground).into(binding.imageView)
        }
    }
    //endregion ViewHolder
}