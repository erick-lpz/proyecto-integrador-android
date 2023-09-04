package viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var result by mutableStateOf("")

    fun compare(text1: String, text2: String) {
        result = if (text1 == text2) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}