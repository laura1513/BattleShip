import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Mapa extends JPanel{
    private Celda[][] celda;
    private final int COLS = 20;
    private final int ROWS = 20;
    public Mapa() {
        setLayout(new GridLayout(COLS, ROWS));
        setSize(800,800);
        for (int i =0; i<COLS; i++) {
            for (int j = 0; j<ROWS; j++) {
                JLabel label = new JLabel("");
                label.setBorder(new LineBorder(Color.black));
                label.setOpaque(true);
                label.setBackground(new Color(177,202,238));
                label.setForeground(Color.black);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                add(label);
            }
        }
    }
    public Celda[][] getCelda() {
        return celda;
    }
}
