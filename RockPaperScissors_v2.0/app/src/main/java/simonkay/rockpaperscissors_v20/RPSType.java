package simonkay.rockpaperscissors_v20;

/**
 * Created by Simon Kay on 9/19/2014.
 */


public enum RPSType {

    ROCK ("Rock"), PAPER ("Paper"), SCISSOR ("Scissors");
    private String value;

    RPSType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}