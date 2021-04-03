package com.example.tugaslyout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity
{
    private DatePickerDialog dataPickerDialog;
    private Spinner dateSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

    }

    public void actionRenLayout(View view) {
        Toast.makeText(this, "Sedang mengirim", Toast.LENGTH_SHORT).show();
    }
}