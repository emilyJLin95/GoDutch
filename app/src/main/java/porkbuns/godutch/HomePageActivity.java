package porkbuns.godutch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomePageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void startProfile(View view) {
        Log.v(HomePageActivity.class.getName(), "startProfile");
    }

    public void startMeal(View view) {
    }

    public void startHistory(View view) {
    }

    public void startFriends(View view) {
    }
}
