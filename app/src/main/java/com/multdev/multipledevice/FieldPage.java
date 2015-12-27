package com.multdev.multipledevice;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import layout.FieldPageFragment;
import layout.PlayerFragment;

public class FieldPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("PlayPal");

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        LinearLayout fieldFrag = (LinearLayout) findViewById(R.id.FieldFragmentContainer);
        if (fieldFrag != null) {

            // Add field fragment to the activity's container layout
            FieldPageFragment fieldFragment = new FieldPageFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(fieldFrag.getId(), fieldFragment,
                    FieldPageFragment.class.getName());

            // Commit the transaction
            fragmentTransaction.commit();
        }

        // If our layout has a container for the player fragment, create
        // it and add it
        LinearLayout playerLayout = (LinearLayout) findViewById(R.id.PlayerFragmentContainer);
        if (playerLayout != null) {

            // Add player fragment to the activity's container layout
            PlayerFragment playerFragment = new PlayerFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(playerLayout.getId(), playerFragment,
                    PlayerFragment.class.getName());

            // Commit the transaction
            fragmentTransaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_field_page, menu);
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
