package ma.ofppt.canvastp3

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class MyCanvas(context : Context, attrs : AttributeSet) : View(context,attrs) {
    var path = Path()
    var paint = Paint()
    var canvas =Canvas()
   // lateinit var bitmap : Bitmap
    init {
        paint.color= Color.RED
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 6f
        paint.apply {
            color = Color.RED
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
    }


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawPath(path,paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if(event == null) return false

        when(event.action){
            MotionEvent.ACTION_DOWN -> path.moveTo(event.rawX,event.rawY)
            MotionEvent.ACTION_MOVE ->path.lineTo(event.rawX,event.rawY)
            MotionEvent.ACTION_UP -> {
                canvas.drawPath(path,paint)

            }
            else -> return false
        }
        invalidate()
        return true
    }
}