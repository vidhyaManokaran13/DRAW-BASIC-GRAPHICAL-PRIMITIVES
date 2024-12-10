package com.example.font;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GraphicsView extends View {
    private Paint paint;

    public GraphicsView(Context context) {
        super(context);
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Set the background color
        canvas.drawColor(Color.LTGRAY);

        // Draw a circle
        paint.setColor(Color.RED);
        canvas.drawCircle(300, 300, 100, paint);

        // Draw a rectangle
        paint.setColor(Color.BLUE);
        canvas.drawRect(100, 500, 500, 700, paint);

        // Draw a line
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        canvas.drawLine(100, 800, 500, 1000, paint);

        // Draw text
        paint.setColor(Color.BLACK);
        paint.setTextSize(50);
        canvas.drawText("Basic Primitives", 150, 1200, paint);
    }
}

