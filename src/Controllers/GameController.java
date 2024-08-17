package Controllers;

import Exceptions.BotCountException;
import Exceptions.PlayerCountException;
import Exceptions.SymbolCountException;
import models.Game;
import models.GameState;
import models.Player;
import strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimensions,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) throws PlayerCountException, BotCountException, SymbolCountException {

        return Game.getBuilder().setDimension(dimensions)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void undo(Game game){
        game.undo();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
