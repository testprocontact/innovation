package com.tutorial.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public void show(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
