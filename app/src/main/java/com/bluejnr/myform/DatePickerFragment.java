package com.bluejnr.myform;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    TextInputEditText editTextBirthday;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, this, year, month, day);
        dpd.setTitle("Set date             Fecha Nacimiento");
        return dpd;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        editTextBirthday = (TextInputEditText) getActivity().findViewById(R.id.editTextBirthday);
        String stringOfDate = day + "/" + month + "/" + year;
        editTextBirthday.setText(stringOfDate);
    }
}