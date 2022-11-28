package com.example.galleryfragments;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Gallery simpleGallery;
    CustomAdapter customGalleryAdapter;
    ImageView selectedImageView;
    // array of images
    int[] images = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4} ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGallery = (Gallery) findViewById(R.id.simpleGallary);
        selectedImageView = (ImageView) findViewById(R.id.selectedImageView);
        customGalleryAdapter = new CustomAdapter(getApplicationContext(),images);
        simpleGallery.setAdapter(customGalleryAdapter);
        simpleGallery.setSpacing(10);

        simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set the selected image in the ImageView
                selectedImageView.setImageResource(images[position]);

            }
        });
    }
}