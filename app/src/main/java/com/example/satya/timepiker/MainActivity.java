package com.example.satya.timepiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();


    }
    public void btnDialog (View view)
    {
        Intent i = new Intent(this,dialog.class);
        startActivity(i);

    }

    public void showTime()
    {
        timePicker = (TimePicker)findViewById(R.id.timePicker);
        btnTime = (Button) findViewById(R.id.btnShow);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),timePicker.getCurrentHour() +" : "+ timePicker.getCurrentMinute(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
