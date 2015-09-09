package com.example.barameek.listviewdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] str = { "Profile", "Data", "Config" };

        ListView listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));
        listView1.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0
                    , View arg1, int arg2, long arg3) {
                Intent intent;
                switch(arg2) {
                    case 0 :
                        intent = new Intent(getApplicationContext()
                                , PageProfile.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getApplicationContext()
                                , PageData.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getApplicationContext()
                                , PageConfig.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }

}
