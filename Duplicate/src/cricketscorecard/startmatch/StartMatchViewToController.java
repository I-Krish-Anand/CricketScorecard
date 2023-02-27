package cricketscorecard.startmatch;

import cricketscorecard.dto.InningsScorecard;
import cricketscorecard.dto.OverDetails;
import cricketscorecard.dto.PlayerDetails;
import cricketscorecard.dto.TeamDetails;

public interface StartMatchViewToController {

    void beginMatch(String battingTeam, String bowlingTeam);

    int getRunsConceded();

    void querySuccess(PlayerDetails playerDetails);

    void queryFailed();

    void printTeamDetails(TeamDetails team);

    void printBattingScorecard(TeamDetails teamDetails);

    void printBowlingScorecard(TeamDetails teamDetails);

    void printScore(PlayerDetails bowler, PlayerDetails[] playerDetails, InningsScorecard inningsScorecard, String battingTeam, String bowlingTeam, int ballNo, OverDetails thisOver);


    void openingBatsmanNameValid(PlayerDetails[] playerDetails, String battingTeam,String bowlingTeam, InningsScorecard inningsScorecard);


    //void newBatsmanDetailsValid(OverDetails thisOver, int choice, PlayerDetails bowler, PlayerDetails striker, PlayerDetails[] playerDetails, InningsScorecard inningsScorecard, String battingTeam, String bowlingTeam, boolean toSWap);

    void bowlerDetailsVaild(PlayerDetails bowler, PlayerDetails[] playerDetails, InningsScorecard inningsScorecard, String battingTeam, String bowlingTeam, OverDetails thisOver);

    void getnewBatsmanDetails(  PlayerDetails[]playerDetails, InningsScorecard inningsScorecard, String battingTeam, String bowlingTeam);
}