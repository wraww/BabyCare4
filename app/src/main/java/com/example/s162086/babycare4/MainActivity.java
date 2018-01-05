package com.example.s162086.babycare4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
        getSupportActionBar().hide();

        Button parentButton = (Button) findViewById(R.id.bp);
        parentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), TV_Chat_ParentActivity.class);
                startActivity(intent);
            }
        });

        Button childButton = (Button) findViewById(R.id.bc);
        childButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChildActivity.class);
                startActivity(intent);
            }
        });

    }
}
