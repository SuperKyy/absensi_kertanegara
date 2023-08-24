package com.kertanegara.absensikertanegara;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


public class LoadingActivity extends AppCompatActivity {
    private int waktu_loading=2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_loading);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke Login activity
                Intent Login=new Intent(LoadingActivity.this, LoginActivity.class);
                startActivity(Login);
                finish();

            }
        },waktu_loading);
    }
}