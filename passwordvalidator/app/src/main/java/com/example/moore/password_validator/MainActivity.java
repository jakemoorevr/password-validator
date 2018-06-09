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

                tv.setText(validatePassword(password));
            }
        });
    }

    public String validatePassword (String password) {
        String strength;

        if (isLongEnough(password) && isntPassword(password))
            strength = "Strong";
        else
            strength = "Weak";

        return strength;

    }

    public boolean isLongEnough (String password) {
        boolean length;

        //is password is less then 8 characters
        if (password.length() < 8)
            length = false;
        else
            length = true;

        return length;
    }

    public boolean isntPassword (String password) {
        boolean isPassword;

        //if password equals password
        if (password.equalsIgnoreCase("password"))
            isPassword = false;
        else
            isPassword = true;

        return isPassword;
    }

    private void showToast (Integer count) {
        Toast.makeText(MainActivity.this, "Passed "+count+" rules.", Toast.LENGTH_SHORT).show();
    }
}