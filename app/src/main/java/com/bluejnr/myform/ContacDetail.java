package com.bluejnr.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class ContacDetail extends AppCompatActivity {

    TextView textViewName;
    TextView textViewBirthDate;
    TextView textViewPhone;
    TextView textViewEmail;
    TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contac_detail);

        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewBirthDate = (TextView) findViewById(R.id.textViewBirthDate);
        textViewPhone = (TextView) findViewById(R.id.textViewPhone);
        textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewDescription = (TextView) findViewById(R.id.textViewDescription);

        Bundle params = getIntent().getExtras();
        String name = params.getString(getResources().getString(R.string.nameParam));
        String birthDate = params.getString(getResources().getString(R.string.birthDateParam));
        String phone = params.getString(getResources().getString(R.string.phoneParam));
        String email = params.getString(getResources().getString(R.string.emailParam));
        String description = params.getString(getResources().getString(R.string.descriptionParam));

        textViewName.setText(name);
        textViewBirthDate.setText(birthDate);
        textViewPhone.setText(phone);
        textViewEmail.setText(email);
        textViewDescription.setText(description);

    }

    public void onButtonClicked(View v){
        finish();
    }
}