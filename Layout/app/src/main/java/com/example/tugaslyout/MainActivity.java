package com.example.tugaslyout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionLinLayout(View view) {
            Intent intent = new Intent(MainActivity.this, LinearLayout.class );
            startActivity(intent);
        }


    public void actionRenLayout(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeLayout.class );
        startActivity(intent);
    }

    public void CenLayout(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintLayout.class );
        startActivity(intent);
    }

    public void actionframe(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayout.class );
        startActivity(intent);
    }

    public void actiontabel(View view) {
        Intent intent = new Intent(MainActivity.this, TabelLayout.class );
        startActivity(intent);
    }

    public void actionDesign(View view) {
        Intent intent = new Intent(MainActivity.this, MaterialDesign.class );
        startActivity(intent);
    }
}
