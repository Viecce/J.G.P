package com.p.g.j.lenovo.jgp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.unstoppable.submitbuttonview.SubmitButton;

import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  SubmitButton button;
    private  ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         imageView = (ImageView)findViewById(R.id.picture_user);
        button = (SubmitButton) findViewById(R.id.submit_btn);
        button.setOnClickListener(this);

    }
    public void onClick(View v){
      //  Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        new DownloadImageTask().execute("file:///E:/java_lesson/AndroidSelvet/src/picture/fruit.jpg");
        button.doResult(true);
    }
    private class DownloadImageTask extends AsyncTask<String,Void,Drawable>{
        protected Drawable doInBackground(String...urls){
            return loadImageFromNetwork(urls[0]);
        }
        private Drawable loadImageFromNetwork(String urladdr) {

            Drawable drawable = null;
            try{

   drawable = Drawable.createFromStream(new URL(urladdr).openStream(), "image.jpg");
       }catch(IOException e){
        Log.d("test",e.getMessage());
 }
      if(drawable == null){
     Log.d("test","null drawable");
       }else{ Log.d("test","not null drawable");
 }
return drawable;
        }
        protected void onPostExecute(Drawable result){
            //imageView.setImageDrawable(result);
            Glide.with(MainActivity.this).load(result).into(imageView);
        }
    }
}
