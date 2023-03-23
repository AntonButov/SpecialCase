package ru.profsoft.special_case

import androidx.compose.runtime.Composable

@Composable
fun <T: Any> SpecialCase<T>.With(
    content: @Composable (T) -> Unit
) {
    takeIf { it.isShow }?.let {
        content(it.value!!)
    }
}