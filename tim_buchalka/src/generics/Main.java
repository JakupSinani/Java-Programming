package generics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootbalPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago clubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> bronkenTeam = new Team<>("This won't work");
        bronkenTeam.addPlayer(beckham);

        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
        FootbalPlayer banks = new FootbalPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        // adelaideCrows.matchResult(baseballPlayerTeam,1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());


        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
        //Collections.sort(teams);

    }









  /*  public static void main(String[] args) {
        FootbalPlayer joe=new FootbalPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham=new SoccerPlayer("Beckham");

        Team<FootbalPlayer> adelaideCrows=new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);
        //  adelaideCrows.addPlayer(joe); {if members.contain(player)   }----->>        is already on his team

        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer>baseballPlayerTeam=new Team<>("Chicago clubs");
        baseballPlayerTeam.addPlayer(pat);

        //  Team<String>brokenTeam=new Team<>("This wont work");    ----->  exception error
        //  brokenTeam.addPlayer("no_one");

        Team<SoccerPlayer>brokenTeam=new Team<>("Thow won't work");
        brokenTeam.addPlayer(beckham);
    }*/









   /* public static void main(String[] args) {
        ArrayList items=new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);

        printDOubled(items);
    }
    private static void printDOubled(ArrayList n){
        for (Object i: n){
            System.out.println((Integer)i*2);
        }
    }*/
}
