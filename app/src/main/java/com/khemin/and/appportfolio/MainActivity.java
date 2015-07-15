package com.khemin.and.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button mButtonSpotifyStreamer;
    Button mButtonScoresApp;
    Button mButtonLibraryApp;
    Button mButtonBuildItBigger;
    Button mButtonXyzReader;
    Button mButtonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonSpotifyStreamer = (Button) findViewById(R.id.button_spotify);
        mButtonScoresApp = (Button) findViewById(R.id.button_scores);
        mButtonLibraryApp = (Button) findViewById(R.id.button_library);
        mButtonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        mButtonXyzReader = (Button) findViewById(R.id.button_xyz_reader);
        mButtonCapstone = (Button) findViewById(R.id.button_capstone);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.toast_base) + " " + ((Button)v).getText().toString(), Toast.LENGTH_SHORT).show();
            }
        };

        mButtonSpotifyStreamer.setOnClickListener(onClickListener);
        mButtonScoresApp.setOnClickListener(onClickListener);
        mButtonLibraryApp.setOnClickListener(onClickListener);
        mButtonBuildItBigger.setOnClickListener(onClickListener);
        mButtonXyzReader.setOnClickListener(onClickListener);
        mButtonCapstone.setOnClickListener(onClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
