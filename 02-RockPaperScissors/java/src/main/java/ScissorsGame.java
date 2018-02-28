public class ScissorsGame implements Game {

  public String getResult(String gesture) {
    if (gesture.equals("paper"))
      return "scissors beat paper";
    else
      return "rock beats scissors";
  }
}
