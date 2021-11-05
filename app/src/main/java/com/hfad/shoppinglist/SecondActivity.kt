package com.hfad.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hfad.shoppinglist.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    companion object {
        const val EXTRA_REPLY = "extra_reply"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.button1.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button1.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button2.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button2.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button3.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button3.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button4.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button4.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button5.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button5.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button6.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button6.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button7.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button7.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button8.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button8.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button9.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button9.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

        binding.button10.setOnClickListener{
            val replyIntent = Intent()
            val replyItem = binding.button10.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, replyItem)
            setResult(RESULT_OK, replyIntent)
            finish()
        }

    }
}