package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        Path path = new Path();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            path.addArc(200, 100, 400, 300, -225, 225);
            path.arcTo(400, 100, 600, 300, -180, 225, false);
            path.lineTo(400, 442);
            canvas.drawPath(path, paint);
        }

    }
}
