package oop_part2.encapsulation;

public class Main {
    public static void main(String[] args) {
      /*  Player pLayer=new Player();
        pLayer.fullName="Tim";
        pLayer.health=20;
        pLayer.weapon="Sword";

        int damage=10;
        pLayer.loseHealthh(damage);
        System.out.println("Reamining heath = "+pLayer.healthRemaining());

        damage=11;
        pLayer.health=200;
        pLayer.loseHealthh(damage);
        System.out.println("Reamining heath = "+pLayer.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Tim", 250, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
