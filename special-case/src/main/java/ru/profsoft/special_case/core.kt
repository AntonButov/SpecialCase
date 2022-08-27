package ru.profsoft.special_case

import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible

fun <T>TextView.set(specialCase: SpecialCase<T>) {
    with(specialCase)
    text = specialCase.value.toString()
}

fun <T>TextView.setWithDefaultValue(specialCase: SpecialCase<T>) {
    isVisible = true
    text = specialCase.value.toString()
}

private fun <T> View.with(specialCase: SpecialCase<T>) {
    isVisible = specialCase.isShow
}

fun String?.toSpecialCase(defaultValue: String = "") =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )

fun Double?.toSpecialCase(defaultValue: Double = Double.NaN) =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )

fun <R,T> SpecialCase<T>.map(block: (T) -> R) =
    SpecialCase(
        value = block(if (isShow) this.value!! else this.defaultValue),
        this.defaultValue
    )