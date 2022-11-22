import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Mapa extends JPanel{
    private JComboBox barcos;
    private final int COLS = 20;
    private final int ROWS = 20;
    public Mapa(JComboBox comboBox1) {
        this.barcos = comboBox1;
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
                        String opcion = barcos.getSelectedItem().toString();
                        if (Objects.equals(opcion, "Aircraft")) {
                            label.setText("Aircraft");
                        } else if (Objects.equals(opcion, "BattleShip")) {
                            label.setText("BattleShip");
                        }
                        /*switch (opcion) {
                            case "Aircraft" -> label.setText("Aircraft");
                            case "BattleShip" -> label.setText("BattleShip");
                            case "Submarine" -> label.setText("Submarine");
                            case "Crusier" -> label.setText("Crusier");
                            case "Destroyer" -> label.setText("Destroyer");
                        }*/
                    }
                });
            }
        }
    }
}
