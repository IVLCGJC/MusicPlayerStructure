package com.example.android.musicplayerstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PlaylistFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_fragment);
        //Find the playlist image and set an OnClickListener to it.
        ImageView playlist = (ImageView) findViewById(R.id.playlist);

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(PlaylistFragment.this, "Clicked", Toast.LENGTH_SHORT).show();
                    Intent playlistIntent = new Intent(PlaylistFragment.this, PlaylistFragment.class);
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
                    Toast.makeText(PlaylistFragment.this, "Clicked", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(PlaylistFragment.this, "Clicked", Toast.LENGTH_SHORT).show();
                    Intent searchIntent = new Intent(PlaylistFragment.this, SearchFragment.class);
                    startActivity(searchIntent);
                }
            });
        }

    }
}
