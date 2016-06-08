package com.example.satya.timepiker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class dialog extends AppCompatActivity {
    int hour, minuteA;
    Button btnShowTimeDialog;
    final static int DialogId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        showTimeDialog();
    }

    public void showTimeDialog() {
        btnShowTimeDialog = (Button) findViewById(R.id.btnShowTimeDialog);
        btnShowTimeDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DialogId);
            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id)
    {
        if (id==DialogId)
        {
            return new TimePickerDialog(this,timePickerListener, hour,minuteA,false);
        }
        else
        {
            return null;
        }
    }

    protected TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener()
    {
         public void onTimeSet(TimePicker view,int hourOfDay, int minute)
        {
                hour = hourOfDay;
                minuteA = minute;

                Toast.makeText(dialog.this, hour+ " : " + minuteA, Toast.LENGTH_LONG).show();
        }
    };
}

