/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadvanturegame;

import java.util.Scanner;

/**
 *
 * @author hadee
 */
public class TextAdvantureGame {

    static Scanner read = new Scanner(System.in);
    static int yourHP = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello player who the hell are you ?");

        String youAre = read.nextLine();

        System.out.println("OK! " + youAre + " yor HP is " + yourHP + " let's start this text game");
        System.out.println("you are walking on a road \nyou saw a beautiful flower"
                + "\nwhat are you going to do:\n1-pick the flower\n2-search "
                + "what kind this flower is \n3- keep walking \n\n");
        int yourChoice = read.nextInt();
        if (yourChoice == 1) {
            PTF(yourHP);
        } else if (yourChoice == 2) {
            SWKTFI();
        } else if (yourChoice == 3) {
            KW();
        } else {
            System.out.println("wrong number smartass....GAME OVER!!!!");
        }
    }

    public static void PTF(int yourHP) {
        System.out.println("och i wouldn't done that the flower is toxic "
                + "\nyou lost 7HP ");
        yourHP = yourHP - 7;
        System.out.println("your HP is : " + yourHP);
        System.out.println("you kept walking \nthere is two monsters infront of you"
                + "\nwhat are you going to do :\n1-fighting them\n2-be friend with them"
                + "\n3-run because you are in fact a chicken\n\n");
        int for1 = 11;
        int yourChoice = read.nextInt();
        if (yourChoice == 1) {
            FT(for1);
        } else if (yourChoice == 2) {
            BFWT();
        } else if (yourChoice == 3) {
            RBYAIFAC();
        } else {
            System.out.println("wrong number smartass....GAME OVER!!!!");
        }

    }

    public static void SWKTFI() {
        // Hydrangea
        System.out.println("OK! nerd ...the flower is Hydrangea"
                + "\nwhat are you going to do :\n1-walk away \n2-touch it \n\n");
        int yourChoice2 = read.nextInt();
        if (yourChoice2 == 1) {
            KW();
        } else if (yourChoice2 == 2) {
            PTF(yourHP);
        } else {
            System.out.println("wrong number smartass....GAME OVER!!!!");
        }
    }

    public static void KW() {
        System.out.println("SMART .....you kept walking \nthere is two monsters infront of you"
                + "\nwhat are you going to do :\n1-fighting them\n2-be friend with them"
                + "\n3-run because you are in fact a chicken\n\n");
        int yourChoice = read.nextInt();
        if (yourChoice == 1) {
            FT();
        } else if (yourChoice == 2) {
            BFWT();
        } else if (yourChoice == 3) {
            RBYAIFAC();
        } else {
            System.out.println("wrong number smartass....GAME OVER!!!!");
        }

    }

    public static void FT(int for1) {
        System.out.println("you are an idiot i told you \nyour HP IS 3!!"
                + "\nbut still you want to fight them\nOK \"brave\"you died\n"
                + "lol did you really thought you gonna win\nGAME OVER :)");

    }

    public static void FT() {
        System.out.println("ok you fight them \nthey were strong but you win");
        yourHP = 1;
        System.out.println("your HP is 1\nwhat are you going to do \n1-celebrate\n2-keep"
                + " going to your destenation\n\n");
         int yourChoice = read.nextInt();
              if(yourChoice==1){
              C();
              }else if (yourChoice==2){
             KEW() ;
              
              }else{
               System.out.println("wrong number smartass....GAME OVER!!!!");
              }
    }

    public static void BFWT() {
        System.out.println("they are a MONSTER you\"i wanna be friend with them\"._.\n"
                + "they eat you you are dead .... GAME OVER!!:) ");

    }

    public static void RBYAIFAC() {
        System.out.println("my grandpa used to tell me"
                + " \nthe cowherd are the one who left to tell the brave's story\nyou "
                + "reach a mountain \nwhat's your next step:\n1-claim it \n2-oh shit that's"
                + " a lot of walking im out of here \n\n");
         int yourChoice = read.nextInt();
              if(yourChoice==1){
              CI();
              }else if (yourChoice==2){
              OSTIALOWIOOH();
              
              }else{
               System.out.println("wrong number smartass....GAME OVER!!!!");
              }

    }
     public static void CI() {
         System.out.println("you reach the top\nand found the treasure you were"
                 + " looking for \nther was a letter that said\n"
                 + "the real treasure is your friends\n"
                 + "but that doesn't make sense \n"
                 + "because you were alone so GG i guess"
                 + "\nsee you next time");
     }
       public static void OSTIALOWIOOH() {
           System.out.println("all of that was for nothing you lazy bastard\n"
                   + "GG see you next time");
     }
         public static void C() {
             System.out.println("someone gave you a drink \nyou drinked it\n"
                     + "and now you are good to go your HP is 10\n"
                     + "you walked to your destenation\n"
                     + "you "
                + "reach a mountain \nwhat's your next step:\n1-claim it \n2-oh shit that's"
                + " a lot of walking im out of here\n\n");
              int yourChoice = read.nextInt();
              if(yourChoice==1){
              CI();
              }else if (yourChoice==2){
              OSTIALOWIOOH();
              
              }else{
               System.out.println("wrong number smartass....GAME OVER!!!!");
              }
     }
           public static void KEW() {
               System.out.println("you were too tired\nso you fell"
                       + "and that caused you 1 HP \nso now you are dead GAME OVER!:)");
     }
}



