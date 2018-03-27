package com.example.customcamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PreviewActivity extends AppCompatActivity {

    private ImageView previewImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Bundle bundle = getIntent().getExtras();
        //byte[] camera = bundle.getByteArray("camera_img");

        previewImage = findViewById(R.id.previewImage);

//        Bitmap bitmap = BitmapFactory.decodeByteArray(camera, 0, camera.length);
//
//        if (bitmap != null){
//            previewImage.setImageBitmap(bitmap);
//        }

    }
}
