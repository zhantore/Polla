package kz.dreamwings.polla.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import kz.dreamwings.polla.R;

public class RoleActivity extends AppCompatActivity implements View.OnClickListener {

    Button eduCenter, student, teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Выберите роль");
        eduCenter = (Button)findViewById(R.id.buttonEduCenter);
        student = (Button)findViewById(R.id.buttonStudent);
        teacher = (Button)findViewById(R.id.buttonTeacher);
        eduCenter.setOnClickListener(this);
        student.setOnClickListener(this);
        teacher.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonEduCenter:
                startActivity(new Intent(RoleActivity.this, RegistrationActivity.class));
                finish();
                break;
            case R.id.buttonStudent:
                startActivity(new Intent(RoleActivity.this, RegistrationActivity.class));
                finish();
                break;
            case R.id.buttonTeacher:
                startActivity(new Intent(RoleActivity.this, RegistrationActivity.class));
                finish();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
