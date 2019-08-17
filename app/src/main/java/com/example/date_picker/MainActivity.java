package com.example.date_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    TextView tvTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTextview = findViewById(R.id.tvTextview);


        tvTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallDialog(view);
            }
        });

    }

    public void CallDialog(View view){
        Calendar calendar=Calendar.getInstance(); //khoi tao
        int nam=calendar.get(Calendar.YEAR);  //thiet lap ngay thang nam
        int thang=calendar.get(Calendar.MONTH);  //thiet lap ngay thang nam
        int ngay=calendar.get(Calendar.DAY_OF_MONTH);  //thiet lap ngay thang nam
        DatePickerDialog dialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tvTextview.setText(view.getYear()+"/"+view.getMonth()+"/"+view.getDayOfMonth());
            }
        },nam,thang,ngay);
        dialog.show();

    }
}
