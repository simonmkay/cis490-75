package simonkay.rockpaperscissors_v20;



/**
 * Created by Simon Kay on 9/19/2014.
 */
public class RPSUtility {
    public static final String INPUT_TYPE = "com.simonkay.RockPaperScissors_v20.inputType";

    public static String eval(RPSType player1Choice, RPSType player2Choice){
        if(player1Choice==player2Choice){
            return "Tie";
        }else{
            if (player1Choice==RPSType.ROCK){ //rock beats scissors
                if(player2Choice==RPSType.SCISSOR){
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }else if (player1Choice==RPSType.SCISSOR){//scissors beats paper
                if(player2Choice==RPSType.PAPER){
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }else{//paper
                if(player2Choice==RPSType.ROCK){//paper beats rock
                    return "Player 1 Wins";
                }else{
                    return "Computer Wins";
                }
            }
        }
    }


}
