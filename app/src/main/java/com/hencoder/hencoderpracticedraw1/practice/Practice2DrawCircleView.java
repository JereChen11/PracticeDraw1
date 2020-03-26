package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        int width = getWidth();
        int height = getHeight();
        int middleWidthPosition = width / 2;
        int middleHeightPosition = height / 2;

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //1.实心圆
        //设置画笔的颜色
        paint.setColor(Color.BLACK);
        //设置画笔的style为画线
        paint.setStyle(Paint.Style.FILL);
        //调用画布，画一个圆
        canvas.drawCircle(middleWidthPosition - 120, 100, 100, paint);

        //2.空心圆
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(middleWidthPosition + 120, 100, 100, paint);

        //3.蓝色实心圆
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(middleWidthPosition - 120, middleHeightPosition + 100, 100, paint);

        //4.线宽为20的空心圆
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(40);

        canvas.drawCircle(middleWidthPosition + 120, middleHeightPosition + 100, 100, paint);
    }
}
