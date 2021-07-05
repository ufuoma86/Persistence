package com.ufuoma.persistence

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ufuoma.persistence.databinding.ShoppingItemBinding

class ShoppingAdapter(myShoppingList: MutableList<ShoppingModel>) {

    class MusicAdapter(val Shopping: List<ShoppingModel>) : RecyclerView.Adapter<ShoppingAdapter.>() {

        class ShoppingViewHolder(val binding: ShoppingItemBinding): RecyclerView.ViewHolder(binding.root){

            fun bind(song: ShoppingModel){
                binding.category.text = shopping.category
                binding.description.text = shopping.description


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
            val binding: MusicItemBinding = MusicItemBinding.inflate(LayoutInflater.from(parent.context))
            return  MusicViewHolder(binding)
        }

        override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
            val song = songs.get(position)
            holder.bind(song)
        }

        override fun getItemCount(): Int {
            return songs.size
        }
    }
}