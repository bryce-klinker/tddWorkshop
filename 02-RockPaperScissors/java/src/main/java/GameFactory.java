public class GameFactory {
  Game getGame(String gesture) {
    if (gesture.equals("scissors"))
      return new ScissorsGame();

    if (gesture.equals("paper"))
      return new PaperGame();

    return new RockGame();
  }
}
