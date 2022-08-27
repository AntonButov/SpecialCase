package ru.profsoft.sample

import ru.profsoft.special_case.toSpecialCase


data class Response(
    val nullableString: String?,
    val noNullableDouble: Double?
    ) {
    fun toModel() = Model(
        nullableString = nullableString.toSpecialCase(),
        noNullableDouble = noNullableDouble.toSpecialCase()
    )

}
