import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Event {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Event(){
      MainFrame();
   }
   private void MainFrame(){
      mainFrame = new JFrame("โปรแกรมการจัดอีเวนต์");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
             System.exit(0);
         }
     });
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void Button(){
      headerLabel.setText("Control in action: Button"); 
      JButton ok = new JButton("OK");        
      JButton Submit = new JButton("Submit");
      JButton cancel = new JButton("Cancel");
      cancel.setHorizontalTextPosition(SwingConstants.LEFT);   

      ok.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Ok Button clicked.");
         }          
      });
      Submit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Submit Button clicked.");
         }
      });
      cancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Cancel Button clicked.");
         }
      });
      controlPanel.add(ok);
      controlPanel.add(Submit);
      controlPanel.add(cancel);       
      mainFrame.setVisible(true);  
   }
   public static void main(String[] args){
      Event  Control = new Event();      
      Control.Button();
}}