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
    public Paint red= new Paint();
    public Paint blue= new Paint();
    public Paint none= new Paint();
    public Paint text= new Paint();
    public static Node nodefind=null;
    public XorView(Context context) {
        super(context);
//        Crear lista vacia
        list= new Lcde();
//        crear pincel negro
        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.STROKE);
        black.setStrokeWidth(10);
        red.setARGB(255,120,10,40);
        red.setStyle(Paint.Style.STROKE);
        red.setStrokeWidth(22);
        blue.setARGB(255,20,10,240);
        blue.setStyle(Paint.Style.STROKE);
        blue.setStrokeWidth(22);
        none.setARGB(0,0,0,40);
        text.setARGB(255,20,20,20);
        text.setStyle(Paint.Style.FILL);
        text.setStrokeWidth(60);
        text.setTextSize(45);
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
        int a=-300;
//        Para cada nodo:
        for (int i=1;i<list.sizeLCDE+1;++i){
            a=a+360;
            if (actual!=null){
//                dibujar cuadrado interior
                canvas.drawRect(a+80,465,a+170,290,black);
//                dibujar cuadrado exterior
                //left=Indica desde que fila deseo que se dibuje
                if(actual!=nodefind) {
                    canvas.drawRect(a + 15, 465, a + 245, 280, red);
                }else{
                    canvas.drawRect(a + 15, 465, a + 245, 280, blue);
                    nodefind=null;
                }
//                poner titulo con el valor
                canvas.drawText(String.valueOf(actual.fact), (int)(a+110),385,text);
                if (i>1) {
                    canvas.drawLine(a + 250, 340, a + 360, 340, black); }
                }
//           cambiar nodo
            actual=actual.nextNode;

        }


    }
}
