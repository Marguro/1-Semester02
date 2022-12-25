package CSD1102;
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
    setTitle("การโปรแกรมคอมพิวเตอร์ชั้นสูง");
    l = new JLabel("ระบบสั่งน้ำชานม"); 
    l.setBounds(50, 50, 300, 20);
    cb1 = new JCheckBox("ชานมปั่นคาราเมล @40"); 
    cb1.setBounds(100, 100, 180, 20);
    cb2 = new JCheckBox("ชาไทย @30");
    cb2.setBounds(100, 150, 150, 20);
    cb3 = new JCheckBox("ใส่ไข่มุก @10"); 
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
            amount += 40;
            msg = "ชานมปั่นคาราเมล : 40\n";
        }    
        if (cb2.isSelected()) {
            amount += 30; 
            msg+="ชาไทย : 30\n";
        }
        if (cb3.isSelected()) {
            amount += 10; 
            msg+="เพิ่มไข่มุก : 10\n";
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
        