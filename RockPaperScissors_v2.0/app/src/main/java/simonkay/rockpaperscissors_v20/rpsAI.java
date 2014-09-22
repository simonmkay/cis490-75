package simonkay.rockpaperscissors_v20;

import java.util.Date;
import java.util.Random;

/**
 * Created by Simon Kay on 9/19/2014.
 */
public class rpsAI {
    private static int counter=0;
    public RPSType play(){
        Random random = new Random(new Date().getTime() + counter++);
        int randomNumber = random.nextInt(3);
        switch(randomNumber){
            case 0 : return RPSType.ROCK;
            case 1 : return RPSType.PAPER;
            default : return RPSType.SCISSOR;
        }
    }
}

