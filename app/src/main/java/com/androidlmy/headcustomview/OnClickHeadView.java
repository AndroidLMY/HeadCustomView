package com.androidlmy.headcustomview;

/**
 * @功能:头部布局点击接口
 * @Creat 2019/07/16 9:59
 * @User Lmy
 * @By Android Studio
 */
public interface OnClickHeadView {
    /**
     * 点击左侧按钮回调
     */
    void onBackClick();

    /**
     * 点击左侧文字回调
     */
    void onBackTextClick();

    /**
     * 点击右侧文字回调
     */
    void onRightTextClick();

    /**
     * 点击右侧按钮回调
     */
    void onRightImgClick();
}
