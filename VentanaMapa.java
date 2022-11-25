import javax.swing.*;
import java.awt.*;

public class VentanaMapa extends JFrame{
    private Mapa map;
    private JPanel panel;
    private JPanel panelBarcos;
    private JComboBox<String> comboBox1;


    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(panel);
        setSize(900,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.map = new Mapa(this.comboBox1);
        this.panelBarcos.add(this.map);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
