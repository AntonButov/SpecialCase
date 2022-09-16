package ru.profsoft.sample

import ru.profsoft.special_case.SpecialCase
import ru.profsoft.special_case.map

data class Model(
    val nullableString: SpecialCase<String>,
    val noNullableDouble: SpecialCase<Double>
) {
    fun mapToUiModel() =
        UiModel(
            title = nullableString.map { "title: $it" },
            count = noNullableDouble.map { "price= $it" }
        )
}
