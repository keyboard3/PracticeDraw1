package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    /*Color.parseColor("#F44336"),
            Color.parseColor("#FFC107"), 紫色
            Color.parseColor("#9C27B0"),
            Color.parseColor("#6F8188"),
            Color.parseColor("#009688"),
            Color.parseColor("#2196F3"),
            Color.parseColor("#FF4081")*/

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = 150;
        int top = 20;
        int right = left + 300;
        int bottom = top + 300;
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        RectF rectF1 = new RectF(left, top, right, bottom);
        paint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(rectF1, -180, 120, true, paint);

        RectF rectF2 = new RectF(left+10, top+10, right+10, bottom+10);
        paint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(rectF2, -180, -100, true, paint);

        RectF rectF3 = new RectF(left+12, top+12, right+12, bottom+12);
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(rectF3, -282, -60, true, paint);

        RectF rectF4 = new RectF(left+13, top+13, right+13, bottom+13);
        paint.setColor(Color.parseColor("#6F8188"));
        canvas.drawArc(rectF4, -345, -5, true, paint);

        RectF rectF5 = new RectF(left+13, top+13, right+13, bottom+13);
        paint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(rectF5, 0, 8, true, paint);

        RectF rectF6 =  new RectF(left+12, top+12, right+12, bottom+12);
        paint.setColor(Color.parseColor("#FFA500"));
        canvas.drawArc(rectF6, -5, -55, true, paint);
    }
}
