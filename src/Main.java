import javax.swing.*;
import java.awt.*;

public class Main{

   static class Notepad extends JFrame{

        JFrame frame = new JFrame();

        // components

        JLabel title = new JLabel("title");
        JLabel description =new JLabel("description");

        JTextField inputtitle = new JTextField("enter text");
        JTextField inputdesc = new JTextField("enter desc");

        JCheckBox buttonOne = new JCheckBox("agree all conditions");
        JButton submit =new  JButton("submit");
        Notepad(){
            // add component
                frame.add(title);
                frame.add(inputdesc);
                frame.add(description);
                frame.add(inputtitle);
                frame.add(buttonOne);
                frame.add(submit);
                frame.setLayout(new FlowLayout(10,20,30));
                frame.setSize(900,600);
                frame.setVisible(true);
                frame.setTitle("input form");
        }
    }
    public static void main(String[] args) {

        Notepad obj = new Notepad();

    }

}