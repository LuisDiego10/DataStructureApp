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
//        Crear lista vacia
        list= new Lcde();
//        crear pincel negro
        black.setARGB(0,0,0,0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        poner fondo negro
        canvas.drawRGB(255,255,255);
        Node actual=null;
//        Conseguir el primer nodo
        if(list.getStart()!=null){
            actual=list.getStart();}
//        Para cada nodo:
        for (int i=0;i<list.sizeLCDE;++i){
            if (actual!=null){
//                dibujar cuadrado interior
                canvas.drawRect(12*i,10,10+12*i,40,black);
//                dibujar cuadrado exterior
                canvas.drawRect(10*i,8,10+10*i,42,black);
//                poner titulo con el valor
                canvas.drawText(String.valueOf(actual.fact), (int)(((i * 12) + 8 + (12 * i)) / 2),25,black);
            }
//           cambiar nodo
            actual=actual.nextNode;

        }


    }
}
