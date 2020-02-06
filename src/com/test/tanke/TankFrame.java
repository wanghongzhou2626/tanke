package com.test.tanke;

import org.omg.Messaging.SyncScopeHelper;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    int x = 200;
    int y = 200;
    TankFrame() {
        this.setSize(800, 600);
        this.setResizable(true);
        this.setTitle("tank war");
        this.setVisible(true);

        /* 键盘监听处理事件 */
        this.addKeyListener(new MyKeyListener());


        /* 关闭窗口事件 */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * 画图形的方法
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        System.out.println("tank");

        /* 填充一个矩形 */
        g.fillRect(x, y, 50, 50);
        //x += 20;
        //y += 40;
    }

    class MyKeyListener extends KeyAdapter {

        boolean bl = false;
        boolean bu = false;
        boolean br = false;
        boolean bd = false;

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Key Pressed");
            //x += 200;
            //repaint();



            // 获取键盘事件的 按键
            int key = e.getKeyCode();
            switch (key) {
            case KeyEvent.VK_LEFT:
                bl = true;
                break;
            case KeyEvent.VK_UP:
                bu = true;
                break;
            case KeyEvent.VK_RIGHT:
                br = true;
                break;
            case KeyEvent.VK_DOWN:
                bd = true;
                break;
            default:
                break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key Released");
            // 获取键盘事件的 抬起
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bl = false;
                    break;
                case KeyEvent.VK_UP:
                    bu = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    br = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bd = false;
                    break;
                default:
                    break;
            }
        }
    }
}
