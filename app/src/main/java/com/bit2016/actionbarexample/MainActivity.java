package com.bit2016.actionbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemid = item.getItemId();
        String menuTitle = item.getTitle().toString();
        switch (itemid) {
            case R.id.item1 : {
                Toast.makeText(this, menuTitle + " selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item2 : {
                Toast.makeText(this, menuTitle + " selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item3 : {
                Toast.makeText(this, menuTitle + " selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item4 : {
                Toast.makeText(this, menuTitle + " selected", Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
