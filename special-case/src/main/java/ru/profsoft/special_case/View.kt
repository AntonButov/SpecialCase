package ru.profsoft.special_case

import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible

fun <T: Any> TextView.set(specialCase: SpecialCase<T>) {
    with(specialCase)
    text = specialCase.value.toString()
}

fun <T: Any> TextView.setWithDefaultValue(specialCase: SpecialCase<T>) {
    isVisible = true
    text = specialCase.value.toString()
}

fun <T: Any> View.with(specialCase: SpecialCase<T>) {
    isVisible = specialCase.isShow
}