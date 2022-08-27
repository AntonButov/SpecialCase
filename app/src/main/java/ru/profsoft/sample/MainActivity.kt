package ru.profsoft.sample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ru.profsoft.special_case.set

class MainActivity : AppCompatActivity() {

    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            viewModel.getData().also {
                val tvFirst = findViewById<TextView>(R.id.tvFirst)
                tvFirst.set(it.nullableString)
                val tvSecond = findViewById<TextView>(R.id.tvSecond)
                tvSecond.set(it.noNullableDouble)
            }
    }

}