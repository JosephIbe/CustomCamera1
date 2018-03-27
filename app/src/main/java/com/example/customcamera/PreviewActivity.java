package com.example.customcamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

public class PreviewActivity extends AppCompatActivity {

    private static final String TAG = PreviewActivity.class.getSimpleName();

    private ImageView previewImage;
    private String imageFilePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Bundle bundle = getIntent().getExtras();
        imageFilePath = bundle.getString("camera_img");
        Log.d(TAG, "Image File Path:\t" + imageFilePath);

        previewImage = (ImageView) findViewById(R.id.previewImage);

        Bitmap bitmap = BitmapFactory.decodeFile(imageFilePath);

//        Bitmap bitmap = BitmapFactory.decodeByteArray(camera, 0, camera.length);
//
        if (bitmap != null){
            previewImage.setImageBitmap(bitmap);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        File file = new File(imageFilePath);
        Log.d(TAG, "File from path:\t" + file);

        if (file.exists()){
            file.delete();
            Log.d(TAG, "File Deleted");
        }

    }
}
