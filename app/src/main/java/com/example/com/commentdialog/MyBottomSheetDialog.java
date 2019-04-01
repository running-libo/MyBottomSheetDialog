package com.example.com.commentdialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * create by libo
 * create on 2019/4/1
 * description
 */
public class MyBottomSheetDialog extends BaseBottomSheetDialog {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_comment, container);
        return view;
    }

    @Override
    protected int getHeight() {
        return getResources().getDisplayMetrics().heightPixels - 400;
    }
}
