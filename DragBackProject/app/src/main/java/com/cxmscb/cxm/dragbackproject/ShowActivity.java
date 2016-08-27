package com.cxmscb.cxm.dragbackproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ShowActivity extends Activity {

    SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        swipeBackLayout = (SwipeBackLayout) findViewById(R.id.dragBackLayout);
        swipeBackLayout.setOnFinishScroll(new SwipeBackLayout.OnFinishScrollListener() {
            @Override
            public void complete() {
                ShowActivity.this.finish();
                Toast.makeText(ShowActivity.this,"finished",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
