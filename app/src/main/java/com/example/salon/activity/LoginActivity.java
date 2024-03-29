package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.salon.R;


public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginFunction();
    }
    //Логин функциясы
    private void  loginFunction(){
        email = findViewById(R.id.email_login);
        password = findViewById(R.id.login_password);
        Button btnLogin = findViewById(R.id.btn_login);
        Button btnRegistration = findViewById(R.id.btn_regi);

        btnLogin.setOnClickListener(v -> {
            String mEmail = email.getText().toString().trim();
            String pass = password.getText().toString().trim();
            boolean hasError= false;
            if(TextUtils.isEmpty(mEmail)){
                email.setError("fill in the field");
                hasError =true;
            }
            if(TextUtils.isEmpty(pass)){
                password.setError("fill in the field");
                hasError =true;
            }
            if(hasError){return;}

            ProgressDialog mDialog = new ProgressDialog(LoginActivity.this);
            mDialog.setMessage("In process..");
            mDialog.show();

            //Имитация проверки юзера на подлинность
            boolean loginSuccessful = true;

            if(loginSuccessful){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
                mDialog.dismiss();
            } else {
                mDialog.dismiss();
                Toast.makeText(getApplicationContext(),"Login failed. Please check your credentials",Toast.LENGTH_SHORT).show();
            }

        });
        btnRegistration.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), RegistrationActivity.class)));

    }
}