package com.example.myfamilyspace.fragment

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.Calendar

class TimePickerFragmentHoraFinalCrearAtividad (val listener: (String) -> Unit): DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar : Calendar = Calendar.getInstance()
        val hour : Int = calendar.get(Calendar.HOUR_OF_DAY)
        val minute : Int = calendar.get(Calendar.MINUTE)
        val dialog = TimePickerDialog(activity as Context, this, hour, minute, false)
        return dialog
    }
    override fun onTimeSet(view: TimePicker?, hourDay: Int, minute: Int) {
        listener("$hourDay:$minute")
    }
}