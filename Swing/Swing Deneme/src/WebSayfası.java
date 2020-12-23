import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WebSayfası extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel1;
    private JButton button1;

    public WebSayfası(){
        add(panel1);
        setSize(500,300);
        setTitle("Firs Swing Project");
        setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad,soyad;
                ad=textField1.getText();
                soyad=textField2.getText();
                System.out.println(ad+" "+soyad);

            }
        });
    }
}
