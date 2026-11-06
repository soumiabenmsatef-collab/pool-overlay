package com.example.pooloverlay

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class OverlayView(context: Context) : View(context) {
    private val paint = Paint().apply {
        color = Color.RED
        strokeWidth = 5f
        isAntialias = true
        style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawLine(100f, 100f, 500f, 500f, paint)
    }
}