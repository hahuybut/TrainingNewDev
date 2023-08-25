package com.example.hahalolofake.ui.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.R
import com.example.hahalolofake.databinding.ItemLibraryBinding

class LibraryAdapter(
    private val list: ArrayList<Int>
) :
    RecyclerView.Adapter<LibraryAdapter.LibrarylViewHolder>() {

    companion object {
        val dummyData = arrayListOf(
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
            R.drawable.img_item_lib,
        )
    }

    inner class LibrarylViewHolder(val binding: ItemLibraryBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LibraryAdapter.LibrarylViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemLibraryBinding.inflate(layoutInflater, parent, false)
        return LibrarylViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LibrarylViewHolder, position: Int) {
        val itemImage = list[position]
        holder.binding.itemLibImg.setImageResource(itemImage)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}