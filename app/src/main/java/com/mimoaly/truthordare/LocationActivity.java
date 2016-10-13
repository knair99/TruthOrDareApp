package com.mimoaly.truthordare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //Set the title bar for choosing location
        Toolbar topToolbar = (Toolbar) findViewById(R.id.top_toolbar);
        setSupportActionBar(topToolbar);

    }

    //Onclick handlers for two buttons on location selection
    public void btnIndoorClick(View view) {
        MoveToGroupActivity();
    }

    public void btnOutdoorClick(View view) {
        MoveToGroupActivity();
    }

    //Move to group selection activity
    private void MoveToGroupActivity() {
        Intent groupIntent = new Intent(this, GroupActivity.class);
        startActivity(groupIntent);
    }
}
