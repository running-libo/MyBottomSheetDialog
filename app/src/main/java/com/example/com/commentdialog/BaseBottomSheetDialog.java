package com.example.com.commentdialog;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.CoordinatorLayout;
import android.widget.FrameLayout;

/**
 * create by libo
 * create on 2019/4/1
 * description
 */
public class BaseBottomSheetDialog extends BottomSheetDialogFragment {
    private FrameLayout bottomSheet;
    public BottomSheetBehavior<FrameLayout> behavior;

    @Override
    public void onStart() {
        super.onStart();

        BottomSheetDialog dialog = (BottomSheetDialog) getDialog();
        bottomSheet = dialog.getDelegate().findViewById(android.support.design.R.id.design_bottom_sheet);
        if (bottomSheet != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) bottomSheet.getLayoutParams();
            layoutParams.height = getHeight();
            bottomSheet.setLayoutParams(layoutParams);
            behavior = BottomSheetBehavior.from(bottomSheet);
            behavior.setPeekHeight(getHeight());
            // 初始为展开状态
            behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        }
    }

    @Override
    public int getTheme() {
        return R.style.basedialog_anim_style;
    }

    protected int getHeight() {
        return getResources().getDisplayMetrics().heightPixels;
    }

}
