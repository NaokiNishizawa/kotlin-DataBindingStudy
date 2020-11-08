package com.example.databindingstudy

import android.widget.EditText
import android.widget.TextView

class LayoutObject {
    fun doIt(edit: EditText, vm: TextView) {
        val num = edit.text.toString().toInt()
        var total = 0
        for(n in 1..num) {
            total += n
        }

        vm.text = "total: $total"
    }
}