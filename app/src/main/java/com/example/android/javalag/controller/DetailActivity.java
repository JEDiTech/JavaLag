package com.example.android.javalag.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.example.android.javalag.R;
import com.squareup.picasso.Picasso;

import static com.example.android.javalag.R.id.username;


/**
 * Created by Master on 18/8/2017.
 */

public class DetailActivity extends AppCompatActivity {
    TextView Link, Username;
    CircleImageView imageView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail);

        FloatingActionButton shareButton = (FloatingActionButton) findViewById(R.id.share_button);

        imageView = (CircleImageView) findViewById(R.id.user_image_header);
        Username = (TextView) findViewById(username);

        shareButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shareIt();
            }
        });


        Link = (TextView) findViewById(R.id.link);

        String username = getIntent().getExtras().getString("login");
        String avatarUrl = getIntent().getExtras().getString("avatar_url");
        String link = getIntent().getExtras().getString("html_url");

        Link.setText(link);
        Linkify.addLinks(Link, Linkify.WEB_URLS);

        Username.setText(username);
        Picasso.with(this)
                .load(avatarUrl)
                .placeholder(R.drawable.load)
                .into(imageView);

        getSupportActionBar().setTitle(username);
    }

    private void shareIt() {
        String username = getIntent().getExtras().getString("login");
        String userUrl = getIntent().getExtras().getString("html_url");
        Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = "Check out this awesome Java Developer @" + username + ", " + userUrl;
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(shareIntent, "Share profile"));
    }

}