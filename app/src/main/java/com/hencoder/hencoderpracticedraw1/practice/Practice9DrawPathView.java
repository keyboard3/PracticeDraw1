package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        int lx = 200;
        int ly = 100;
        int rx = 400;
        int ry = 100;
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        path.addArc(lx, ly - 50, lx + 100, ly + 50, 0, -180);
        path.addArc(rx - 100, ry - 50, rx, ly + 50, 0, -180);
        path.moveTo(lx, ly);
        path.lineTo((lx + rx) / 2, ly + 100);
        path.lineTo(rx, ry);
        path.close();
        canvas.drawPath(path, paint);
    }
}
