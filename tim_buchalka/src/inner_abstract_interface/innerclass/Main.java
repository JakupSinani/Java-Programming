package inner_abstract_interface.innerclass;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    public static void main(String[] args) {

    /*    class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been atached");
            }
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        }*/
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();



        /*
        GearBox mcLaren=new GearBox(6);


      *//*  mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.9);*//*
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));





      *//*  GearBox.Gear first=mcLaren.new Gear(1,12.3);
        //GearBox.Gear second=new GearBox.Gear(2,15.4);
        //GearBox.Gear third=new mclaren.Gear(3,17.8);
        System.out.println(first.driveSpeed(1000));*/

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
