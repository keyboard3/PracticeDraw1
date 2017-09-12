package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private int x;
    private int y;

    {
        x = 100;
        y = 350;
    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int left = 0;
        int height = 0;
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(x, 50);
        path.lineTo(x, y);
        path.lineTo(600, y);
        canvas.drawPath(path, paint);

        left = x + 50;
        height = 10;
        drawHorizontal(canvas, paint, path, left, height);
        drawText(canvas, paint, left, "html");
        left += 100;
        height += 50;
        drawHorizontal(canvas, paint, path, left, height);
        drawText(canvas, paint, left, "java");
        left += 100;
        height += 100;
        drawHorizontal(canvas, paint, path, left, height);
        drawText(canvas, paint, left, "android");
    }

    private void drawText(Canvas canvas, Paint paint, int left, String text) {
        paint.setColor(Color.WHITE);
        paint.setTextSize(16);
        canvas.drawText(text, left, y + 16, paint);
    }

    private void drawHorizontal(Canvas canvas, Paint paint, Path path, int left, int height) {
        path.reset();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        path.addRect(left, y - height, left + 50, y, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}
