package tsh25_11_8;

import javax.swing.*;
import java.awt.*;

public class MPanel extends JPanel {
    public int

    public void paint(Graphics g){
        //保留父类原有方法
        //super表示父类对象，this表示本类对象
        super.paint(g);

        System.out.println("painting...");

        //持续绘制棋盘


    }
}
