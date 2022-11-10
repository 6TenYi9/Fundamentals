package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {

    Button go;
    ImageView mGirl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        go=findViewById(R.id.ok);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup(view);
            }
        });

        mGirl=findViewById(R.id.girl);

        Glide.with(this)
                //.load(R.drawable.girl)
                .load("https://images.unsplash.com/photo-1640343631072-37ff06fd3397?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=764&q=80") //persone
                //.load("https://i.pinimg.com/236x/60/2a/7a/602a7a466b24603a7f7fc69588e84cb3--iphone--wallpaper-phone-wallpapers.jpg")
                //.load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                //.load("https://wallpaperaccess.com/full/1796653.jpg") //dragon
                //.centerCrop()
                .circleCrop()
                .into(mGirl);

    }
    public void signup(View view){
        Intent intent=new Intent(this,SignupActivity.class);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(intent);

    }
}