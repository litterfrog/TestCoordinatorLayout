package com.example.fuxinpeng.utils;

import android.content.Context;
import android.content.res.TypedArray;

import com.example.fuxinpeng.testcoordinatorlayout.R;

/**
 * Created by fuxinpeng on 2016/6/3.
 */
public class Util {
    public static int getToolbarHeight(Context context){
        final TypedArray styleAttributes=context.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        int toolbarHeight=(int)styleAttributes.getDimension(0,0);
        styleAttributes.recycle();
        return toolbarHeight;
    }
}
