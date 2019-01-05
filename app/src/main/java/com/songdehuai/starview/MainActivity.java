package com.songdehuai.starview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StarView star_view = findViewById(R.id.star_view);
        textView = findViewById(R.id.star_vaule);
        textView.setText("" + star_view.getValue());
        star_view.setOnSeletedListener(new StarView.OnSeletedListener() {
            @Override
            public void onSeleted(int value) {
                textView.setText("" + value);
            }
        });
    }
}
