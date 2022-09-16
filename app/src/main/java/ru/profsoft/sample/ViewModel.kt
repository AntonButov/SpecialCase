package ru.profsoft.sample

import androidx.lifecycle.ViewModel
import ru.profsoft.special_case.map

class ViewModel : ViewModel() {

    private val repo = Repository()

    fun getData(): UiModel = repo
        .getData()
        .mapToUiModel()
}