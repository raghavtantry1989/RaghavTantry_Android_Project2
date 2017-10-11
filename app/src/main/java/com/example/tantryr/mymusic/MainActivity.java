package com.example.tantryr.mymusic;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.image1);
        image.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),SongListActivity.class);
                startActivity(intent);
            }
        });

        ImageView image2 = (ImageView) findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),SongListActivity.class);
                startActivity(intent);
            }
        });
    }





}
