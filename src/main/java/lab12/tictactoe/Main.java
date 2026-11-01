package lab12.tictactoe;



import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Board board = new Board();

    System.out.println(board);

    while (!board.isEnded()) {
      int player = board.getCurrentPlayer();
      int row = 0, col = 0;

      while (true) {
        try {
          System.out.print("Player " + player + ", enter row number: ");
          row = Integer.parseInt(reader.nextLine());
          System.out.print("Player " + player + ", enter column number: ");
          col = Integer.parseInt(reader.nextLine());

          board.move(row, col);
          break;

        } catch (NumberFormatException e) {
          System.out.println("Please enter a valid integer for row and column.");
        } catch (InvalidMoveException e) {
          System.out.println(e.getMessage());
        }
      }

      System.out.println(board);
    }

    int winner = board.getWinner();
    if (winner != 0) {
      System.out.println("Player " + winner + " won the game! 🎉");
    } else {
      System.out.println("The game ended in a draw.");
    }

    reader.close();
  }
}