package com.example.tugaslyout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LinearLayout extends AppCompatActivity {

    EditText Kepada, Subject, Pesan;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

       Kepada = findViewById(R.id.btn_to);
       Subject = findViewById(R.id.btn_subject);
       Pesan = findViewById(R.id.btn_message);
       Submit = findViewById(R.id.btn_send);




    }

    public void actionLinLayout(View view) {
        Toast.makeText(this, "Sedang mengirim", Toast.LENGTH_SHORT).show();
    }
}