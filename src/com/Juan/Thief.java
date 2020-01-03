package com.Juan;
import java.util.Scanner;

public class Thief {

    public static String getThief(){

        String str = "";
        String finalUserType = "";
        boolean isUserChosen = false;
        Scanner userType = new Scanner(System.in);

            do{

                System.out.println("You choose Thief\n" + "Please now, choose a name");
                str = userType.nextLine();
                String tempUserType = str;

                System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
                userType = new Scanner(System.in);
                str = userType.nextLine().toLowerCase();

                if(str.equals("y")){

                    finalUserType = tempUserType;
                    System.out.println("Ok, now see the different characteristics of the Thief :");
                    MasterClass thief = new MasterClass(329, 57, 23, 10, 10, 425, 1.02);

                    System.out.println(thief);
                    System.out.println("To continue, please type 'ok'");
                    str = userType.nextLine();
                    isUserChosen = true;
                }
            }while(!isUserChosen);
        return str;
    }
}
