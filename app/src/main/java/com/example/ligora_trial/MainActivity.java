package com.example.ligora_trial;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tabLogin, tabRegister;
    private LinearLayout loginLayout, registerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLogin = findViewById(R.id.tabLogin);
        tabRegister = findViewById(R.id.tabRegister);
        loginLayout = findViewById(R.id.loginLayout);
        registerLayout = findViewById(R.id.registerLayout);

        tabLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginLayout.setVisibility(View.VISIBLE);
                registerLayout.setVisibility(View.GONE);
                tabLogin.setTextColor(getResources().getColor(R.color.purple_500));
                tabRegister.setTextColor(getResources().getColor(R.color.gray));
            }
        });

        tabRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginLayout.setVisibility(View.GONE);
                registerLayout.setVisibility(View.VISIBLE);
                tabRegister.setTextColor(getResources().getColor(R.color.purple_500));
                tabLogin.setTextColor(getResources().getColor(R.color.gray));
            }
        });
    }
}
