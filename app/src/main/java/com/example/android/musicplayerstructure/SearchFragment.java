package com.example.android.musicplayerstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SearchFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fragment);
        //Find the playlist image and set an OnClickListener to it.
        ImageView playlist = (ImageView) findViewById(R.id.playlist);

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(SearchFragment.this, PlaylistFragment.class);
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
                    Intent libraryIntent = new Intent(SearchFragment.this, LibraryFragment.class);
                    startActivity(libraryIntent);
                }
            });
        }
    }
}
