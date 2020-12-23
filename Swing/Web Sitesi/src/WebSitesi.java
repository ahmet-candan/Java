import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebSitesi extends JFrame{
    private JPanel panel1;
    private JButton denemeButton;
    private JTextField textField1;


    public WebSitesi(){

        add(panel1);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        denemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adres = textField1.getText();
                Desktop d = Desktop.getDesktop();
                try {
                    d.browse(new URI(adres));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (URISyntaxException uriSyntaxException)
                {
                    uriSyntaxException.printStackTrace();
                }

            }
        });
    }
}
