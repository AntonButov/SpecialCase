package ru.profsoft.sample

class Repository {

    fun getData(): Response =
        Response(
            nullableString = null,
            noNullableDouble = 100.toDouble()
        )

}