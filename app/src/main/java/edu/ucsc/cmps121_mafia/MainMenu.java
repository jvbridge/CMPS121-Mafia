package edu.ucsc.cmps121_mafia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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

    /**
     * These are the methods that are called when every button is pushed
     * This is HIGHLY initial, and lacking features
     * TODO: art animation etc.
     */
   public void singlePhone(){
       Intent singlePhone = new Intent(this, SinglePhoneMenu.class);
       startActivity(singlePhone);
   }

    public void settings(){
        Intent settings = new Intent(this, Settings.class);
        startActivity(settings);
    }

    public void rules(){
        Intent rules = new Intent(this, Rules.class);
        startActivity(rules);
    }

}
