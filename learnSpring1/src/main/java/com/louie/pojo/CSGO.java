package com.louie.pojo;

import java.util.List;

public class CSGO {
    private String player;
    private String weapon;

    @Override
    public String toString() {
        return "CSGO{" +
                "player='" + player + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public CSGO() {
    }

    public CSGO(String player, String weapon) {
        this.player = player;
        this.weapon = weapon;
    }
}
