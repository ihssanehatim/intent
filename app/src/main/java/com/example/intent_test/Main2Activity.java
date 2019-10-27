package com.example.intent_test;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_test.MainActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import static android.app.PendingIntent.getActivity;


//import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    // Button btn = (Button) findViewById(R.id.button);;
    //  TextView tView;
    private Button valence,capacity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         valence = (Button) findViewById(R.id.valence);

        //  calculate.setOnClickListener(btnListener);
        valence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tView.setText("You Clicked On Button");
            openActivityValence();
            }
        });
        capacity = (Button) findViewById(R.id.capacity);
        capacity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAcitvityCapacity();
            }
        });

    }

    public void openActivityValence() {

        Intent i  = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void goToAcitvityCapacity()
    {
        Intent i  = new Intent(this,Main3Activity.class);
        startActivity(i);
    }
}