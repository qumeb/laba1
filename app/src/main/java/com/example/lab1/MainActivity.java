package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView main_text;
    private TextView main_text1;

    private ImageButton imageButton;
    private ImageView main_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_text1=findViewById(R.id.textView3);
        main_text=findViewById(R.id.textView);
        main_img=findViewById(R.id.imageView2);
    }


    public void btn_click(View view) {
        if (main_text.getVisibility()==View.INVISIBLE && main_text1.getVisibility()==View.INVISIBLE){
            main_text.setVisibility(View.VISIBLE);
            main_text1.setVisibility(View.VISIBLE);
        }
        else{
            main_text.setVisibility(View.INVISIBLE);
            main_text1.setVisibility(View.INVISIBLE);
        }
    }

    public void imgbtn_click(View view) {
        if (main_img.getVisibility()==View.INVISIBLE){
            main_img.setVisibility(View.VISIBLE);
        }
        else{
            main_img.setVisibility(View.INVISIBLE);
        }
    }

}

