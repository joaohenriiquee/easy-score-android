package joao.android.easyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int timeOne = 0;
    int timeTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitNewPointOneTeam(View view) {
        timeOne += 1;
        TextView TextView = (TextView) findViewById(R.id.points1);
        if (TextView != null) {
            String number = Integer.toString(timeOne);
            TextView.setText(number);
        }
        verifyScoreBoard();
    }

    public void submitNewPointTwoTeam(View view) {
        timeTwo += 1;
        TextView TextView = (TextView) findViewById(R.id.points2);
        if (TextView != null) {
            String number = Integer.toString(timeTwo);
            TextView.setText(number);
        }
        verifyScoreBoard();
    }

    public void submitClearScoreBoard(View view) {
        timeOne = 0;
        timeTwo = 0;
        TextView TextView1 = (TextView) findViewById(R.id.points1);
        TextView TextView2 = (TextView) findViewById(R.id.points2);
        if (TextView1 != null && TextView2 != null) {
            TextView1.setText("0");
            TextView2.setText("0");
        }
        TextView title = (TextView) findViewById(R.id.title);
        assert title != null;
        title.setText("Scoreboard");
    }

    public void verifyScoreBoard() {
        TextView title = (TextView) findViewById(R.id.title);
        assert title != null;
        if (timeOne > timeTwo) {

            title.setText("Flamengo Winning");
        }
        if (timeTwo > timeOne) {
            title.setText("Vasco Winning");

        }
        if (timeOne == timeTwo) {
            title.setText("Drawn Game");

        }
    }
}
