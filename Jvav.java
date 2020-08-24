import javax.swing.*;
import java.awt.*;
public class Jvav{
    public static void main(String[] args){
        JFrame frame=new JFrame("J V A V");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jvav = new JLabel("J V A V");
        jvav.setSize(100, 100);
        JLabel jvav_and_you = new JLabel("J V A V与您");
        JLabel jvav_free_download = new JLabel("免费J V A V下 载");
        JPanel panel=new JPanel();
        panel.add(jvav);
        panel.add(jvav_and_you);
        panel.add(jvav_free_download);
        frame.add(panel);
        frame.setVisible(true);
    }
}