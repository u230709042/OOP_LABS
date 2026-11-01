package lab12.tictactoe;



public class Board {

  private char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
  private int currentPlayer = 1;
  private int moveCount;
  private int winner = 0;  // 0: yok, 1 veya 2: kazanan oyuncu

  public boolean isEnded() {
    return moveCount == 9 || winner != 0;
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public int getWinner() {
    return winner;
  }

  public void move(int row, int col) throws InvalidMoveException {
    if (row < 1 || row > 3 || col < 1 || col > 3) {
      throw new InvalidMoveException("Invalid move! Row and column must be between 1 and 3.");
    }
    if (board[row - 1][col - 1] != ' ') {
      throw new InvalidMoveException("Invalid move! Cell is already occupied.");
    }
    board[row - 1][col - 1] = currentPlayer == 1 ? 'X' : 'O';
    moveCount++;

    if (checkWinner(row - 1, col - 1)) {
      winner = currentPlayer;
    } else {
      currentPlayer = 3 - currentPlayer;
    }
  }

  private boolean checkWinner(int row, int col) {
    char symbol = board[row][col];

    if (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol) {
      return true;
    }

    if (board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol) {
      return true;
    }

    if (row == col) {
      if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
        return true;
      }
    }

    if (row + col == 2) {
      if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
        return true;
      }
    }

    return false;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder();
    buf.append("    1   2   3\n")
      .append("  -----------\n");
    for (int row = 0; row < 3; ++row) {
      buf.append(row + 1).append(" ");
      for (int col = 0; col < 3; ++col) {
        buf.append("|");
        buf.append(" ").append(board[row][col]).append(" ");
        if (col == 2) {
          buf.append("|");
        }
      }
      buf.append("\n  -----------\n");
    }
    return buf.toString();
  }
}