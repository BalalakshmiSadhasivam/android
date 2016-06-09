package com.zoho.myapp.util;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/**
 * Created by bala-3019 on 09/06/16.
 * <p/>
 * <p/>
 * This class intercepts touch event from being passed to its children
 */


public class RecyclerViewDisabler implements RecyclerView.OnItemTouchListener {

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return true;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}