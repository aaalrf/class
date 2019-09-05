import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BankContainer_Exam extends JFrame implements ActionListener{
    static BankContainer_Exam mainJFrame=new BankContainer_Exam();
    static JLabel lbl=new JLabel();
    static JDialog diag=new JDialog(mainJFrame);
    static JButton bt_close=new JButton("关闭");
    static JButton bt_cancel=new JButton("取消");
    static MyWinListener wlist=new MyWinListener();
    static JLabel lb_name=new JLabel();
    static JLabel lb_pass=new JLabel();
    static JTextField tf_name=new JTextField();
    static JPasswordField pf_pass=new JPasswordField();
    static JButton bt_login=new JButton("登陆");
    static JButton bt_reset=new JButton("重置");
    public static void main(String[] args){
        mainJFrame.setTitle("ABC登陆");
        mainJFrame.setBounds(0,0,420,280);
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        Container container=mainJFrame.getContentPane();
        container.setLayout(null);
        container.add(lbl);
        lbl.setBounds(325,-10,150,50);
        lb_name.setText("账   号");
        lb_name.setSize(20,20);
        container.add(lb_name);
        lb_name.setBounds(120,80,50,50);
        container.add(tf_name);
        tf_name.setBounds(193,88,133,24);
        lb_pass.setText("密   码");
        lb_pass.setSize(20,20);
        container.add(lb_pass);
        lb_pass.setBounds(120,125,50,50);
        container.add(pf_pass);
        pf_pass.setBounds(193,140,133,24);
        container.add(bt_login);
        bt_login.setBounds(120,190,85,25);
        container.add(bt_reset);
        bt_reset.setBounds(255,190,85,25);
        ImageIcon image=new ImageIcon("E:\\海报.jpg");
        JLabel lb_image=new JLabel(image);
        mainJFrame.add(lb_image);
        lb_image.setBounds(0,0,420,250);
        diag.setTitle("请选择...");
        diag.setSize(200,150);
        diag.setLayout(new FlowLayout(FlowLayout.CENTER,5,20));
        diag.add(bt_close);
        diag.add(bt_cancel);
        bt_close.addActionListener(mainJFrame);
        bt_cancel.addActionListener(mainJFrame);
        mainJFrame.addWindowListener(wlist);
        mainJFrame.setVisible(true);
    }
    static class MyWinListener implements WindowListener{
        public void windowClosing(WindowEvent e){
            diag.setLocationRelativeTo(null);
            diag.setVisible(true);
        }
        public void windowOpened(WindowEvent e){
            lbl.setText("打开窗口");
        }
        public void windowActivated(WindowEvent e){
            lbl.setText("窗口被激活");
        }
        public void windowDeactivated(WindowEvent e){
            //空操作
        }
        public void windowIconified(WindowEvent e){
            mainJFrame.setTitle("窗口被最小化");
        }
        public void windowDeiconified(WindowEvent e){
            mainJFrame.setTitle("窗口被还原");
        }
        public void windowClosed(WindowEvent e){
            //空操作
        }
    }
    public void actionPerformed(ActionEvent e){
        JButton bt=(JButton)e.getSource();
        if(bt==bt_close){
            diag.dispose();
            mainJFrame.dispose();
            System.exit(0);
        }
        if(bt==bt_cancel){
            diag.setVisible(false);
        }
    }
}
