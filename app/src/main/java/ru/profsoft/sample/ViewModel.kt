package ru.profsoft.sample

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    private val repo = Repository()


    fun getData() = repo.getData().toModel()

}