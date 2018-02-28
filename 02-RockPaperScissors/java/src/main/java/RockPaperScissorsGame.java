public class RockPaperScissorsGame {

  public String determineWinner(String gesture1, String gesture2) {
    if (gesture1.equals("scissors"))
      return "scissors beat paper";

    if (gesture1.equals("paper"))
      return "paper beats rock";

    return "rock beats scissors";
  }

}
