package ru.profsoft.special_case

import android.widget.TextView
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class coreTests {

    val nullCase
    get() = (null as String?)

    val notNullCase
    get() = "String"

    @Test
    fun constructorNull() {
        val specialCase = nullCase.toSpecialCase()
        assertFalse(specialCase.isShow)
    }

    @Test
    fun constructorNotNull() {
        val specialCase = notNullCase.toSpecialCase()
        assertTrue(specialCase.isShow)
        }

    @Test
    fun set() {
       //al textView = TextView()
       // assertEquals(4, 2 + 2)
    }

    @Test
    fun mapNotNull() {
        val specialCase = notNullCase.toSpecialCase()
        val mapCase = specialCase.map { it.length }
        assertEquals(mapCase.value, notNullCase.length)
        assertTrue(mapCase.isShow)
    }

    @Test
    fun mapNull() {
        val defaultString = "defaultString"
        val specialCase = nullCase.toSpecialCase(defaultString)
        val mapCase = specialCase.map { it.length }
        assertEquals(mapCase.value, defaultString.length)
        assertFalse(specialCase.isShow)
    }
}