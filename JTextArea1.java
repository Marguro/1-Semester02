import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
public class JTextArea1 {
    public static void main(String[] args) { 
        JFrame myFrame = new JFrame(); 
        myFrame.setLayout(null);
        JTextArea textarea = new JTextArea();
        textarea.setText("Swing");
        textarea.append(" JTextArea");
        textarea.insert("Java", 0);
        JScrollPane textareaScroll = new JScrollPane(textarea); 
        textareaScroll.setLocation(10, 10);
        textareaScroll.setSize(240, 120);
        myFrame.add(textareaScroll);
        myFrame.setSize(500, 300);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
