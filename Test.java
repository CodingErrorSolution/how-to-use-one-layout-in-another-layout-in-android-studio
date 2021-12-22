package com.bhaskar.doorstep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);


        LinearLayout parent = findViewById(R.id.activity_parent);        //parent layout.
        View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.child_view,parent,false);

        parent.addView(childView);



        Button predict = (Button) findViewById(R.id.mat_button);


        TextView invisible_text = (TextView) findViewById(R.id.invisible_text);



        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                invisible_text.setText("child clicked");
                //Toggle between visible and invisible on btn click
                invisible_text.setVisibility(invisible_text.getVisibility()==View.VISIBLE?View.INVISIBLE:View.VISIBLE);
            }
        });
    }





}