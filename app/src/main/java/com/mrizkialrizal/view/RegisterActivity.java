package com.mrizkialrizal.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mrizkialrizal.R;
import com.mrizkialrizal.presenter.RegisterPresenter;
/*
Nim  : 10116301
Nama : Muhammad Rizki Alrizal
Kelas: IF 7
Waktu: 15/08/19
*/

public class RegisterActivity extends AppCompatActivity {
    private EditText inputName,inputEmail,inputPassword,inputRepassword;
    private Button btnRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        inputName = (EditText) findViewById(R.id.input_name);
        inputEmail = (EditText) findViewById(R.id.input_email);
        inputPassword = (EditText) findViewById(R.id.input_password);
        inputRepassword = (EditText) findViewById(R.id.input_repassword);
        btnRegister = (Button) findViewById(R.id.btn_register);

        final RegisterPresenter registerPresenter = new RegisterPresenter();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerPresenter.btnRegisterClicked(
                        getBaseContext(),
                        inputName,
                        inputEmail,
                        inputPassword,
                        inputRepassword
                );
            }
        });
    }
}
