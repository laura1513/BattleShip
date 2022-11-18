import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMapa extends JFrame{
    private JPanel mapa;
    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(mapa );
        setSize(850,1050);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
