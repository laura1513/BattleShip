import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mapa extends JPanel{
    private VentanaMapa vm;
    private final int COLS = 20;
    private final int ROWS = 20;
    public Mapa() {
        setLayout(new GridLayout(COLS, ROWS, 0, 0));
        setSize(650,650);
        for (int i =0; i<COLS; i++) {
            for (int j = 0; j<ROWS; j++) {
                JLabel label = new JLabel("");
                label.isOpaque();
                label.setBorder(new LineBorder(Color.black));
                label.setOpaque(true);
                label.setBackground(new Color(177,202,238));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                add(label);

                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }
                });
            }
        }
    }
}
