package com.example.xor_linked_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.LCDE.Lcde;

public class MainActivity extends AppCompatActivity {
//    Vista de la xortlist
    public XorView xorlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
        super.onCreate(savedInstanceState);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        setContentView(R.layout.activity_main);
//        encontrar el layout actual
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
//        encontrar la vista de la  xortlist del xml
        xorlist = new XorView(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            xorlist.setId(View.generateViewId());
        }
//        Agregarlo a al layout
        screen.addView(xorlist,0);
    }

    public void insert(View view){
//        encontrar el layout actual
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
//        Eliminar la lista que se ve actualmente
        ConstraintSet newScreenL= new ConstraintSet();
//        Encontrar el cuadro de texto e insertar valor nuevo
        EditText text= (EditText) findViewById(R.id.Text);
        screen.removeView(xorlist);
        try{
        XorView.list.insert(Integer.parseInt(text.getText().toString()));}
        catch(Exception e){
            XorView.list.insert(0);
        }
//        agregar el nuevo display de la lista
        screen.addView(xorlist,0);
        newScreenL.clone(screen);
        newScreenL.connect(xorlist.getId(),ConstraintSet.TOP,screen.getId(),ConstraintSet.TOP,60);
        newScreenL.applyTo(screen);
        System.out.println("what is happen :V");
        System.out.println(XorView.list.sizeLCDE);
    }
    public void delete(View view){
//        encontrar el layout actual
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
//        Eliminar la lista que se ve actualmente
        ConstraintSet newScreenL= new ConstraintSet();
//        Encontrar el cuadro de texto e insertar valor nuevo
        EditText text= (EditText) findViewById(R.id.Text);
        screen.removeView(xorlist);
        try{
            XorView.list.deleteNode(Integer.parseInt(text.getText().toString()));}
        catch(Exception e){
            System.out.println("no value founded");
        }
//        agregar el nuevo display de la lista
        screen.addView(xorlist,0);
        newScreenL.clone(screen);
        newScreenL.connect(xorlist.getId(),ConstraintSet.TOP,screen.getId(),ConstraintSet.TOP,60);
        newScreenL.applyTo(screen);
    }
    public void search(View view){
//        encontrar el layout actual
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
//        Eliminar la lista que se ve actualmente
        ConstraintSet newScreenL= new ConstraintSet();
//        Encontrar el cuadro de texto e insertar valor nuevo
        EditText text= (EditText) findViewById(R.id.Text);
        screen.removeView(xorlist);
        try{
            XorView.nodefind= XorView.list.getNode(Integer.parseInt(text.getText().toString()));}
        catch(Exception e){
            System.out.println("no value founded");
        }
//        agregar el nuevo display de la lista
        screen.addView(xorlist,0);
        newScreenL.clone(screen);
        newScreenL.connect(xorlist.getId(),ConstraintSet.TOP,screen.getId(),ConstraintSet.TOP,60);
        newScreenL.applyTo(screen);
    }
}