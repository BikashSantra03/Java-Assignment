import java.util.Scanner;

class Guesser {
    int guessNum;
    int range;

    public int guessNumber() {
        Umpire rn = new Umpire();
        range = rn.range();

        System.out.println("Guesser please Guess a number (0 to " + range + ")");
        while (true) {
            Scanner scan = new Scanner(System.in);
            guessNum = scan.nextInt();
            if (guessNum >= 0 && guessNum <= range) {
                return guessNum;
            } else {
                System.out.println("Guesser please Guess a number (0 to " + range + ")");
            }
        }
    }
}

class Player {
    int pguessNum;

    public int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        pguessNum = scan.nextInt();
        return pguessNum;
    }

}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public int range() {
        int Maxrange;

        Scanner rangee = new Scanner(System.in);
        System.out.println("Umpire please give the Maximum range of the number : ");
        Maxrange = rangee.nextInt();
        return Maxrange;
    }

    public void collectNumFromGuesser() {
        Guesser gs = new Guesser();
        numFromGuesser = gs.guessNumber();
    }

    public void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Game tied all three players guessed correctly");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won ");
            } else {
                System.out.println("Player 1 won the match");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won the game");
            } else {
                System.out.println("Player 2 won the match");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the match");
        } else {
            System.out.println("Game lost! try again");
        }
    }
}

public class Guess {
    public static void main(String[] args) {
        Umpire um = new Umpire();
        um.collectNumFromGuesser();
        um.collectNumFromPlayer();
        um.compare();
    }
}

/*
  Note : Sir I am implementing the logic that guessing number should be in a
  range and that range will be taken from user only (i.e, from Umpire).
  And I have implemented that logic, In my code Umpire fixed a range for guessing
  and the Guesser has to guess the number in that range only, otherwise it will ask
  again to guess the number in range.
  But this same logic I can't implement for Player. I mean if I use this same logic of code
  then for each player I have to create a "new umpire" object and if I do that then
  for each player Umpire calls and umpire has to give range to every player seperately.
  I don't want to do that. I want Umpire will only say the range at one time and
  all other will hear that and will guess the number at the range.
  Please help.
  Mail ID : santrabikash922@gmail.com
  Mobile : 6289951539
 */