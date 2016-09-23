package com.sxl.tools.toast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sxl.tools.R;
import com.sxl.tools.SXLTools;

/**
 * Created by Lee on 9/23/2016.
 */
public class SXLToast {

    public static void ShowRectangleToast(Context context, int resStr, int duration) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_rectangle,null);
        TextView toast_tv = (TextView) view.findViewById(R.id.toast_tv);
        toast_tv.setText(resStr);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM, 0, SXLTools.dp2px(context,70));
        toast.setDuration(duration);
        toast.setView(view);
        toast.show();
    }

}
