package CSD1102;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JTextArea;

public class JTextArea3 implements ActionListener {
    JLabel l1;
    JTextArea area;
    JButton b;
    JTextArea3() {
        JFrame f = new JFrame();
        f.setTitle("โปรแกรมทักทายคุณ 2.0");
        l1 = new JLabel();
        l1.setBounds(100, 200, 100, 30);
        area = new JTextArea(); 
        area.setBounds(100, 50, 130, 50); 
        b = new JButton("Click here!"); 
        b.setBounds(100, 130, 120, 30); 
        b.addActionListener(this);
        f.add(l1);
        f.add(area);
        f.add(b);
        f.setSize(360, 350);
        f.setLayout(null);
        f.setVisible(true);
}
    public void actionPerformed (ActionEvent e) {
        l1.setText("Hi : " + area.getText()); 
        for (String line : area.getText().split("\\n")) { 
            System.out.println(line);
}
}
    public static void main(String[] args) {
        new JTextArea3();
}
}
