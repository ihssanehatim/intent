package com.example.intent_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button submit ;
    private ImageButton prev ;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = getInfo();
                text = (TextView) findViewById(R.id.res);
                    text.setText("Dmax = " + String.valueOf(result)+" bit/s");
            }
        });
        prev = (ImageButton) findViewById(R.id.Prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tView.setText("You Clicked On Button");
                openActivityParent();
            }
        });

    }
    public double getInfo()
    {
        EditText bandep = (EditText) findViewById(R.id.p);
        EditText Val = (EditText) findViewById(R.id.Val);
        final  double b =Double.valueOf(bandep.getText().toString());
        final  double v = Double.valueOf(Val.getText().toString());
        return (2*b*(Math.log(v)/Math.log(2)));
    }
    public void openActivityParent()
    {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
