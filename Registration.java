package com.example.cybercomp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    private EditText firstName = findViewById(R.id.firstName);
    private EditText lastName = findViewById(R.id.reg_last_name);
    private EditText email = findViewById(R.id.email);
    private EditText passowrd = findViewById(R.id.password);
    private EditText re_password = findViewById(R.id.confirmPassword);
    private Button register = findViewById(R.id.register_button);
    private Button login = findViewById(R.id.login_button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_activity);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // function
                registerButton();
            }
        });
    }

    protected void registerButton(){
        String fn = firstName.getText().toString().trim();
        String ln = lastName.getText().toString().trim();
        String em = email.getText().toString().trim();
        String p = passowrd.getText().toString().trim();
        String rp = re_password.getText().toString().trim();

        // Verify User Input is not empty
        if(!TextUtils.isEmpty(fn) || !TextUtils.isEmpty(ln) || !TextUtils.isEmpty(em)
                || !TextUtils.isEmpty(p) || !TextUtils.isEmpty(rp)) {

            // Check to make sure password and confirmation password matches
            if(p.equals(rp)) {
                // Pass data as a argument to DB
                Toast.makeText(Registration.this, "Registration added to DB", Toast.LENGTH_LONG).show();

            }else {
                Toast.makeText(Registration.this, "Password does not match!", Toast.LENGTH_LONG).show();
            }
        }
    }

    protected void openLoginPage() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
