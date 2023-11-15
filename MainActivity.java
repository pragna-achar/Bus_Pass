package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnStudentClicked(View view){
        Toast.makeText(this, "Hello Student!", Toast.LENGTH_LONG).show();
        Intent i=new Intent(this, new2.class);
        startActivity(i);}
}