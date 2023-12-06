package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var edit: EditText
    private lateinit var btn: Button
    private lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit = findViewById(R.id.EditText)
        btn = findViewById(R.id.button)
        res = findViewById(R.id.textView)

        btn.setOnClickListener {
            val num = edit.text.toString()
            var i = 1
            var sum = 0
            if (num == "") {
                res.text = getString(R.string.not_correct)
                return@setOnClickListener
            }
            while (num.length - i > -1){
                var a = num[num.length - i] - '0'
                if (i % 2 == 0){
                    a *= 2
                    if (a > 9) a -= 9
                }
                sum += a
                i++
            }
            if (sum % 10 == 0) res.text = getString(R.string.correсt)
            else res.text = getString(R.string.not_correct)
        }
    }
}