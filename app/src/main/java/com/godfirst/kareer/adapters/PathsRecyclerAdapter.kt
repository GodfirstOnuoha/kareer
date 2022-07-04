package com.godfirst.kareer.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.godfirst.kareer.R
import com.godfirst.kareer.models.Paths
import com.godfirst.kareer.ui.PathsFragmentDirections

class PathsRecyclerAdapter(private val pathsList: List<Paths>) :
    RecyclerView.Adapter<PathsRecyclerAdapter.PathsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PathsViewHolder {
        return PathsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.paths_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PathsViewHolder, position: Int) {
        val paths = pathsList[position]
        holder.bind(paths)
    }

    override fun getItemCount(): Int = pathsList.size

    class PathsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val pathsText: TextView = itemView.findViewById(R.id.paths_text)
        private val pathsButton: Button = itemView.findViewById(R.id.paths_button)

        fun bind(path: Paths) {
            pathsText.text = path.name
            pathsButton.setOnClickListener {
                val action = PathsFragmentDirections.actionPathsFragmentToDetailsFragment(path)
                it.findNavController().navigate(action)
            }
        }
    }
}