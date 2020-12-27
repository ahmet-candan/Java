import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterEkranı extends JFrame{
    private JPanel panel1;
    private JPanel registerpanel;
    private JTextField parolaa;
    private JTextField kullanıcı_adı;
    private JButton kayıtOlButton;
    private JPasswordField passwordField1;

    public RegisterEkranı() {


        add(registerpanel);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        kayıtOlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String kullanici_adi = kullanıcı_adı.getText();
                String parola = new String(passwordField1.getPassword());

                ArrayList<AnaEkran.User> user_list =AnaEkran.getUsers();
                user_list.add(new AnaEkran.User(kullanici_adi,parola));
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

    }
}
