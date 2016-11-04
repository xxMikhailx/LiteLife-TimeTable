package by.litelife.litelife_timetable.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import by.litelife.litelife_timetable.R;

/**
 * Created by Mikhail Kazyuchyts on 11/4/2016.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
