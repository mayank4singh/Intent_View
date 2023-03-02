package com.example.intent_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText);
    }

    public  void mainactivity(View view){
        String a = editText.getText().toString();

        if(a.length() ==0){
            editText.setError("Enter Text");
        }
        else{
            Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            intent.putExtra("name",a);
            startActivity(intent);
        }
    }
}