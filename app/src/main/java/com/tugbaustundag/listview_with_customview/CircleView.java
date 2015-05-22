package com.tugbaustundag.listview_with_customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CircleView extends View {

    float dim;
    int shape;
    Paint paint;

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // R.styleable.deger  tanımlamasındaki, deger kelimesinin yerine gelecek kelime value/attrs.xml de tanımlanır
        //
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CircleView,
                0, 0
        );

        try {
            /// value/attrs.xml' de attr tagleri arasında kullanılan özellikleri atadık
            dim = a.getDimension(R.styleable.CircleView_dim, 20f);
            shape = a.getInteger(R.styleable.CircleView_shape, 0);
        } finally {
            a.recycle();
        }

        //Yuvarlagın rengini belirledik
        paint = new Paint();
        paint.setColor(0xfffed325);
    }

    /**
     * Verilen boyut, renk gibi özellklere göre yuvarlıgı çizen metod (drawCircle) kullanıldı
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(dim, dim, dim, paint);

    }


}
