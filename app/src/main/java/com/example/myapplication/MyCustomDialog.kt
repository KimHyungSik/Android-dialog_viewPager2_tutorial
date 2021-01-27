package com.example.myapplication

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.custom_dialog.*

class MyCustomDialog(context: Context,
                     myCustomDialogInterface: MyCustomDialogInterface)
                    : Dialog(context), View.OnClickListener {

    companion object{
        private const val TAG = "MyCustomDialog로그"
    }

    private lateinit var myCustomDialogInterface : MyCustomDialogInterface

    init{
        this.myCustomDialogInterface = myCustomDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.custom_dialog)
        Log.d(TAG, "MyCustomDialog - onCreate()")

        //배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        like_btn.setOnClickListener(this)
        subscribe_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            like_btn->{
                Log.d(TAG, "좋아요 버튼 클릭")
                myCustomDialogInterface.onLikeBtnClicked()
            }
            subscribe_btn->{
                Log.d(TAG, "구독 버튼 클릭")
                myCustomDialogInterface.onSubscribeBtnClicked()
            }
        }
    }

}