import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.lang.Math;
import java.awt.Dimension;
class MainWindow extends JFrame {
    private JPanel panelMain;
    private JButton ButtonClick;
    double randomWidth;
    double randomHeight;

    MainWindow() {
        this.setSize((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()));
        this.setTitle("Klikaj mnie!");
        this.setUndecorated(true);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.setContentPane(panelMain);
        ButtonClick.setOpaque(true);
        ButtonClick.setBounds((int)randomWidth, (int)randomHeight, 100, 50);
        ButtonClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomWidth = Math.random();
                randomHeight = Math.random();
                randomWidth =  randomWidth *(int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()-100);
                randomHeight = randomHeight*(int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()-100);
                ButtonClick.setBounds((int)randomWidth, (int)randomHeight, 100, 50);

            }
        });
    }



}
