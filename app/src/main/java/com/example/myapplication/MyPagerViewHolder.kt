package com.example.myapplication

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_intro_pager_item.view.*

class MyPagerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val itemImage : ImageView = itemView.pager_item_image
    private val itemContent : TextView = itemView.pager_item_text
    private val itemBackground : LinearLayout = itemView.pager_item_bg

    //데이터 바인딩
    fun bindWithView(pageItem: PageItem){
        itemImage.setImageResource(pageItem.imageSrc)
        itemContent.text = pageItem.content

        //배경색 확인
        if(pageItem.bgColor != R.color.colorWhite){
            itemContent.setTextColor(Color.WHITE)
        }
        itemBackground.setBackgroundResource(pageItem.bgColor)
    }
}