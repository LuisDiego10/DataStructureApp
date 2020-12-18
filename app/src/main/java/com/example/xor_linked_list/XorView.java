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
        black.setARGB(255,0,0,0);
        black.setStrokeWidth((float) 0.12);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        poner fondo negro
        canvas.drawRGB(20,255,255);
        Node actual=null;
//        Conseguir el primer nodo
        if(list.getStart()!=null){
            actual=list.getStart();}
//        Para cada nodo:
        for (int i=0;i<list.sizeLCDE;++i){
            if (actual!=null){
//                dibujar cuadrado interior
                canvas.drawRect(1200*i,50,100+1200*i,40,black);
//                dibujar cuadrado exterior
                canvas.drawRect(100*i,80,100+100*i,420,black);
//                poner titulo con el valor
                canvas.drawText(String.valueOf(actual.fact), (int)(((i * 120) + 80 + (120 * i)) / 2),25,black);
            }
//           cambiar nodo
            actual=actual.nextNode;

        }


    }
}
