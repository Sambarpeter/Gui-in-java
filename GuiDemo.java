import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiDemo {
    private JFrame frame;
    private JTextField input;
    private JLabel label;
    private JButton button2;
    private JButton button1;
    private int height,width;
    public GuiDemo(int h, int w){
        frame =new JFrame();
         button1 = new JButton("next");
         button2 = new JButton("exit");
        this.width= w;
        this.height= h;
        label= new JLabel("hello");
        input= new JTextField(10);

    }
    public void setUpGui(){
        Container cp = frame.getContentPane();
        FlowLayout flow= new FlowLayout();
        cp.setLayout(flow);
        cp.add(input);
        cp.add(label);
        cp.add(button1);
        cp.add(button2);
        frame.setSize(height,width);
        frame.setTitle(" this is my gui boy");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void setUpBottonListener(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" you just clicked me");
            }
        };
        ActionListener buttonListener2=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("beep");}
            };
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener2);}}
