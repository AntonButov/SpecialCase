package ru.profsoft.special_case

import android.view.View
import android.widget.TextView
import org.junit.Test
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.*

class CoreTests {

    private val nullString
    get() = (null as String?)

    private val stringValue
    get() = "String"

    @Test
    fun constructorNull() {
        val specialCase = nullString.toSpecialCase()
        assertFalse(specialCase.isShow)
    }

    @Test
    fun constructorNotNull() {
        val specialCase = stringValue.toSpecialCase()
        assertTrue(specialCase.isShow)
        }

    @Test
    fun mapType() {
        val specialCase = nullString.toSpecialCase(defaultValue = "defaultString")
        val mapCase = specialCase.map { it + "newValue" }
        assertNull(mapCase.value)
        assertEquals(mapCase.defaultValue,  "defaultString" + "newValue")
    }

    @Test
    fun mapNotNull() {
        val specialCase = stringValue.toSpecialCase()
        val mapCase = specialCase.map { it.length }
        assertEquals(mapCase.value, stringValue.length)
        assertTrue(mapCase.isShow)
    }

    @Test
    fun mapNull() {
        val defaultString = "defaultString"
        val specialCase = nullString.toSpecialCase(defaultString)
        val mapCase = specialCase.map { it.length }
        assertEquals(mapCase.defaultValue, defaultString.length)
        assertFalse(specialCase.isShow)
    }

    @Test
    fun setNotNull() {
        val specialCase = stringValue.toSpecialCase()
        val textView = mockk<TextView>(relaxed = true)
        textView.set(specialCase)
        verify { textView.visibility = View.VISIBLE }
    }

    @Test
    fun setNull() {
        val specialCase = nullString.toSpecialCase()
        val textView = mockk<TextView>(relaxed = true)
        textView.set(specialCase)
        verify { textView.visibility = View.GONE }
    }

}