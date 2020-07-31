package com.ismailvardien.profitcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Button btnProfileBack = findViewById(R.id.btn_about_me_back);
        btnProfileBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutMe.this, MenuScreen.class);
                startActivity(intent);
            }
        });

        TextView tvProfileText = findViewById(R.id.tv_scrollview);
        String tvContent = "My Name is Ismail Vardien I am 26 year old student studying Applications Development at CPUT." +
                "\n\n I am currently working at Open Box Software as a Junior Developer in their Custom Software division."
                +" \n\nI previously held a position at Pick n Pay in their Point of Sale IT helpdesk." +
                " In my academic career I have received a Higher Certificate in ICT from CPUT and"
                +"I am currently completing my Diploma in ICT with a focus in Applications Development" +
                "I hope to achieve my masters in Applications Development one day." +
                " With this I intend to advance my job status at my current company and move my career forward" +
                " \n\nIn my spare time I am a avid fan of most sports with a key focus on Football and Basketball." +
                " I enjoy reading comics and watching series most of which is Anime(Japanese Animation)."
                +"That is mostly all there is to know, I hope you enjoy the application.";
        tvProfileText.setText(tvContent);
        tvProfileText.setMovementMethod(new ScrollingMovementMethod());
    }
}