package simonkay.rockpaperscissors_v20;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class win_loss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_loss);
        Intent intent = getIntent();
        int clickedType = intent.getIntExtra(RPSUtility.INPUT_TYPE,0);

        RPSType player1Choice = RPSType.ROCK;
        if(clickedType==R.id.buttonRock){
            player1Choice=RPSType.ROCK;
        }else if(clickedType==R.id.buttonPaper){
            player1Choice=RPSType.PAPER;
        }else if(clickedType==R.id.buttonScissors){
            player1Choice=RPSType.SCISSOR;
        }

        rpsAI player2 = new rpsAI();
        RPSType player2Choice = player2.play();

        //set picture
        ImageView imageComputer = (ImageView)findViewById(R.id.imageComputer);
        if(player2Choice==RPSType.ROCK){
            imageComputer.setImageResource(R.drawable.small_rock);
        }else if(player2Choice==RPSType.PAPER){
            imageComputer.setImageResource(R.drawable.small_paper);
        }else if(player2Choice==RPSType.SCISSOR){
            imageComputer.setImageResource(R.drawable.small_scissors);
        }

        //set result
        String result = RPSUtility.eval(player1Choice,player2Choice);
        TextView textView = (TextView)findViewById(R.id.textResult);
        textView.setText(result);

        Button button = (Button) findViewById(R.id.btnAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                win_loss.this.finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.win_loss, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
