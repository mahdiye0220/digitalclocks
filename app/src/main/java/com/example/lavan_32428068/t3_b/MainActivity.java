package com.example.lavan_32428068.t3_b;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface fnt=Typeface.createFromAsset(getAssets(),"fonts/digital7.ttf");
        TextView tx1=(TextView)findViewById(R.id.txt1);
        tx1.setTypeface(fnt);

        TextView tx2=(TextView)findViewById(R.id.txt2);
        tx2.setTypeface(fnt);

        TextView tx3=(TextView)findViewById(R.id.txt3);
        tx3.setTypeface(fnt);

        TextView tx4=(TextView)findViewById(R.id.txt4);
        tx4.setTypeface(fnt);

        TextView tx5=(TextView)findViewById(R.id.txt5);
        tx5.setTypeface(fnt);

        TextView tx6=(TextView)findViewById(R.id.txt6);
        tx6.setTypeface(fnt);

        TextView tx7=(TextView)findViewById(R.id.txt7);
        tx7.setTypeface(fnt);
    }
}
