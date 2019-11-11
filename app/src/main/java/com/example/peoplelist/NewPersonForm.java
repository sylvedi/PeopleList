package com.example.peoplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewPersonForm extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    EditText et_picturenumber, et_name, et_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_person_form);

        btn_ok = findViewById(R.id.btn_ok);
        btn_cancel = findViewById(R.id.btn_cancel);
        et_picturenumber = findViewById(R.id.et_picturenumber);
        et_age = findViewById(R.id.et_age);
        et_name = findViewById(R.id.et_name);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get string from et_view objects
                String newName = et_name.getText().toString();
                String newAge = et_age.getText().toString();
                String newPictureNumber = et_picturenumber.getText().toString();

                // put the string into a message for MainActivity

                // start main Activity again.
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
