package umn.ac.id.week04_29272;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);
    }

    public void btnHalaman1(View view) {
        Intent intent = new Intent(ActivityTiga.this, ActivityEmpat.class);
        startActivity(intent);
    }

    public void btnHalaman2(View view) {
        Intent intent = new Intent(ActivityTiga.this, ActivityLima.class);
        startActivity(intent);
    }
}