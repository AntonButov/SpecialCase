package ru.profsoft.sample

class Repository {

    fun getData(): Model =
        Response(
            nullableString = null,
            noNullableDouble = 100.toDouble()
        ).toModel()

}