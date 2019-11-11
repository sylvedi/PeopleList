package com.example.peoplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btn_sortABC, btn_sortAGE, btn_add;
    ListView lv_friendsList;

    PersonAdapter adapter;

    MyFriends myFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add);
        btn_sortABC = findViewById(R.id.btn_sortABC);
        btn_sortAGE = findViewById(R.id.btn_sortAGE);
        lv_friendsList = findViewById(R.id.lv_friendsList);

        myFriends = new MyFriends();

        adapter = new PersonAdapter(MainActivity.this, myFriends);

        lv_friendsList.setAdapter(adapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NewPersonForm.class);
                startActivity(i);
            }
        });
    }
}
