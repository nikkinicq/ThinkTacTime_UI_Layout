package com.fernandez.thinktactime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class TopicActivity extends AppCompatActivity {

    ImageButton btn_Clock;
    ImageButton btn_Topic;
    ImageButton btn_Text;
    ImageButton btn_WallPaper;
    Button btn_Alarms;
    Button btn_Edit;
    Button btn_Delete;
    Button showMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(TopicActivity.this, android.R.layout.simple_list_item_1, getResources()
                .getStringArray(R.array.topics));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }

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
}
