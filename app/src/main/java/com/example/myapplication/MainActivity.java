package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View logoutButton = null;
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Add code to handle logout
                // This could involve clearing the user's session data and then redirecting to the LoginActivity

                Intent intent = new Intent(MainActivity.this, LogoutActivity.class);
                startActivity(intent);
                finish();  // This call is optional, it terminates the current activity
            }
        });
    }
}