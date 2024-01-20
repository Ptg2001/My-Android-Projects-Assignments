package com.example.cameraintent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity{
    ImageView image;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
    }
    protected void CaptureImage(View v){
        Intent CameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(CameraIntent,0);
    }
    protected void onActivityResult(int requestcode, int resultcode, Intent data){
        super.onActivityResult(requestcode,resultcode,data);
        Bitmap bm = (Bitmap)data.getExtras().get("data");
        image.setImageBitmap(bm);
    }
}