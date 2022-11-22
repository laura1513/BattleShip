import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalComboBoxButton;
import java.awt.*;

public class VentanaMapa extends JFrame{
    private Mapa map;
    private JPanel panel;
    private JPanel panelBarcos;
    private JComboBox comboBox1;


    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(panel);
        setSize(800,716);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createUIComponents() {
        this.panelBarcos = new JPanel(new BorderLayout());
        this.map = new Mapa();
        this.panelBarcos.add(this.map);
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }
}
