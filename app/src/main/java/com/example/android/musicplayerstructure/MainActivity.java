package com.example.android.musicplayerstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //Find the playlist image and set an OnClickListener to it.
        ImageView playlist = (ImageView) findViewById(R.id.playlist);

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(MainActivity.this, PlaylistFragment.class);
                    startActivity(playlistIntent);
                }
            });
        }

        //Find the library image and set an OnClickListener to it.
        ImageView library = (ImageView) findViewById(R.id.library);

        if (library != null) {
            library.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent libraryIntent = new Intent(MainActivity.this, LibraryFragment.class);
                    startActivity(libraryIntent);
                }
            });
        }

        //Find the search image and set an OnClickListener to it.
        ImageView search = (ImageView) findViewById(R.id.search);

        if (search != null) {
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent searchIntent = new Intent(MainActivity.this, SearchFragment.class);
                    startActivity(searchIntent);
                }
            });
        }

    }
}
