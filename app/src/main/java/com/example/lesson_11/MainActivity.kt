package com.example.lesson_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_hello.setOnClickListener {
            val name = et_name.text.toString()
            val family = et_family.text.toString()
            val toast = Toast.makeText(
                this, "Привет, $name $family",
                Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0,500);
            toast.show()

        }

    }
}
