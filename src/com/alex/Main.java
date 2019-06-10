package com.alex;

public class Main {

    public static void main(String[] args) {
        FootballPlayer fred = new FootballPlayer("Fred");
        BaseballPlayer rob = new BaseballPlayer("Rob");
        SoccerPlayer tom = new SoccerPlayer("Tom");

        Team<SoccerPlayer> spartak = new Team<>("Spartak");
        spartak.addPlayer(tom);
        System.out.println(spartak.numPlayers());

        Team<SoccerPlayer> loko = new Team<>("Loko");
        Team<SoccerPlayer> fakel = new Team<>("Fakel");
        Team<SoccerPlayer> krylya = new Team<>("Krylya");


        loko.matchResult(fakel, 1,2);
        spartak.matchResult(krylya, 4,3);
        fakel.matchResult(fakel,1,0);
        spartak.matchResult(loko,1,1);

//        System.out.println("Rankings");
//        System.out.println(spartak.getName() + ": " + spartak.ranking());
//        System.out.println(loko.getName() + ": " + loko.ranking());
//        System.out.println(fakel.getName() + ": " + fakel.ranking());
//        System.out.println(krylya.getName() + ": " + krylya.ranking());
//
//        System.out.println(spartak.compareTo(loko));
//        System.out.println(krylya.compareTo(fakel));

        LeagueTable<Team<SoccerPlayer>> leagueTable = new LeagueTable("SoccerLeague");
        leagueTable.addTeam(spartak);
        leagueTable.addTeam(loko);
        leagueTable.addTeam(fakel);
        leagueTable.addTeam(krylya);

//        leagueTable.addTeam(new Team<BaseballPlayer>("HPCh"));

        leagueTable.printOutInOrder();
    }
}
// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.
