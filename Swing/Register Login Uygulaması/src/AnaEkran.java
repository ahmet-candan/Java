import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AnaEkran extends JFrame{
    private JPanel panel;
    private JPanel loginpanel;
    private JPanel registerpanel;
    private JButton kayıtOlButton;
    private JButton girişYapButton;
    private JTextField Kullanıcı;
    private JPasswordField passwordField1;
    private JTextField Parola;

    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        AnaEkran.users = users;
    }

    static class User{
        private String kullancı;
        private String parola;

        public User(String kullancı, String parola) {
            this.kullancı = kullancı;
            this.parola = parola;
        }

        public String getKullancı() {
            return kullancı;
        }

        public void setKullancı(String kullancı) {
            this.kullancı = kullancı;
        }

        public String getParola() {
            return parola;
        }

        public void setParola(String parola) {
            this.parola = parola;
        }
    }

    public AnaEkran () {

        add(panel);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        kayıtOlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RegisterEkranı registerEkranı = new RegisterEkranı();
                registerEkranı.setVisible(true);

            }
        });
        girişYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanici = Kullanıcı.getText();
                String parola = new String(passwordField1.getPassword());

                if (users.size()==0){
                    JOptionPane.showMessageDialog(panel,"Hiçbir kullanıcı bulunmamaktadır");
                }

                else {
                    for (User user:users){
                        if (user.getKullancı().equals(kullanici)&& user.getParola().equals(parola)){
                            JOptionPane.showMessageDialog(panel,"Hoşgeldin "+kullanici);
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(panel,"Böyle bir kullanıcı bulunmamaktadır. Lütfen kayıt olun");
                }
            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnaEkran anaEkran = new AnaEkran();
                anaEkran.setVisible(true);

            }
        });



    }

}
