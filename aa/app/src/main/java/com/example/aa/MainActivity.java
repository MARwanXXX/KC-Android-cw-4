package com.example.aa;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = findViewById(R.id.layout);
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView calculator = findViewById(R.id.calculator);
        TextView total = findViewById(R.id.total);
        Button button = findViewById(R.id.button);
        final ImageButton[] dark = {findViewById(R.id.dark)};

        final int[] on = {0};


      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              int num1 = Integer.parseInt(number1.getText().toString());
              int num2 = Integer.parseInt(number2.getText().toString());

              int totaln = num1 + num2;

              total.setText(String.valueOf(totaln));
          }
      });

       dark[0].setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               on[0]++;

               if(on[0] == 1){
                   AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                   layout.setBackgroundResource(R.drawable.black);
               }

               if(on[0] == 0 || on[0] == 2) {
                   AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                   layout.setBackgroundResource(R.drawable.wightsand);
               }

               if(on[0] == 2){

                   on[0] = 0;
               }
           }
       });
    }


}