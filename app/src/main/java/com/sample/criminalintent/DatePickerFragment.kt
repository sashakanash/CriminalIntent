package com.sample.criminalintent

import android.app.DatePickerDialog
import android.app.Dialog
import java.util.Calendar
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DatePickerFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val initialDay = calendar.get(Calendar.DAY_OF_MONTH)
        val initialMonth = calendar.get(Calendar.MONTH)
        val initialYear = calendar.get(Calendar.YEAR)
        return DatePickerDialog(
            requireContext(),
            null,
            initialYear,
            initialMonth,
            initialDay
        )
    }
}