package ru.profsoft.sample

import ru.profsoft.special_case.SpecialCase

data class Model(
    val nullableString: SpecialCase<String>,
    val noNullableDouble: SpecialCase<Double>
)
