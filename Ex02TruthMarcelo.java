import java.util.Scanner;

class Ex02TruthMarcelo {
  public static void main(String[] args) {
    Scanner receiver = new Scanner(System.in); //initial initialization
    boolean end = false;
    int limitUpper = 10;
    int limitLower = 1;
    int guessMax = 3;
    int answer;
    int guessNum;
    int guessAttempt;
    
    while(!end) {
      System.out.println("\nWelcome to Higher or Lower! What will you do?\n-Start game\n-Change settings\n-End application");
      String response = receiver.nextLine(); //get response
      switch(response) {
        case "Start game":
          boolean play = true;
          while (play) {
            answer = (int) Math.floor(Math.random()*limitUpper)+limitLower;
            guessNum = guessMax; //game initialization
            System.out.println("\n");
            
            guessLoop:
            while (guessNum > 0) {
              System.out.printf("You have %d guess(es) left. What is your guess? ", guessNum);
              guessAttempt = receiver.nextInt(); //get guess
              guessNum--; //count down
              if (guessAttempt == answer) {
                System.out.println("You got it!"); //if correct
                break guessLoop;
              }
              else {
                if (guessNum > 0) {
                  if (guessAttempt < answer) {
                    System.out.println("Guess higher! "); //if lower
                  }
                  else if (guessAttempt > answer) {
                    System.out.println("Guess lower! "); //if higher
                  }
                }
                else {
                  System.out.println("You lost..."); //if out of guesses
                }
              }
            }
            boolean repeat = true;
            while (repeat) {
              System.out.print("Play again (y/n)? ");
              char confirm = receiver.next().charAt(0); //get response
              switch (confirm) {
                case 'y':
                  repeat = false;
                  break;
                case 'n':
                  play = false;
                  repeat = false;
                  break;
                default:
                  ;
              }
            } // check response
          }
          break;
        case "Change settings":
          boolean valid = false;
          System.out.println("What is the lower limit of the random number?\nWhat is the upper limit of the random number?\nHow many guesses are allowed?");
          while (!valid) {
            System.out.print("Lower limit: ");
            limitLower = receiver.nextInt();
            System.out.print("Upper limit: ");
            limitUpper = receiver.nextInt();
            if (limitLower+1 < limitUpper) {
              valid = true;
            }
            else {
              System.out.println("The values for the upper limit and the lower limit are not valid!");
            }
          }
          System.out.print("Guesses: ");
          guessMax = receiver.nextInt();
          break;
        case "End application":
          System.out.println("\nThank you for playing!");
          end = true;
          break;
        default:
          ;
      }
    }
  }
}