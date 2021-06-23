package com.example.freecodecamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.freecodecamp.utills.utills;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText=findViewById(R.id.type);

    }

    public void clicktochange(View view) {
        TextView textView=findViewById(R.id.view);
        textView.setText("Hello " + editText.getText().toString());
        editText.setText(" ");
        utills.dissmiss();
    }


    public void ettext(View view) {
        utills.showDialog(this);
    }

}