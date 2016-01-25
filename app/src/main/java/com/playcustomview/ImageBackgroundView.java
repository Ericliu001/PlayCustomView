package com.playcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ericliu on 25/01/2016.
 */
public class ImageBackgroundView extends View {
    public ImageBackgroundView(Context context) {
        this(context, null);
    }

    public ImageBackgroundView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageBackgroundView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PieChart,
                0, 0);

        try {
            mShowText = a.getRe(R.stpyleable.ImageBackgroundView_backgroundImageå);
        } finally {
            a.recycle();
        }

    }
}
