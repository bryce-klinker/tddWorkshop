public class PaperGame implements Game {
  public String getResult(String gesture) {
    if (gesture.equals("paper"))
      return "scratch";

    if (gesture.equals("rock"))
      return "paper beats rock";

    return "scissors beat paper";
  }
}
