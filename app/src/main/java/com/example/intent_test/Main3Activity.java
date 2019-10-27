package com.example.intent_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private Button sub; /// submit
    private ImageButton prev; /// previous
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sub = (Button) findViewById(R.id.submit);
        prev = (ImageButton) findViewById(R.id.prev);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double res = getInfo();
                t = (TextView) findViewById(R.id.res);
                t.setText("C = " + String.valueOf(res)+" bit/s");
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityParent();
            }
        });
    }
    public double getInfo()
    {
        EditText b = (EditText) findViewById(R.id.bande);
        EditText pspn = (EditText) findViewById(R.id.ps_pn);
        final double BandeP, Ps_Pn;
        BandeP = Double.valueOf(b.getText().toString());
        Ps_Pn = Double.valueOf(pspn.getText().toString());
        return  (BandeP *( Math.log(  1 + Ps_Pn )/Math.log(2)));
    }
    public void goToActivityParent()
    {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
