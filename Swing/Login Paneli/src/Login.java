import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame{
    private JPanel panel;
    private JButton giris;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public Login() {
        giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullnıcı_adi = textField1.getText();
                String parola = new String(passwordField1.getPassword());
                String mesaj;

                if (kullnıcı_adi.equals("Ahmet") && parola.equals("12345")){
                    mesaj= "Hoşgeldiniz "+kullnıcı_adi;
                }

                else {
                   mesaj= "Kullanıcı Adı veya parola hatalı";
                }

                JOptionPane.showMessageDialog(panel,mesaj);

                textField1.setText("");
                passwordField1.setText("");

            }
        });

    }
    public static void main(String[]args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });

    }
}


