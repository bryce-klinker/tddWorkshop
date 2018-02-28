public class RockGame implements Game {

  public String getResult(String gesture) {
    if (gesture.equals("rock"))
      return "scratch";

    if (gesture.equals("scissors"))
      return "rock beats scissors";

    return "paper beats rock";
  }
}
