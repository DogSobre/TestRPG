package com.Juan;

import java.util.Scanner;

public class Thief {
    public static String getThief(){

        String str = null;
        String finalUserType = "";
        String strLower = str.toLowerCase();
        boolean isUserChosen = false;

        if(strLower.equals("thief")){

            do{

                System.out.println("You choose Thief\n" + "Please now, choose a name");
                Scanner userType = new Scanner(System.in);
                str = userType.nextLine();
                String tempUserType = str;

                System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
                userType = new Scanner(System.in);
                str = userType.nextLine().toLowerCase();

                if(str.equals("y")){

                    finalUserType = tempUserType;
                    System.out.println("Ok, now see the different characteristics of the Thief :");
                    MasterClass thief = new MasterClass(467, 81, 0, 37, 29, 315, 0.89);

                    System.out.println(thief);
                    System.out.println("To continue, please type 'ok'");
                    isUserChosen = true;
                }
            }while (!isUserChosen);
        }
        return str;
    }
}
