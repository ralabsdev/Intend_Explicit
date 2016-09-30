package com.example.rakesh.intend_explicit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;




public class AdditionalActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);
        Button b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b1.setOnLongClickListener(this);


    }
    @Override
    public boolean onLongClick(View view)
    {
        TextView textv1 = (TextView) findViewById(R.id.textv1);
        textv1.setText("Now you have just long pressed The button");

        return true;
    }
    @Override
    public void onClick(View v) {
        TextView textv1 = (TextView) findViewById(R.id.textv1);
        textv1.setText("Now Do a LongClick");
    }
}
