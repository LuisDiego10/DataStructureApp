package com.example.xor_linked_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
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
//        Agregarlo a al layout
        screen.addView(xorlist);
    }

    public void insert(View view){
//        encontrar el layout actual
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
//        Eliminar la lista que se ve actualmente
        screen.removeView(xorlist);
//        Encontrar el cuadro de texto e insertar valor nuevo
        EditText text= (EditText) findViewById(R.id.Text);
        XorView.list.insert(Integer.parseInt(text.getText().toString()));
//        agregar el nuevo display de la lista
        screen.addView(xorlist);
        System.out.println("what is happen :V");
        System.out.println(XorView.list.sizeLCDE);
    }
    public void delete(View view){
        ConstraintLayout screen= (ConstraintLayout) findViewById(R.id.layout1);
        screen.removeView(xorlist);
        EditText text= (EditText) findViewById(R.id.Text);
        XorView.list.deleteNode(Integer.parseInt(text.getText().toString()));
        screen.addView(xorlist);
    }
}