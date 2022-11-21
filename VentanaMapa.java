import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class VentanaMapa extends JFrame{
    private final int COLS = 20;
    private final int ROWS = 20;
    private JPanel panel;
    private JPanel panelBarcos;
    private JComboBox comboBox1;

    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(panel);
        setSize(800,800);
        for (int i =0; i<(COLS*ROWS); i++) {
            JLabel label = new JLabel("");
            label.setBorder(new LineBorder(Color.black));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(label);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
