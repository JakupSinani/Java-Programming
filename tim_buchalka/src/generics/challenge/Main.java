package generics.challenge;


import generics.SoccerPlayer;

public class Main {
    public static void main(String[] args) {
        League<Team<FootbalPlayer>> fotballLeague = new League<Team<FootbalPlayer>>("AFL");
        Team<FootbalPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");


        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        fotballLeague.add(adelaideCrows);
        fotballLeague.add(melbourne);
        fotballLeague.add(hawthorn);
        fotballLeague.add(fremantle);

        //fotballLeague.add(baseballTeam);
        fotballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team rawTeam = new Team<>("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);

        fotballLeague.add(rawTeam);

        League<Team> rawLeagu = new League<>("Raw");
        rawLeagu.add(adelaideCrows);
        rawLeagu.add(baseballTeam);
        rawLeagu.add(rawTeam);

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);
        reallyRaw.add(baseballTeam);
        reallyRaw.add(rawTeam);

    }
}
