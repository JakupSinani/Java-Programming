package generics.challenge;

import generics.Player;

import java.util.ArrayList;


public class Team<T extends Player> implements Comparable<Team<T>> {
    private final String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private final ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    //@Override
    public int compareTo(Team team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
/*
public class Team<T> {
    private  String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private final ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(((Player) player).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player) player).getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}*/


//      VERSION 1

/*
*
public class Team {
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    private ArrayList<Player> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(Player player){
        if (members.contains(player)){
            System.out.println(player.getName()+" is already on this team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName()+" picked for team "+this.name);
            return true;
        }
    }
    public int numPlayer(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore,int theirScore){
        if (ourScore>theirScore){
            won++;
        }else if (ourScore==theirScore){
            tied++;
        }else {
            lost++;
        }
        played++;
        if (opponent!=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won*2)+tied;
    }
}*/