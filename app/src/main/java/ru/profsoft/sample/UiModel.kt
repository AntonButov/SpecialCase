package ru.profsoft.sample

import ru.profsoft.special_case.SpecialCase

data class UiModel(
  val title: SpecialCase<String>,
  val count: SpecialCase<String>
)