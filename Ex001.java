import javax.swing.*; 
import java.awt.event.*;
    public class Ex001 extends JFrame { 
        private JPanel panel;
        private JLabel text;
        private JTextField areaText;
        private JButton calButton;
        public Ex001()
        {
            setTitle("Square area calculator");
            setSize(310, 100);
            buildPanel();
            add(panel);
            setVisible(true);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
        }
        private void buildPanel()
        {
            text = new JLabel("Enter a Side Length ");
            areaText = new JTextField(10);
            calButton = new JButton("Calculate");
            calButton.addActionListener(new CalcButtonListener());
            panel = new JPanel();
            panel.add(text); 
            panel.add(areaText);
            panel.add(calButton);   
        }
        private class CalcButtonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                String input;
                double area;
                input = areaText.getText();
                area = Double.parseDouble(input)*Double.parseDouble(input);
                JOptionPane.showMessageDialog(null," Square area is " + area + " m^2");
            }
        }
        public static void main(String[] args) {
            new Ex001();
    }
    }