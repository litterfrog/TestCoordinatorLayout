package com.example.fuxinpeng.mybehavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by fuxinpeng on 2016/6/1.
 */
public class ScaleBehavior extends CoordinatorLayout.Behavior<View> {
    public ScaleBehavior(){}

    public ScaleBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return /*true*/dependency instanceof Snackbar.SnackbarLayout/*||dependency instanceof AppCompatImageView*/;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        float translationY = getFabTranslationYForSnackbar(parent, child);
        float percentComplete=-translationY/dependency.getHeight();
        child.setRotation(360 * percentComplete);
//        child.setTranslationY(translationY);
        child.setScaleX(1-percentComplete);
        child.setScaleY(1-percentComplete);
        return false;
    }
    private float getFabTranslationYForSnackbar(CoordinatorLayout parent,
                                                View fab) {
        float minOffset = 0;
        final List<View> dependencies = parent.getDependencies(fab);
        Log.i("test",dependencies.size()+"");
        for (int i = 0, z = dependencies.size(); i < z; i++) {

            Log.i("test",dependencies.get(i).getClass().getName());
            final View view = dependencies.get(i);
            if (view instanceof Snackbar.SnackbarLayout && parent.doViewsOverlap(fab, view)) {
                minOffset = Math.min(minOffset,
                        ViewCompat.getTranslationY(view) - view.getHeight());
            }
        }
        return minOffset;
    }

}
