package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = getWidth() / 2;
        int height = getHeight() / 2;


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);

            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, -180, 120, true, paint);
            paint.setColor(Color.YELLOW);
            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, -60, 60, true, paint);
            paint.setColor(Color.WHITE);
            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, 0, 10, true, paint);
            paint.setColor(Color.GRAY);
            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, 10, 20, true, paint);
            paint.setColor(Color.GREEN);
            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, 30, 40, true, paint);
            paint.setColor(Color.BLUE);
            canvas.drawArc(width - 200, height - 200, width + 200, height + 200, 60, 120, true, paint);
        }

    }
}
