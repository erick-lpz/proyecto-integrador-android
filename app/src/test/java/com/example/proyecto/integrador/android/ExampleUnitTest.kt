package com.example.proyecto.integrador.android

import org.junit.Assert.assertEquals
import org.junit.Test
import viewmodel.MainViewModel

class MainViewModelTest {
    @Test
    fun compare_sameStrings_returnsEqual() {
        val viewModel = MainViewModel()
        viewModel.compare("test", "test")
        assertEquals("Las cadenas son iguales", viewModel.result)
    }

    @Test
    fun compare_differentStrings_returnsDifferent() {
        val viewModel = MainViewModel()
        viewModel.compare("test", "different")
        assertEquals("Las cadenas son diferentes", viewModel.result)
    }
}
