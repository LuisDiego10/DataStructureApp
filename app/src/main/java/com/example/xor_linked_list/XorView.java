package com.example.xor_linked_list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.example.LCDE.Lcde;
import com.example.LCDE.Node;

public class XorView extends View {
    public static Lcde list;
    public Paint black= new Paint();
    public XorView(Context context) {
        super(context);
        list= new Lcde();
        black.setARGB(0,0,0,0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRGB(255,255,255);
        Node actual=null;
        if(list.getStart()!=null){
            actual=list.getStart();}
        for (int i=0;i<list.sizeLCDE;++i){
            if (actual!=null){
                canvas.drawRect(12*i,10,10+12*i,40,black);
                canvas.drawRect(10*i,8,10+10*i,42,black);
                canvas.drawText(String.valueOf(actual.fact), (int)(((i * 12) + 8 + (12 * i)) / 2),25,black);
            }

        }


    }
}
