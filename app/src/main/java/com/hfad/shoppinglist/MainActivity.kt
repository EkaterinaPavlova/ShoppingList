package com.hfad.shoppinglist

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.hfad.shoppinglist.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private var listItem: MutableList<TextView> = ArrayList()
    private var listSave: ArrayList<String>? = ArrayList()

    companion object {
        const val TEXT_REQUEST = 1

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        listItem.add(binding.textView1)
        listItem.add(binding.textView2)
        listItem.add(binding.textView3)
        listItem.add(binding.textView4)
        listItem.add(binding.textView5)
        listItem.add(binding.textView6)
        listItem.add(binding.textView7)
        listItem.add(binding.textView8)
        listItem.add(binding.textView9)
        listItem.add(binding.textView10)

        if (savedInstanceState != null) {
            listSave = savedInstanceState.getStringArrayList("save_list")
            listSave?.forEach {
                showListItem(it)
            }
        }

        binding.buttonAddItem.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, TEXT_REQUEST)
        }

        binding.buttonSearchStore.setOnClickListener {
            val shop = binding.locateStore.toString()
            val locShop = Uri.parse("geo:0,0?q=$shop")
            val intent = Intent(Intent.ACTION_VIEW, locShop)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Log.d("MainActivity", "Can't handle this!")
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val replyItem = data?.getStringExtra(SecondActivity.EXTRA_REPLY).toString()
                listSave?.add(replyItem)
                showListItem(replyItem)
            }
        }
    }

    private fun showListItem(replyItem: String) {
        listItem.forEach {
            if (it.text.isNullOrEmpty()) {
                it.text = replyItem
                return@showListItem
            }
        }
        Toast.makeText(this, "List is full!", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("save_list", listSave)
    }
}

