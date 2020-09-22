package com.test.app.main.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.app.R
import com.test.app.main.home.model.News
import kotlinx.android.synthetic.main.item_whats_new.view.*
import kotlinx.android.synthetic.main.item_whats_new.view.image

class NewsAdapter() : RecyclerView.Adapter<NewsAdapter.DataViewHolder>() {

    var onClickListener: ((position: Int, news: News) -> Unit)? = null
    var data: List<News> = listOf()

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(news: News) {
            itemView.apply {
                image.setImageResource(news.image)
                title_1.text = news.title
                title_2.text = news.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_whats_new, parent,
                false
            )
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClickListener?.invoke(position, item)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}