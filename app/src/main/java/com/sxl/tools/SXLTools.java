package com.sxl.tools;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by Lee on 9/23/2016.
 */
public class SXLTools {

    public static int dp2px(Context context, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

}
