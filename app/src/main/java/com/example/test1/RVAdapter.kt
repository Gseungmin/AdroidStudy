package com.example.test1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    //viewHolder를 통해 view를 재사용하므로 성능이 좀더 좋다
    //아이템들 하나하나 RecyclerView에 넣어주는 작업
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item : String) {
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }
    }

    //RecyclerView Item 가져오기
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }

    //itemClick 이벤트 발생을 위해 생성
    interface ItemClick {
        fun onClick(view: View, position: Int)
    }
    var itemClick : ItemClick? = null

    //viewHolder에 바인딩
    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {

        if(itemClick != null) {
            holder.itemView.setOnClickListener {
                v-> itemClick?.onClick(v, position)
            }
        }

        holder.bindItems(items[position])
    }

    //전체 RecyclerView 개수
    override fun getItemCount(): Int {
        return items.size
    }

}