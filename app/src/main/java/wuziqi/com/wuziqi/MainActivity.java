package wuziqi.com.wuziqi;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;

public class MainActivity extends Activity {

    private WuziqiPanel mGamePanel;
    private AlertDialog.Builder alertBuilder;
    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
