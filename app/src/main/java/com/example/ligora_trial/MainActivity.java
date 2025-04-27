package com.example.ligora_trial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private LinearLayout loginLayout, registerLayout;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        loginLayout = findViewById(R.id.loginLayout);
        registerLayout = findViewById(R.id.registerLayout);
        imageView = findViewById(R.id.imageView);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    loginLayout.setVisibility(View.VISIBLE);
                    registerLayout.setVisibility(View.GONE);
                    imageView.setImageResource(R.drawable.login_image);
                } else if (position == 1) {
                    loginLayout.setVisibility(View.GONE);
                    registerLayout.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.register_image);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }
            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });

        TextView textViewForgotPassword = findViewById(R.id.textViewForgotPassword);

        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OlvidarPasswordActivity.class));
            }
        });

        //Navegar a la pantalla principal
        Button buttonIniciarSesion = findViewById(R.id.buttonLogin);
        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });

    }
}
