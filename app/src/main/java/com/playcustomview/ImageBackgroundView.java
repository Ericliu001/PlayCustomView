package com.playcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by ericliu on 25/01/2016.
 */
public class ImageBackgroundView extends ImageView {
    public ImageBackgroundView(Context context) {
        this(context, null);
    }

    public ImageBackgroundView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageBackgroundView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = context.obtainStyledAttributes(
                attrs,
                R.styleable.ImageBackgroundView,
                0, 0);

        try {
            Drawable drawable = a.getDrawable(R.styleable.ImageBackgroundView_backgroundImage);
            if (drawable != null) {
                this.setImageDrawable(drawable);
            }
        } finally {
            a.recycle();
        }

    }
}
