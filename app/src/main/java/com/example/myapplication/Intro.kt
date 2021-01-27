package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_intro.*

class Intro : AppCompatActivity() {

    companion object{
        private const val TAG = "Intro로그"
    }

    //데이터 준비
    private var pageItemList = ArrayList<PageItem>()
    private lateinit var myViewPagerRecyclerAdpter: MyViewPagerRecyclerAdpter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Log.d(TAG, "Intro - onCreate()")

        next_btn.setOnClickListener{
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem + 1
        }
        previous_btn.setOnClickListener{
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem - 1
        }
        // 데이터 배열 준비
        pageItemList.add(PageItem(R.color.colorOrange, R.drawable.ic_pager_item_1, "첫 번째 아이템"))
        pageItemList.add(PageItem(R.color.colorWhite, R.drawable.ic_pager_item_2, "두 번째 아이템"))
        pageItemList.add(PageItem(R.color.colorBlue, R.drawable.ic_pager_item_3, "세 번째 아이템"))

        // 어답터 인스턴스 생성
        myViewPagerRecyclerAdpter = MyViewPagerRecyclerAdpter(pageItemList)

        my_intro_view_pager.apply{
            adapter = myViewPagerRecyclerAdpter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            worm_dots_indicator.setViewPager2(this)
        }
    }
}