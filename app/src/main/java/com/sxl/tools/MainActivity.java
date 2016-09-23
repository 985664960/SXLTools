package com.sxl.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sxl.tools.toast.SXLToast;

/**
 * Created by Lee on 9/23/2016.
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastBtn = (Button) findViewById(R.id.toast_btn);
        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SXLToast.ShowRectangleToast(MainActivity.this,R.string.toast_str, Toast.LENGTH_LONG);
            }
        });
    }
}
