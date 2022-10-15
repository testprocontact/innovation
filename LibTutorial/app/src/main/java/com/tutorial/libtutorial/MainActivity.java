package com.tutorial.libtutorial;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tutorial.mylibrary.ShowToast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShowToast showToast = new ShowToast();
        showToast.show(this, "test");
    }
}
