package com.example.android.musicplayerstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlaylistFragment extends AppCompatActivity {
    public boolean playOrPause = true; //Set initial picture value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_fragment);

        //Change play and pause image
        final ImageView playAndPause = (ImageView) findViewById(R.id.switch_play_pause);

        if (playAndPause != null) {
            playAndPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (playOrPause) {
                        playAndPause.setImageResource(R.drawable.play_active);
                        playOrPause = false;
                    } else {
                        playAndPause.setImageResource(R.drawable.pause);
                        playOrPause = true;
                    }
                }
            });
        }
        //Find the library image and set an OnClickListener to it.
        ImageView library = (ImageView) findViewById(R.id.library);

        if (library != null) {
            library.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent libraryIntent = new Intent(PlaylistFragment.this, LibraryFragment.class);
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
                    Intent searchIntent = new Intent(PlaylistFragment.this, SearchFragment.class);
                    startActivity(searchIntent);
                }
            });
        }
    }
}
