public class TennisGame {
  private static final String PlayerOneName = "player1";
  private int _playerOneScore = 0;
  private int _playerTwoScore = 0;

  TennisGame() {
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(PlayerOneName))
      _playerOneScore += 1;
    else
      _playerTwoScore += 1;
  }

  public String getScore() {
    if (isScoreTied()) {
      return getTiedScore();
    }

    if (isAdvantage()) {
      return getAdvantageScore();
    }

    return getPlayerScore(_playerOneScore) + "-" + getPlayerScore(_playerTwoScore);
  }

  private String getPlayerScore(int score) throws RuntimeException {
    switch (score) {
      case 0:
        return "Love";
      case 1:
        return "Fifteen";
      case 2:
        return "Thirty";
      case 3:
        return "Forty";
    }

    return "";
  }

  private boolean isAdvantage() {
    return _playerOneScore >= 4 || _playerTwoScore >= 4;
  }

  private String getAdvantageScore() {
    String score;
    int minusResult = _playerOneScore - _playerTwoScore;
    if (minusResult == 1) score = "Advantage player1";
    else if (minusResult == -1) score = "Advantage player2";
    else if (minusResult >= 2) score = "Win for player1";
    else score = "Win for player2";
    return score;
  }

  private boolean isScoreTied() {
    return _playerOneScore == _playerTwoScore;
  }

  private String getTiedScore() {
    switch (_playerOneScore) {
      case 0:
        return "Love-All";
      case 1:
        return "Fifteen-All";
      case 2:
        return "Thirty-All";
      default:
        return "Deuce";
    }
  }
}
