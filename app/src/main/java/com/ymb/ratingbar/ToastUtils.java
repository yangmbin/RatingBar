package com.ymb.ratingbar;

import android.content.Context;
import android.widget.Toast;

/**
 * @author ymb
 * Create at 2017/8/23 17:06
 */
public class ToastUtils {
    private static Toast toast;
    public static void text(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        }
        toast.setText(text);
        toast.show();
    }
}
