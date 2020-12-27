import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SiparisUygulamasi extends JFrame{

    Map<String,Integer> sipraisler = new LinkedHashMap<String, Integer>();



    private JPanel panel;
    private JCheckBox iskender;
    private JCheckBox beyti;
    private JCheckBox salata;
    private JCheckBox ayran;
    private JButton siparişleriGösterButton;


    public void sipraisleriGoster(){
        String message = "";
        int tutar = 0;
        if (sipraisler.isEmpty()){
            message ="Siparişiniz Bulunmamaktadır.";
        }

        else {
            message+="Siparişler\n";
            for (Map.Entry<String, Integer> entry : sipraisler.entrySet()){

                message+= entry.getKey()+"\n";
                tutar+=entry.getValue();
            }
            message+="Toplam Tutar:"+tutar;
        }

        JOptionPane.showMessageDialog(panel,message);
    }


    public SiparisUygulamasi() {

        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        siparişleriGösterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (iskender.isSelected()){
                    sipraisler.put("İskender",15);

                }
                else{
                    sipraisler.remove("İskender");
                }

                if (beyti.isSelected()){
                    sipraisler.put("Beyti",12);

                }
                else{
                    sipraisler.remove("Beyti");
                }

                if (salata.isSelected()){
                    sipraisler.put("Salata",5);

                }
                else{
                    sipraisler.remove("Salata");
                }

                if (ayran.isSelected()){
                    sipraisler.put("Ayran",2);

                }
                else{
                    sipraisler.remove("Ayran");
                }

                sipraisleriGoster();

            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
       // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SiparisUygulamasi siparisUygulamasi = new SiparisUygulamasi();
                siparisUygulamasi.setVisible(true);
            }
        });

    }
}
