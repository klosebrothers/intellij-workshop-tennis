// TODO: reformat code

// TODO: optimize import
import java.util.stream.Stream;

public class TennisGame {
    // TODO: rename to camelCase
    private int m_score1 = 0; private int m_score2 = 0;
    private String player1Name; private String player2Name;

    // TODO: add a constructor with two parameters: player1Name and player2Name

    public void wonPoint(String playerName)
    {
        // TODO: remove double negation
        if (!(playerName != "player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = ""    ;
        int tempScore = 0;
        if (m_score1==m_score2) {
            // TODO: shorten switch expression
            switch(m_score1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            // TODO: extract variable
            if (m_score1 - m_score2 == 1) score = "Advantage player1";
            else if (m_score1 - m_score2 == -1) score = "Advantage player2";
            else if (m_score1 - m_score2 >= 2) score = "Win for player1";
            // TODO: uncomment this line
//            else score = "Win for player2";
        } else {
            // TODO: implement a new method for the following code
            for (
                    int i = 1;
                    i < 3;
                    i++
            ) {
                if (i == 1) tempScore = m_score1;
                else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore)
                {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    /*
    Bonus Task:
    The player names are now hard-coded to "player1" and "player2".
    After you refactor, you may want to make the names of them dynamic and add suitable test cases to prove your fix works.
    */
}

