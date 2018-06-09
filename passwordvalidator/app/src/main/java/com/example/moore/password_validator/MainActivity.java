package com.example.moore.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText textInput;
    TextView tv;
    Button button;
    String password;
    String strength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.password);
        tv = findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password = textInput.getText().toString();

                if (validatePassword(password)) {
                    strength = "Strong";
                }
                else {
                    strength = "Password is too weak";
                }
                tv.setText(strength);
                //showToast(password);
            }
        });
    }

    public boolean validatePassword (String password) {

        boolean isUpperCase, isLowerCase, isDigitCase, length, valid, isPassword;

        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern digitCase = Pattern.compile("[0-9]");

        //if password contains lower case
        if (!lowerCase.matcher(password).find())
            isLowerCase = false;
        else
            isLowerCase = true;

        //if password contains uppercase
        if (!upperCase.matcher(password).find())
            isUpperCase = false;
        else
            isUpperCase = true;

        //if password contains numbers
        if (!digitCase.matcher(password).find())
            isDigitCase = false;
        else
            isDigitCase = true;

        //is password is less then 8 characters
        if (password.length() < 8)
            length = false;
        else
            length = true;

        //if password equals password
        if (password.equals("password"))
            isPassword = true;
        else
            isPassword = false;

        if (isLowerCase && isUpperCase && isDigitCase && length && !isPassword)
            valid = true;
        else
            valid = false;

        return valid;

    }

    /*private void showToast (String text) {
        Toast.makeText(MainActivity.this, "Copying "+text, Toast.LENGTH_SHORT).show();
    }*/
}
