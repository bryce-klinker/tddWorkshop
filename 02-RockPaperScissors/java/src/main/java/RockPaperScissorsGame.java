public class RockPaperScissorsGame {
  private final GameFactory _gameFactory;

  RockPaperScissorsGame() {
    _gameFactory = new GameFactory();
  }

  public String determineWinner(String gesture1, String gesture2) {
    Game game = _gameFactory.getGame(gesture1);
    return game.getResult(gesture2);
  }
}

