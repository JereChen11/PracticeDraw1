package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice10HistogramView extends View {

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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        paint.setColor(Color.WHITE);

        canvas.drawLine(100, 50, 100, 300, paint);
        canvas.drawLine(100, 300, 800, 300, paint);
        paint.setTextSize(20);
        canvas.drawText("Froyo", 120, 320, paint);
        canvas.drawText("Gb", 200, 320, paint);
        canvas.drawText("ICS", 270, 320, paint);
        canvas.drawText("JB", 320, 320, paint);
        canvas.drawText("Kitkat", 370, 320, paint);
        canvas.drawText("L", 420, 320, paint);
        canvas.drawText("M", 470, 320, paint);

        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(120, 200, 170, 300, paint);
        canvas.drawRect(180, 250, 230, 300, paint);
        canvas.drawRect(240, 200, 290, 300, paint);
        canvas.drawRect(300, 150, 350, 300, paint);
        canvas.drawRect(360, 100, 410, 300, paint);
        canvas.drawRect(420, 100, 470, 300, paint);
        canvas.drawRect(480, 100, 530, 300, paint);

        paint.setTextSize(40);
        paint.setColor(Color.WHITE);
        canvas.drawText("直方图", getWidth() / 2 - 50, getHeight() - 10, paint);
    }
}
