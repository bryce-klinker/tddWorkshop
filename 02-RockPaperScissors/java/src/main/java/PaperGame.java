public class PaperGame implements Game {
  public String getResult(String gesture) {
    if (gesture.equals("rock"))
      return "paper beats rock";
    else
      return "scissors beat paper";
  }
}
