package com.willi_vstn.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<GameModel> {

    public MyAdapter(@NonNull Context context, ArrayList<GameModel> gameModelArrayList) {
        super(context, 0, gameModelArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;


        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_item, parent, false);

        }

        GameModel gameModel = getItem(position);
        TextView gameTitle = listItemView.findViewById(R.id.gridTextView);
        ImageView gameImage = listItemView.findViewById(R.id.grid_img_view);

        gameTitle.setText(gameModel.getGame_name());
        gameImage.setImageResource(gameModel.getGame_img());

        return listItemView;


    }
}
