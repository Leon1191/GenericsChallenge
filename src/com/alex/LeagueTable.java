package com.alex;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    ArrayList<T> league;
    private String name;

    public LeagueTable(String name) {
        this.name = name;
        league = new ArrayList<>();
    }


    public void addTeam(T team) {
        if (league.contains(team)) System.out.println(team.getName() + " is already added");
        else league.add(team);
    }

    public void printOutInOrder() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}
