package com.androidpractice.viewmodelsincompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.lang.Exception
import kotlin.math.roundToInt

class DemoViewModel : ViewModel() {

    var isFarenHeit by mutableStateOf(true)
    var result by mutableStateOf("")

    fun convertTemp(temp: String) {
        result = try {
            val tempInt = temp.toInt()
            if (isFarenHeit) {
                ((tempInt - 32) * 0.5556).roundToInt().toString()
            } else {
                ((tempInt * 1.8) + 32).roundToInt().toString()
            }
        } catch (e: Exception) {
            "Invalid Entry"
        }
    }

    fun switchChange() {
        isFarenHeit = !isFarenHeit
    }


}