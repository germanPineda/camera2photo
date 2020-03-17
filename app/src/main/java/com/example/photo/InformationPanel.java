package com.example.photo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.camera2photo.R;

public class InformationPanel extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }
}
