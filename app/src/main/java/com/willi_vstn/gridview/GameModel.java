package com.willi_vstn.gridview;

public class GameModel {

    private String game_name;
    private int game_img;

    public GameModel(String game_name, int game_img) {
        this.game_name = game_name;
        this.game_img = game_img;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public int getGame_img() {
        return game_img;
    }

    public void setGame_img(int game_img) {
        this.game_img = game_img;
    }
}
