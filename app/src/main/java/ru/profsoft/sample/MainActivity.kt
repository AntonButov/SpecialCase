package ru.profsoft.sample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import ru.profsoft.special_case.With
import androidx.compose.material.Text
import ru.profsoft.special_case.set

class MainActivity : ComponentActivity() {

    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View
        //   setContentView(R.layout.activity_main)
        //  viewModel.getData().also { uiModel ->
        //      val tvFirst = findViewById<TextView>(R.id.tvFirst)
        //       tvFirst.set(uiModel.title)
        //        val tvSecond = findViewById<TextView>(R.id.tvSecond)
        //       tvSecond.set(uiModel.count)
        //   }

        //Compose
        setContent {
            MaterialTheme {
                viewModel.getData().also { uiModel ->
                    with(uiModel) {
                        title.With {
                            Text(
                                text = it
                            )
                        }
                        count.With {
                            Text(
                                text = it
                            )
                        }
                    }
                }
            }
        }
    }
}