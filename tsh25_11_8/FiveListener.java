package tsh25_11_8;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FiveListener implements MouseListener {
    public Graphics g5;
    //画网格
    int frameWideth;
    int lca_x, lca_y;
    int thickness = 24;


    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");

        int a = e.getX();


    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标移入");
        int step = frameWideth / 16;
        int tempX = lca_x + step;
        int tempY = lca_y + step;
        System.out.println(tempX);
        System.out.println(tempY);
        //画网格
        for (int i = 1; i < 16; i++) {
            int x = tempX + step * i;
            g5.drawLine(step * i, step + thickness, step * i, step * 15 + thickness);
        }  //竖线
        for (int j = 1; j < 16; j++) {
            int y = tempY + step * j;
            g5.drawLine(step, step * j + thickness, step * 15, step * j + thickness);
        }  //横线

//        for (int i = 1; i < 16; i++) {
//            int x = tempX + step * i;
//            g5.drawLine(tempX + step * i, tempY + step, tempX + step * i, tempY + step * 15);
//        }  //竖线
//        for (int j = 1; j < 16; j++) {
//            int y = tempY + step * j;
//            g5.drawLine(tempX + step, tempY + step * j, tempX + step * 15, tempY + step * j);
//        }  //横线


    }

    public void mouseExited(MouseEvent e) {

    }

}
