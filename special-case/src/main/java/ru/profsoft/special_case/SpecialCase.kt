package ru.profsoft.special_case

data class  SpecialCase<out T: Any>(
    val value: T?,
    val defaultValue: T
    ) {
    val isShow: Boolean = value != null
}
