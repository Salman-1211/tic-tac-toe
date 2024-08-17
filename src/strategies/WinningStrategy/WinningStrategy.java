package strategies.WinningStrategy;

import models.Board;
import models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
    public void undo(Board board, Move move);
}
