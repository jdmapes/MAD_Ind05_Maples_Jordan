package com.example.ind_05_maples_jordan


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewAdapter(val stateList: List<State_Info>,
                private val listener: OnItemClickListener
                ) : RecyclerView.Adapter<ViewAdapter.ExampleViewHolder>() {

    inner class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener{

        val textView1: TextView = itemView.findViewById(R.id.text_view_1)
        val textView2: TextView = itemView.findViewById(R.id.text_view_2)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = bindingAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.project05_item,
        parent, false)

        return ExampleViewHolder(itemView)
    }

    // Takes the current view holder and fills it with the data of the item in our current data set
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = stateList[position]

        holder.textView1.text = currentItem.stateName
        holder.textView2.text = currentItem.nickName

    }

    // Recycler View needs to know how many items are in our list
    override fun getItemCount(): Int {
        return stateList.size
    }

}