package com.Juan;
import java.util.Scanner;

public class Berserker {

    public static String getBerserker(){

        String str = "";
        String finalUserType = "";
        boolean isUserChosen = false;
        Scanner userType = new Scanner(System.in);

            do{

                System.out.println("You choose Berserker\n" + "Please now, choose a name");
                str = userType.nextLine();
                String tempUserType = str;

                System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
                userType = new Scanner(System.in);
                str = userType.nextLine().toLowerCase();

                if(str.equals("y")){

                    finalUserType = tempUserType;
                    System.out.println("Ok, now see the different characteristics of the Berserker :");
                    MasterClass berserker = new MasterClass(467, 81, 0, 37, 29, 315, 0.89);

                    System.out.println(berserker);
                    System.out.println("To continue, please type 'ok'");
                    str = userType.nextLine();
                    isUserChosen = true;
                }
            }while (!isUserChosen);
        return str;
    }
}
