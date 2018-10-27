package com.example.alondra.dadm_u3_practica1_alondragonzalezcruz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {
    float x, y;
    //int desplazamiento;
    int desplazamientox;
    int desplazamientoy;
    CountDownTimer timer; //se tiene que instanciar
    int color;

    public Circulo(int posx, int posy, final Lienzo l, int c) {
        x = posx;
        y = posy;
        color = c;
        timer = new CountDownTimer(1000, 10) {
            @Override
            public void onTick(long millisUntilFinished) {
                x += desplazamientox;
                if (x >= l.getWidth() - 100) {
                    desplazamientox *= -1;
                }
                if (x <= 100) {
                    desplazamientox *= -1;
                }
                y += desplazamientoy;

                if (y >= l.getHeight() - 100) {
                    desplazamientoy *= -1;
                }
                if (y <= 100) {
                    desplazamientoy *= -1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }

    public void pintar(Canvas c, Paint p) {
        //se atrae lo que tenemos en la clase lienzo para dibujar
        p.setColor(color);
        c.drawCircle(x, y, 100, p); //primer circulo
        //c.drawCircle(x - 100, y + 80, 120, p); //restandole la mitad del primero circulo
        // c.drawCircle(x + 100, y + 60, 80, p);
    }

    public void mover(int desplaza) {
        desplazamientox = desplaza;
        desplazamientoy = desplaza;
        timer.start();
    }//metodo de mover las nubes
}
