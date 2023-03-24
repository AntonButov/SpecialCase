package ru.profsoft.special_case

fun <R: Any, T: Any> SpecialCase<T>.map(block: (T) -> R) =
    SpecialCase(
        value = value?.let { block(it) },
        defaultValue = block(defaultValue)
    )

fun String?.toSpecialCase(defaultValue: String = "") =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )

fun Double?.toSpecialCase(defaultValue: Double = 0.toDouble()) =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )

fun Float?.toSpecialCase(defaultValue: Float = 0.toFloat()) =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )

fun Int?.toSpecialCase(defaultValue: Int = 0.toInt()) =
    SpecialCase(
        value = this,
        defaultValue = defaultValue
    )
