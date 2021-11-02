import com.ScienceEva.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;


public class main {

    static JPanel jPanel = new JPanel();
    static  JFrame jFrame = getFrame();
    public static void main(String[] argc) throws Exception{


        // get array of list
        String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();



        jFrame.add(jPanel);
        JButton jButton = new JButton( new MyAction());
        jPanel.add(jButton);
        jPanel.add(new JTextField(30));




    }

    static class MyAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e){
            jPanel.setBackground(Color.GREEN);
        }
    }

    // function to display app
    static  JFrame getFrame() {
        JFrame jFrame = new JFrame() {};

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,300);
        jFrame.setLocation(500,400);
        jFrame.setBounds(100,100,1000,500);
        jFrame.setTitle("Program with ScienceEva");
        return  jFrame;
    }

}
