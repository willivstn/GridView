package com.willi_vstn.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        //Data to be displayed into gridview
        ArrayList<GameModel> gameModelArrayList = new ArrayList<GameModel>();
        gameModelArrayList.add(new GameModel("The Last of Us Part 1", R.drawable.lou));
        gameModelArrayList.add(new GameModel("Call of Duty: Modern Warfare 2", R.drawable.cod));
        gameModelArrayList.add(new GameModel("Stray", R.drawable.stray));
        gameModelArrayList.add(new GameModel("The Quarry", R.drawable.quarry));

        //Attach Adapter
        MyAdapter myAdapter = new MyAdapter(this, gameModelArrayList);
        gridView.setAdapter(myAdapter);

    }
}