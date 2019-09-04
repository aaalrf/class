import javax.swing.*;
import java.awt.*;

public class JPanel_Exam {
    public static void main(String[] args){
        JFrame mainJFrame=new JFrame("框架+面板示例");
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainJFrame.setSize(240,240);
        mainJFrame.setLocation(200,200);
        //Container container=new Container();
        //container=mainJFrame.getContentPane();
        mainJFrame.getContentPane().setBackground(Color.lightGray);
        mainJFrame.getContentPane().setLayout(null);
        JPanel pn1=new JPanel();
        pn1.setSize(190,180);
        pn1.setBackground(Color.green);
        pn1.setLocation(10,50);
        JButton btn=new JButton("这是一个按钮，请点击12");
        btn.setSize(170,40);
        btn.setBackground(Color.yellow);
        btn.setLocation(10,50);
        pn1.setLayout(null);
        pn1.add(btn);
        mainJFrame.add(pn1);
        mainJFrame.setVisible(true);
    }
}
