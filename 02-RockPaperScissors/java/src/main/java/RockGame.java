public class RockGame implements Game {

  public String getResult(String gesture) {
    if (gesture.equals("scissors"))
      return "rock beats scissors";
    else
      return "paper beats rock";
  }
}
