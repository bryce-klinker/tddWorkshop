import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {

  private RockPaperScissorsGame _game;

  @Before
  public void setUp() {
    _game = new RockPaperScissorsGame();
  }

  @Test
  public void rockCrushesScissors() {
    String actual = _game.determineWinner("rock", "scissors");
    assertEquals("rock beats scissors", actual);
  }

  @Test
  public void paperCoversRock() {
    String actual = _game.determineWinner("paper", "rock");
    assertEquals("paper beats rock", actual);
  }

  @Test
  public void scissorsCutPaper() {
    String actual = _game.determineWinner("scissors", "paper");
    assertEquals("scissors beat paper", actual);
  }

  @Test
  public void rockThrownSecondCrushesScissors() {
    String actual = _game.determineWinner("scissors", "rock");
    assertEquals("rock beats scissors", actual);
  }

  @Test
  public void paperThrownSecondCoversRock() {
    String actual = _game.determineWinner("rock", "paper");
    assertEquals("paper beats rock", actual);
  }

  @Test
  public void scissorsThrowSecondCutsPaper() {
    String actual = _game.determineWinner("paper", "scissors");
    assertEquals("scissors beat paper", actual);
  }
}
