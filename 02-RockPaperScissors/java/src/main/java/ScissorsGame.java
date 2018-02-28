public class ScissorsGame implements Game {

  public String getResult(String gesture) {
    if (gesture.equals("scissors"))
      return "scratch";

    if (gesture.equals("paper"))
      return "scissors beat paper";

    return "rock beats scissors";
  }
}
