package com.amervyn.addnameandsavedata.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var editTextName = ""
    private var result = ""

    fun addNames(value: String) {
        this.editTextName = value
        result += value + "\n"
    }

    fun getResult(): String {
        return result
    }
}