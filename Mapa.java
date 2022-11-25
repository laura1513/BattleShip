import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.Objects;

public class Mapa extends JPanel{
    private Array[][] celda;
    private int longitudAircraft = 5;
    private int logitudBattle = 4;
    private int longitudSub = 3;
    private int longitudDestroyer = 2;
    private JComboBox barcos;
    private final int COLS = 20;
    private final int ROWS = 20;
    public Mapa(JComboBox comboBox1) {
        this.barcos = comboBox1;
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

                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getX() / 40;
                        int y = e.getY() / 40;
                        String opcion = barcos.getSelectedItem().toString();
                        switch (opcion) {
                            case "Aircraft" -> {
                                label.setBackground(Color.red);
                                for (int a = x; a <= longitudAircraft+y; x++) {
                                    System.out.println(opcion);
                                }
                            }
                            case "BattleShip" -> {
                                label.setBackground(Color.green);
                                for (int b = 1; b <= logitudBattle; b++) {
                                    System.out.println(opcion);
                                }
                            }
                            case "Submarine" -> {
                                label.setBackground(Color.yellow);
                                for (int c = 1; c <= longitudSub; c++) {
                                    System.out.println(opcion);
                                }
                            }
                            case "Cruiser" -> {
                                for (int d = 1; d <= longitudSub; d++) {
                                    System.out.println(opcion);
                                }
                                label.setBackground(Color.blue);
                            }
                            case "Destroyer" -> {
                                label.setBackground(Color.magenta);
                                for (int f = 1; f <= longitudDestroyer; f++) {
                                    System.out.println(opcion);
                                }
                            }
                        }
                    }
                });
            }
        }
    }
}
