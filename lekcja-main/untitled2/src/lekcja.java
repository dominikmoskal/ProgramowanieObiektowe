import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class lekcja extends JFrame{


    private JPanel panel1;
    private JButton loginButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextPane textPane1;
    private JPanel JPanel1;
    private JPasswordField passwordField1;

    public static void main(String[] args){
        lekcja Example1 = new lekcja();
        Example1.setVisible(true);//wyswietla ramki

    }

    public lekcja() {
        super("logowanie");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelText.setText("User name:"+ textField1.getText()+ ", \t Password: "+ new String(passwordField1.getPassword()));

            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
