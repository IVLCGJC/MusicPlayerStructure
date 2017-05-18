package com.example.android.musicplayerstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LibraryFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_fragment);
        //Find the playlist image and set an OnClickListener to it.
        ImageView playlist = (ImageView) findViewById(R.id.playlist);

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent playlistIntent = new Intent(LibraryFragment.this, PlaylistFragment.class);
                    startActivity(playlistIntent);
                }
            });
        }
       //Find the search image and set an OnClickListener to it.
        ImageView search = (ImageView) findViewById(R.id.search);

        if (search != null) {
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent searchIntent = new Intent(LibraryFragment.this, SearchFragment.class);
                    startActivity(searchIntent);
                }
            });
        }
    }
}
