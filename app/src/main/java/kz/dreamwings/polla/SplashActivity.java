package kz.dreamwings.polla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kz.dreamwings.polla.Activities.LoginActivity;
import kz.dreamwings.polla.Activities.RoleActivity;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        login = (Button)findViewById(R.id.buttonLogin);
        register = (Button)findViewById(R.id.buttonRegister);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonLogin:
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                break;
            case R.id.buttonRegister:
                startActivity(new Intent(SplashActivity.this, RoleActivity.class));
                break;
        }
    }
}
