package net.prasetyomuhdwi.quizapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXT_NAME = "extra_nama";
    public static final String EXT_EMAIL = "extra_email";
    public static final String EXT_PHONE = "extra_phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText inputName = (EditText) findViewById(R.id.idInputName);
        EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.idInputPhone);
        EditText inputPassword = (EditText) findViewById(R.id.idInputPwd);

        Button btnSave = (Button) findViewById(R.id.idBtnSave);
        btnSave.setOnClickListener(v -> {
            Intent loginIntent = new Intent(MainActivity.this,DashboardActivity.class);
            loginIntent.putExtra(EXT_NAME, inputName.getText().toString());
            loginIntent.putExtra(EXT_EMAIL, inputEmail.getText().toString());
            loginIntent.putExtra(EXT_PHONE, inputPhone.getText().toString());
            startActivity(loginIntent);
        });
    }
}