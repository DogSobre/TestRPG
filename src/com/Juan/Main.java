package com.Juan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
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
                            System.out.println("hello world");
                            Berserker berserk = new Berserker();
//                            String berserk = Berserker.getBerserker();
                            System.out.println(berserk);
                            break;
                        case "thief":
                            System.out.println("ohayo sekai");
//                            String robber = Thief.getThief();
                            Thief robber = new Thief(); // Robber is a synonymous of thief, it's the same .
                            System.out.println(robber);
                            break;
                    }
//                        userType = new Scanner(System.in);
//                        str = userType.nextLine();
//
//                        ////// In first place, the user choose his class.
//                        ////// In second place, the user choose a username.
//                        ////// After that, the program ask to the user if he confirm the username. He choice Yes (Y, y) or no (N, n).
//                        ////// If the user say Yes, the script continue into the loop until the end and break it when finished.
//                        ////// If the user say No, the loop restart at the moment when the program asked to user what is his username.
//
//                        if(str.equals("Berserker") || str.equals("berserker")){
//                            try{
//                                String newUserType = UserType.getUserType();
//                                UserType berserk = new UserType();
//                                System.out.println(berserk);
//                            }catch (Exception e){
//                                System.out.println("Process restarting.\n" + "Please choose a class :\n" + rpgClass);
//                            }
//                        }else if(str.equals("Thief") || str.equals("thief")){
////                            try{
////                                String thief = new String();
////                                thief = UserType.getUserType();
////                                System.out.println(thief);
////                            }catch(Exception e){
////                                System.out.println("Process restarting.\n" + "Please choose a class :\n" + rpgClass);
////                            }
//                            do{
//                                System.out.println("You choose Thief\n" + "Please now, choose a name");
//                                userType = new Scanner(System.in);
//                                str = userType.nextLine();
//
//                                System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
//                                userType = new Scanner(System.in);
//                                str = userType.nextLine();
//                                if(str.equals("Y") || str.equals("y")){
//                                    System.out.println("Ok, now see the different characteristics of the Thief :");
//                                    MasterClass thief = new MasterClass(329, 57, 23, 10, 10, 425, 1.02);
//
//                                    System.out.println(thief);
//                                    System.out.println("To continue, please type 'ok'");
//                                    break;
//                                }
//                            }while(str.equals("N") != true || str.equals("n") != true);
//                        }
//                    }while(str.equals("ok") != true);
                    break;

                /*case(str.equals("fight")){
                     do{
                    }while();
                }*/ // "fight"

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
