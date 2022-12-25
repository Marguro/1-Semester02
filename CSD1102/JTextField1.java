package CSD1102;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextField1 extends JFrame implements ActionListener {
    
    JLabel l1, l2;
    JTextArea area;
    JButton b;

    JTextField1 () {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,362,249);
        setTitle("โปรแกรมทักทายคุณ!!");
        getContentPane().setLayout(null);

        final JTextField txt = new JTextField();
        txt.setBounds(103,41,144,20);
        getContentPane().add(txt);
        txt.setColumns(10);

        final JLabel lbl = new JLabel("Result");
        lbl.setBounds(103,120,144,14);
        getContentPane().add(lbl);

        JButton btn1 = new JButton("Click");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Hi : "+txt.getText());
            }
        });
        btn1.setBounds(128,72,99,23);
        getContentPane().add(btn1);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextField1();
    }
}