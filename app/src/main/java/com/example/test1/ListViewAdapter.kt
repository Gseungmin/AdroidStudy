package com.example.test1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//Adapter에서 먼저 Activity로부터 데이터를 받아온다.
class ListViewAdapter(val List : MutableList<SentenceModel>) : BaseAdapter() {

    //리스트 아이템의 개수
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    //리스트의 아이템을 listview_item.xml 하나씩 넣는 작업을 하는 메소드
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1

        if (convertView == null) {
            //listview_item.xml에 있는 view를 가져오는 것
            convertView =
                LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        //아이템을 하나하나 만들때 보여질 텍스트에 대한 설정 완료
        val content = convertView!!.findViewById<TextView>(R.id.listViewItem)
        content.text = List[p0].content

        return convertView!!
    }
}