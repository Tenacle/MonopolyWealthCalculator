package com.tenacle.monopolywealthcalculator.objects;

import android.content.ReceiverCallNotAllowedException;

import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Session {
    String name;
    Date date;
    List<Player> playerList;

    public Session(String name, Date date, List<Player> playerList) {
        this.name = name;
        this.date = date;
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void addPlayer(Player player) {
        this.playerList.add(player);
    }

    public void delPlayer(Player player) {
        this.playerList.remove(player);
    }

    public boolean containsPlayer(Player player) {
        return this.playerList.contains(player);
    }

    @Override
    public boolean equals(Object object) {
        boolean equals = false;
        if( object instanceof Session ) {
            Session session = (Session) object;
            equals = this.name.equals(session.getName());
        }
        return equals;
    }
}
