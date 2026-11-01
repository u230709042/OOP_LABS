package lab12.tictactoe;


public class InvalidMoveException extends Exception {
  public InvalidMoveException(String message) {
    super(message);
  }
}