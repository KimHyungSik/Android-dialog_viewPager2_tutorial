package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(),MyCustomDialogInterface {

    companion object{
        private const val TAG = "MainActivity로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate()")
    }

    fun onDialogClicked(view: View){
        Log.d(TAG, "MainActivity - onDialogClicked()")
        val myCustomDialog = MyCustomDialog(this, this)

        myCustomDialog.show()
    }

    override fun onSubscribeBtnClicked() {
        Log.d(TAG, "구독버튼 클릭")
        Toast.makeText(this, "구독버튼 클릭", Toast.LENGTH_SHORT).show()
    }

    override fun onLikeBtnClicked() {
        Log.d(TAG, "좋아요 버튼 클릭")
        Toast.makeText(this, "좋아요 버튼 클릭", Toast.LENGTH_SHORT).show()
    }
}