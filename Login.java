package com.example.cybercomp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

// This class is the backend to the login_activity.xml file
public class Login extends AppCompatActivity{
    // Google sign in api will be attached here
    // Firebase real-time DB will be the first be initialized at this point

    // Button and EditText variable initialization
    private EditText user_email = findViewById(R.id.email);
    private EditText user_password = findViewById(R.id.password);
    private Button login_button = findViewById(R.id.btnLogin);
    private Button registration_button = findViewById(R.id.btnRegister);
    private Button google_login = findViewById(R.id.google_login);

    //Class Function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //Firebase note to indicate that the connection was successful
        // Remove comment on below code once DB has been setup
        //Toast.makeText(Login.this, "Firebase Connection Success", Toast.LENGTH_LONG).show();

        // Function of the button login_button
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What actually happens when this button is clicked
                homeScreenButton();
            }
        });

        // Function of the google_login button
        google_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                googleAPIButton();
            }
        });

        //Registration Button
        registration_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrationButton();
            }
        });

    }

    protected void registrationButton() {
        //Calls the Registration Screen
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    protected void homeScreenButton() {
        // will lead to the application home_screen_activty.xml
        // uncomment code below when HomeScreen.java has been created in the project
        //Intent intent = new Intent(this, HomeScreen.class);
        //startActivity(intent);
    }

    // Google Login API Connection
    protected void googleAPIButton() {
        // google login API connection sourcecode
    }

}
