package com.example.xor_linked_list;

import androidx.appcompat.app.AppCompatActivity;

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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        encontrar el layout actual
        RelativeLayout screen= (RelativeLayout) findViewById(R.id.layout1);
//        encontrar la vista de la  xortlist del xml
        xorlist = (XorView) findViewById(R.id.Xor1);
//        Agregarlo a al layout
        screen.addView(xorlist);
    }

    public void insert(View view){
//        encontrar el layout actual
        RelativeLayout screen= (RelativeLayout) findViewById(R.id.layout1);
//        Eliminar la lista que se ve actualmente
        screen.removeView(xorlist);
//        Encontrar el cuadro de texto e insertar valor nuevo
        EditText text= (EditText) findViewById(R.id.Text);
        XorView.list.insert(Integer.parseInt(text.getText().toString()));
//        agregar el nuevo display de la lista
        screen.addView(xorlist);
    }
    public void delete(View view){
        RelativeLayout screen= (RelativeLayout) findViewById(R.id.layout1);
        screen.removeView(xorlist);
        EditText text= (EditText) findViewById(R.id.Text);
        XorView.list.deleteNode(Integer.parseInt(text.getText().toString()));
        screen.addView(xorlist);
    }
}