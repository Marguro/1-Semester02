import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class JCheckBox3 extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3; 
    JButton b;
    JCheckBox3() {
    setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
    14));
    setTitle("CSD1102 การโปรแกรมคอมพิวเตอร์ชั้นสูง");
    l = new JLabel("ระบบสั่งอาหาร Food Ordering System"); 
    l.setBounds(50, 50, 300, 20);
    cb1 = new JCheckBox("ข้าวผัดกระเพาหมู @50"); 
    cb1.setBounds(100, 100, 180, 20);
    cb2 = new JCheckBox("กาแฟ @30");
    cb2.setBounds(100, 150, 150, 20);
    cb3 = new JCheckBox("น้ำเปล่า @10"); 
    cb3.setBounds(100, 200, 150, 20); 
    b= new JButton("สั่งซื้อ");
    b.setBounds(100, 250, 80, 30); 
    b.addActionListener(this);
    add(l);
    add(cb1);
    add(cb2);
    add(cb3);
    add(b);
    setSize(400, 400);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation (EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent e) { 
        float amount = 0; 
        String msg = ""; 
        if (cb1.isSelected()) { 
            amount += 50;
            msg = "ข้าวผัดกระเพาหมู: 50\n";
        }    
        if (cb2.isSelected()) {
            amount += 30; 
            msg+="กาแฟ: 30\n";
        }
        if (cb3.isSelected()) {
            amount += 10; 
            msg+="น้ำเปล่า: 10\n";
    }
        msg += "-------\n";
            JOptionPane.showMessageDialog(this, msg + "ทั้งหมด:  " + amount);
}

        public static void setUIFont(javax.swing.plaf.FontUIResource f) { 
            java.util.Enumeration keys = UIManager.getDefaults().keys(); 
            while (keys.hasMoreElements()) {
                Object key = keys.nextElement(); 
                Object value = UIManager.get(key);
                if (value instanceof javax.swing.plaf.FontUIResource) { 
                    UIManager.put(key, f);
        }
    }
}
        public static void main(String[] args) {
            new JCheckBox3();
        }
}
        