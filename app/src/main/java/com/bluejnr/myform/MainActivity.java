package com.bluejnr.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputEditText editTextName;
    TextInputEditText editTextBirthday;
    TextInputEditText editTextPhone;
    TextInputEditText editTextEmail;
    TextInputEditText editTextDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (TextInputEditText) findViewById(R.id.editTextName);
        editTextBirthday = (TextInputEditText) findViewById(R.id.editTextBirthday);
        editTextPhone = (TextInputEditText) findViewById(R.id.editTextPhone);
        editTextEmail = (TextInputEditText) findViewById(R.id.editTextEmail);
        editTextDescription = (TextInputEditText) findViewById(R.id.editTextDescription);

        editTextBirthday.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    onTextInputClicked(view);
                }
            }
        });
    }

    public void onTextInputClicked(View v){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),"Date Picker");
    }

    public void onButtonClicked(View v){
        Intent intent = new Intent(MainActivity.this, ContacDetail.class);
        intent.putExtra(getResources().getString(R.string.nameParam), editTextName.getText().toString());
        intent.putExtra(getResources().getString(R.string.birthDateParam), editTextBirthday.getText().toString());
        intent.putExtra(getResources().getString(R.string.phoneParam), editTextPhone.getText().toString());
        intent.putExtra(getResources().getString(R.string.emailParam), editTextEmail.getText().toString());
        intent.putExtra(getResources().getString(R.string.descriptionParam), editTextDescription.getText().toString());
        startActivity(intent);
    }

}