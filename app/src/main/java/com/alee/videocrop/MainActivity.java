package com.alee.videocrop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

            File must be in mp4 format

         */


        String inputPath = "/storage/0/path/.mp4"; // Your video Input Path

        String outputPath = "/storage/0/path/.mp4"; // Your video Output Path

        /*

           Uncomment this line and add your input and put path

         startActivityForResult(VideoCropActivity.createIntent(getApplicationContext(), videoURI, videoURI), CROP_REQUEST);



         */








    }
}