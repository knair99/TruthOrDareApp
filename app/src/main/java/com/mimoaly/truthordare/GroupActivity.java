package com.mimoaly.truthordare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
    }

    public void btnAcquaintanceClick(View view) {
        MoveToPlayerActivity();
    }

    public void btnFriendsClick(View view) {
        MoveToPlayerActivity();
    }

    public void btnFamilyClick(View view) {
        MoveToPlayerActivity();
    }

    public void btnCoupleClick(View view) {
        MoveToPlayerActivity();
    }

    private void MoveToPlayerActivity() {
        Intent playerIntent = new Intent(this, PlayerActivity.class);
        startActivity(playerIntent);
    }
}
