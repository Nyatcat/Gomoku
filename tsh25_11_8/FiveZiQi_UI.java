package tsh25_11_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class FiveZiQi_UI {
    public void showUI() {
        int thickness = 32;
        //显示窗体
        JFrame jf = new JFrame("五子棋");
        jf.setSize(900, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel 添加一个重写过的JPanel来实现棋盘持续自动绘制


        jf.setVisible(true);

        //作画
        Graphics g = jf.getGraphics();

        FiveListener fiveListener = new FiveListener();
        jf.addMouseListener(fiveListener);

        //传递
        if (jf.getHeight() >= jf.getWidth()) {
            fiveListener.frameWideth = jf.getWidth() - thickness;
        } else {
            fiveListener.frameWideth = jf.getHeight() - thickness;
        }

        Point edgePoint = jf.getLocationOnScreen();
        fiveListener.lca_x = edgePoint.x;
        fiveListener.lca_y = edgePoint.y + thickness;

        jf.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (jf.getContentPane().getWidth() >= jf.getContentPane().getHeight()) {
                    fiveListener.frameWideth = jf.getContentPane().getHeight();
                } else {
                    fiveListener.frameWideth = jf.getContentPane().getWidth();
                }
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        });


        fiveListener.g5 = g;
    }


    public static void main(String[] args) {
        FiveZiQi_UI ui = new FiveZiQi_UI();
        ui.showUI();
    }
}
