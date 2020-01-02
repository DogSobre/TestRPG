package com.Juan;

import java.util.Scanner;

public class UserType{

    public UserType() {
    }

    public static String getUserType(){

        String str = null;

        boolean isUserChosen = false;
        String finalUserType = "";
        String strLower = str.toLowerCase();

        public String Berserker(){

            if (strLower.equals("berserker")) {

                do {

                    System.out.println("You choose Berserker\n" + "Please now, choose a name");
                    Scanner userType = new Scanner(System.in);
                    str = userType.nextLine();
                    String tempUserType = str;

                    System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
                    userType = new Scanner(System.in);
                    str = userType.nextLine().toLowerCase();

                    if (str.equals("y")) {

                        finalUserType = tempUserType;
                        System.out.println("Ok, now see the different characteristics of the Berserker :");
                        MasterClass berserker = new MasterClass(467, 81, 0, 37, 29, 315, 0.89);

                        System.out.println(berserker);
                        System.out.println("To continue, please type 'ok'");
                        isUserChosen = true;
                    }
                } while (!isUserChosen);
            }
            return str;
        }
        public String Thief(){
            if (strLower.equals("thief")) {

                do {

                    System.out.println("You choose Thief\n" + "Please now, choose a name");
                    Scanner userType = new Scanner(System.in);
                    str = userType.nextLine();
                    String tempUserType = str;

                    System.out.println("You choose '" + str + "', is it correct ? (Y/N) \n");
                    userType = new Scanner(System.in);
                    str = userType.nextLine().toLowerCase();

                    if (str.equals("y")) {

                        finalUserType = tempUserType;
                        System.out.println("Ok, now see the different characteristics of the Thief :");
                        MasterClass berserker = new MasterClass(329, 57, 23, 10, 10, 425, 1.02);

                        System.out.println(berserker);
                        System.out.println("To continue, please type 'ok'");
                        isUserChosen = true;
                    }
                }while(!isUserChosen);
            }
            return str;
        }
    }
}