package Projects;
import java.util.Scanner;

class Guesser{
    protected int GuessedNumber;
    int min;
    int max;

    int GuessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Minimun Range : ");
        min = scan.nextInt();
        System.out.print("Maximum Range : ");
        max=scan.nextInt();
        System.out.println("Guess a Number ! ");
        GuessedNumber= scan.nextInt();
        return GuessedNumber;
    }
}

class Players{
    int playerGuessedNumber;
    int rangeMin;
    int rangeMax;

    protected void attemptGuess(){
        Scanner scan = new Scanner(System.in);
        playerGuessedNumber = scan.nextInt();
    }

    public int getPlayerGuessedNumber() {
        return playerGuessedNumber;
    }
    
}

class Umpire{
    int GuessedNumber;
    int rangeMax;
    int rangeMin;

    void StartGame(){
        Guesser g= new Guesser();
       GuessedNumber= g.GuessingNumber();
       rangeMin=g.min;
       rangeMax=g.max;
       System.out.println("Guesser Has Guessed the number ! and informed the Umpire");

    }
    protected boolean CheckGame(int playerGuessedNumber){
        return playerGuessedNumber==GuessedNumber;
    }

}

public class GuesserGame{
    public static void main(String[] args) {
        int numOfPlayers;
        Umpire umpire = new Umpire();
        boolean hasWon=false;
        umpire.StartGame();
        System.out.println("Guess the number between " + umpire.rangeMin + " and "+ umpire.rangeMax);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of Players ");
        numOfPlayers=scan.nextInt();
        Players[] players = new Players[numOfPlayers];

        for(int i=0;i<numOfPlayers;i++){
            players[i]= new Players();
            System.out.println("Player" + (i+1)+ " Guess the number");
            players[i].attemptGuess();
        }

        for(int i=0;i<numOfPlayers;i++){
            if(umpire.CheckGame(players[i].getPlayerGuessedNumber())){
                System.out.println("Player "+ (i+1)+ " has won the Game");
                hasWon=true;
            }
        }
        if(!hasWon){
            System.out.println("Every player lost the game");
        }
    }
}