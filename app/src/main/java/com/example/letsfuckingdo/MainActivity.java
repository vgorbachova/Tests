package com.example.letsfuckingdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btGo, btSecondActivity;
    EditText name1;
    ArrayList<String> names = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = (EditText) findViewById(R.id.name);
        btGo = (Button) findViewById(R.id.btGo);
        btGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String needName = String.valueOf(name1.getText());
                names.add(needName);
            }
        });


        btSecondActivity = (Button) findViewById(R.id.btSecondActivity);

        btSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), List.class);
                intent.putStringArrayListExtra("MY_NAMES", names);
                startActivity (intent);
            }
        });
    }
}

