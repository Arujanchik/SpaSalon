package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class RegistrationActivity extends AppCompatActivity {
    private EditText userNameForWorker;
    private EditText emailReg;
    private EditText passReg;
    private EditText passReg2;

    //Progress dialog
    private ProgressDialog mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_activity);

        mDialog = new ProgressDialog(this);

        registration();
    }

    private void registration() {
        userNameForWorker = findViewById(R.id.username_registration_for_worker);
        emailReg = findViewById(R.id.email_registration);
        passReg = findViewById(R.id.registration_password);
        passReg2 = findViewById(R.id.registration_password_2);

        //Текст для перехода в MainActivity (для логина)
        TextView textViewForLogin = findViewById(R.id.textView_for_login);
        textViewForLogin.setOnClickListener(v -> {
            // Здесь выполните переход на страницу mainActivity для логина
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        Button btnReg = findViewById(R.id.btn_registration_onRegistration);
        btnReg.setOnClickListener(v -> {
            // Получить данные работника
            String userName = userNameForWorker.getText().toString().trim();
            String email = emailReg.getText().toString().trim();
            String pass = passReg.getText().toString().trim();
            String pass2 = passReg2.getText().toString().trim();

            if (TextUtils.isEmpty(userName)) {
                userNameForWorker.setError("fill in the field...");
                return;
            }
            // Проверить все поля на заполнение
            if (TextUtils.isEmpty(email)) {
                emailReg.setError("fill in the field...");
                return;
            }

            // Проверить правильность формата email
            if (!isValidEmail(email)) {
                emailReg.setError("Invalid email format");
                return;
            }

            if (TextUtils.isEmpty(pass)) {
                passReg.setError("fill in the field...");
                return;
            }
            if (TextUtils.isEmpty(pass2)) {
                passReg2.setError("fill in the field...");
                return;
            }

            //Проверка на сходство паролей
            if (!pass.equals(pass2)) {Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_SHORT).show();return;}
            // Проверить, что fileUriString имеет значение

            //Установка всплывающего окна которая будет показывать пользователю что нужно ждать
            mDialog.setMessage("In process...");
            mDialog.show();
        });

    }
    // Метод для проверки правильности формата email
    private boolean isValidEmail(CharSequence email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


}