package com.test.tanke;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String [] args) {
       /* Frame f = new Frame();
        f.setSize(800, 600);

        *//* 能否改变大小*//*
        f.setResizable(false);

        f.setTitle("tank war");

        *//*是否显示窗口*//*
        f.setVisible(true);

        *//*关闭窗口*//*
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/


        TankFrame t = new TankFrame();

        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.repaint();
        }

    }
}
