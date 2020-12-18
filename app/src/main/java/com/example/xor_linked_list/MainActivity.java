package com.example.xor_linked_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.LCDE.Lcde;

public class MainActivity extends AppCompatActivity {
    public XorView xorlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout screen= (RelativeLayout) findViewById(R.id.layout1);
        xorlist = (XorView) findViewById(R.id.Xor1);
        screen.addView(xorlist);
    }

    public void insert(View view){
        RelativeLayout screen= (RelativeLayout) findViewById(R.id.layout1);
        screen.removeView(xorlist);
        EditText text= (EditText) findViewById(R.id.Text);
        XorView.list.insert(Integer.parseInt(text.getText().toString()));
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