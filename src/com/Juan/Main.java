package com.Juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your beautiful code here
        System.out.println("\nWelcome to the new rpg from DogSobre's Industries\n");
        String help = "- help\n" + "- create\n" + "- exit";
        String rpgClass = "- Berserker\n" + "- Thief\n";
        String str;

        do{
            ////// With this 3 follow lines, the user can write commands in our database.
            Scanner userType = new Scanner(System.in);
            System.out.println("This is the main menu, please enter your command (we have a secret command):");
            str = userType.nextLine();

            ////// This is the switch which allow us to execute our program :
            switch (str){
                case "help":
                    System.out.println("You can type:\n" + help);
                    break;
                case "create":
                    System.out.println("Choose a class :\n" + rpgClass + "If you are done, please write 'ok'\n");
                    userType = new Scanner(System.in);
                    str = userType.nextLine();
                    switch (str){
                        case "berserker":
                            String berserk = Berserker.getBerserker();
                            System.out.println(berserk);
                            break;
                        case "thief":
                            String robber = Thief.getThief(); // Robber is a synonymous of thief, it's the same.
                            System.out.println(robber);
                            break;
                    }
                    break;
                case "fight":
                    
                    break;
                case "generics":
                    Generics generics = new Generics();
                    System.out.println(generics);
                    break;
                case "exit":
                    System.out.println("Thanks to have playing, we hope to see you soon !");
                    break;
                default:
                    System.out.println("I didn't understand please use the following commands :\n" + help);
                    break;
            }
        }while(str.equals("exit") != true);
    }
}
