package com.fernandez.thinktactime;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class ClockActivity extends AppCompatActivity {
    ImageButton btn_Clock;
    ImageButton btn_Topic;
    ImageButton btn_Text;
    ImageButton btn_WallPaper;
    Button btn_Alarms;
    Button btn_Edit;
    Button btn_Delete;

    private static Button time;
    private static TextView set_time;
    private static final int Time_id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        time = (Button) findViewById(R.id.selecttime);
        set_time = (TextView) findViewById(R.id.set_time);

        time.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Show time dialog
                showDialog(Time_id);
            }
        });

    }

    //intent activity for frame transition
    public void callClockActivity (View view) {
        Intent intent = new Intent(this, ClockActivity.class);
        startActivity(intent);
    }

    public void callTopicActivity (View view) {
        Intent intent = new Intent(this, TopicActivity.class);
        startActivity(intent);
    }

    public void callWallPaperActivity (View view) {
        Intent intent = new Intent(this, WallpaperActivity.class);
        startActivity(intent);
    }

    public void callTextActivity (View view) {
        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }

    public void callAlarmsActivity (View view) {
        Intent intent = new Intent(this, AlarmsActivity.class);
        startActivity(intent);
    }

    protected Dialog onCreateDialog(int id) {

        // Get the calander
        Calendar c = Calendar.getInstance();

        // From calander get the year, month, day, hour, minute
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        switch (id) {
            case Time_id:

                // Open the timepicker dialog
                return new TimePickerDialog(ClockActivity.this, time_listener, hour,
                        minute, false);

        }
        return null;
    }


    TimePickerDialog.OnTimeSetListener time_listener = new TimePickerDialog.OnTimeSetListener() {

        @Override
        public void onTimeSet(TimePicker view, int hour, int minute) {
            // store the data in one string and set it to text
            String time1 = String.valueOf(hour) + ":" + String.valueOf(minute);
            set_time.setText(time1);
        }
    };
}


