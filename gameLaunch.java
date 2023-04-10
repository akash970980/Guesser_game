// package Game_Project;
import java.util.*;
import java.util.Scanner;

class guesser{
    int num;
    int guessNum(){
        System.out.println("Hey Guesser! Please Guess the number ");
        Scanner userInput = new Scanner(System.in);
        int num=userInput.nextInt();
        // userInput.close(); //
        return num;

    }
}
class player{
    int num;
    int guessNum(){
        System.out.println("Hey Player! Please Guess the number ");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        // input.close();
        return num;

    }
}

class umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void getNoFromGuesser(){
        guesser g=new guesser();
        numFromGuesser=g.guessNum();
    }
    void getNoFromPlayer(){
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Teeno jeet Gya");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 and player 2 jeet gya");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 1 and player 3 jeet gya");
            }
            else{
                System.out.println("Player 1 jeet gya");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 and player 3 jeet gya");
            }
            else{
                System.out.println("Player 2 jeet gya");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 jeet gya");
        }
        else{
            System.out.println("Sb ke sb haar gye......!!!");
        }
    } 
}
public class gameLaunch {
    public static void main(String args[]){
        umpire u=new umpire();
        u.getNoFromGuesser();
        u.getNoFromPlayer();
        u.compare();

    }
}
