package com.example.alondra.dadm_u3_practica1_alondragonzalezcruz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Circulo c1,c2, c3,c4,c5;
    public Lienzo(Context context){
        super(context);
        c1=new Circulo(300,500,this, Color.MAGENTA);
        c2=new Circulo(700,200,this,Color.YELLOW);
        c3=new Circulo(100,800,this,Color.GRAY);
        c4=new Circulo(500,1000,this,Color.WHITE);
        c5=new Circulo(200,300,this,Color.GREEN);
        //por cada cosa que recibe tengo que enviar el envio
        c1.mover(10);
        c2.mover(5);
        c3.mover(12);
        c4.mover(2);
        c5.mover(8);
    }
    @Override
    protected  void onDraw(Canvas c){
        super.onDraw(c);
        Paint p =new Paint();
        c.drawColor(Color.CYAN); //fondo de pantalla color azul
        c1.pintar(c,p);
        c2.pintar(c,p);
        c3.pintar(c,p);
        c4.pintar(c,p);
        c5.pintar(c,p);

    }
}
