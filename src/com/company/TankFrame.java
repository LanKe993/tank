package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author LvHao */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame(){
        // set width and height
        setSize(800, 600);

        // 设置窗口大小不可变
        setResizable(false);

        // 设置标题头
        setTitle("Tank War");

        // 显示窗口可见
        setVisible(true);

        // 添加一个window监听器，负责监听windowClosing事件
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x, y, 50, 50);
        x += 10;
        y += 10;
    }
}
