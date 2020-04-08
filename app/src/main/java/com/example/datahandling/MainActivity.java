package com.example.datahandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uname,password;
    Button button,buttonAdd,buttonSign,buttonDelete,buttonUpdate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.uname);
        password=findViewById(R.id.password);

        button=findViewById(R.id.button);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSign=findViewById(R.id.buttonSign);
        buttonUpdate=findViewById(R.id.buttonUpdate);
        buttonDelete=findViewById(R.id.buttonDelete);
    }
}
