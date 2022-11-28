import javax.swing.*;

public class VentanaMapa extends JFrame {
    private Celda[][] celda;
    private Mapa map;
    private JPanel panel;
    private JPanel panelBarcos;
    private JComboBox<String> comboBox1;
    private JButton infoBarcos;
    private JLabel label;


    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(panel);
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.map = new Mapa(comboBox1);
        this.panelBarcos.add(this.map);
        infoBarcos.addActionListener(p -> {
            Info inf = new Info();
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
