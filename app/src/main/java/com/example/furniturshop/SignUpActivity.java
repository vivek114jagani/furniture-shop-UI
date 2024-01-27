package com.example.furniturshop;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText emailEditText;
    EditText passwordEditText;
    EditText confirm_passwordEditText;
    Button continue_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameEditText = findViewById(R.id.signUp_name);
        emailEditText = findViewById(R.id.signUp_email);
        passwordEditText = findViewById(R.id.signUp_password);
        confirm_passwordEditText = findViewById(R.id.signUp_confirm_password);
        continue_btn = findViewById(R.id.singUp_continue_btn);

        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddressDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}