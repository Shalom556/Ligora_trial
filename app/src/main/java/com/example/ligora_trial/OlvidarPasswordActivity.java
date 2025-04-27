package com.example.ligora_trial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OlvidarPasswordActivity extends AppCompatActivity {

    private Button buttonSubmit, buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidar_password);

        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to login
                startActivity(new Intent(OlvidarPasswordActivity.this, MainActivity.class));
                finish();
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OlvidarPasswordActivity.this, "Enlace de restablecimiento enviado a tu correo electrónico", Toast.LENGTH_LONG).show();
            }
        });
    }
}
