package by.litelife.litelife_timetable.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import by.litelife.litelife_timetable.R;

/**
 * Created by Mikhail Kazyuchyts on 11/4/2016.
 */
public class MainActivity extends Activity {
    private Button buttonClick;
    private TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        buttonClick = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Кликнул");
            }
        });

    }
}
