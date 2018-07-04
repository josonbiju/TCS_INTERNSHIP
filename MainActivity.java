package com.example.josonbiju.itemtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

    String lettersList[] = { "KEY1" , "KEY2" , "WALLET1" ,"WALLET2"};

    int LettersIcon[] = { R.drawable.key_1 , R.drawable.key_2 , R.drawable.wallet_1 , R.drawable.wallet_2 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = (GridView) findViewById(R.id.gridView);

        GridAdapter adapter = new GridAdapter(MainActivity.this , LettersIcon , lettersList);

        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this , "Clicked :" +lettersList[i] , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
