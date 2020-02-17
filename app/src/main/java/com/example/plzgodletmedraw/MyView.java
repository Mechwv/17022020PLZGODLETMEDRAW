package com.example.plzgodletmedraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(10);

        canvas.drawColor(Color.YELLOW);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(200,200,100,paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(400,400,700,800,paint);

        canvas.rotate(45);
        paint.setColor(Color.BLUE);
        paint.setTextSize(100);
        canvas.drawText("HAMBURGER",300,200,paint);
        canvas.rotate(-45);

        Path path = new Path();

        paint.setColor(Color.GREEN);
        path.moveTo(500,200);
        path.lineTo(600,200);
        path.lineTo(600,600);
        path.lineTo(500,200);
        canvas.drawPath(path,paint);
    }
}
