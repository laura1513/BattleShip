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
        setSize(1000,716);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createUIComponents() {
        this.panelBarcos = new JPanel(new BorderLayout());
        this.comboBox1= new JComboBox<String>();
        comboBox1.addItem("Aircraft");
        comboBox1.addItem("BattleShip");
        comboBox1.addItem("Submarine");
        comboBox1.addItem("Crusier");
        comboBox1.addItem("Destroyer");
        this.map = new Mapa(this.comboBox1);
        this.panelBarcos.add(this.map);
    }
}
