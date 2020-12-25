import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelimeHarfSayısı extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;
    private JButton kelimeVeHarfSayısıButton;
    private JLabel harf_a;
    private JLabel kelime_a;

    public KelimeHarfSayısı() {

        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,500);
        kelimeVeHarfSayısıButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String metin = textArea1.getText();
                int harf_sayisi = 0;
                int kelime_sayisi = 0;

                for (int i = 0; i < metin.length(); i++) {
                    if (metin.charAt(i) != ' '){
                        harf_sayisi++;

                    }
                }

                String[] array = metin.split(" ");

                for (String kelime:array) {
                    kelime_sayisi++;
                }
                String sayi1 = String.valueOf(harf_sayisi);
                String sayi2 = String.valueOf(kelime_sayisi);
                harf_a.setText(sayi1 );
                kelime_a.setText(sayi2);

            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                KelimeHarfSayısı kelimeHarfSayısı = new KelimeHarfSayısı();
                kelimeHarfSayısı.setVisible(true);
            }
        });


    }
}
