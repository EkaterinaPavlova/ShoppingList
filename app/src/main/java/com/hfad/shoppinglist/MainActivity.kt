package com.hfad.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hfad.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    companion object {
        const val TEXT_REQUEST = 1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.buttonAddItem.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, TEXT_REQUEST)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                val replyItem = data?.getStringExtra(SecondActivity.EXTRA_REPLY)
                binding.textView1.text = replyItem

            }
        }
    }
}