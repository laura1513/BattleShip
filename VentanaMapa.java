import javax.swing.*;
import java.awt.*;

public class VentanaMapa extends JFrame {
    private int longitudAircraft = 5;
    private int logitudBattle = 4;
    private int longitudSub = 3;
    private int longitudDestroyer = 2;
    private Celda[][] celda;
    private Mapa map;
    private JPanel panel;
    private JPanel panelBarcos;
    private JComboBox<String> comboBox1;


    public VentanaMapa() {
        super("BATTLESHIP");
        setContentPane(panel);
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.map = new Mapa();
        this.panelBarcos.add(this.map);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    /*
                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getX() / 40;
                        int y = e.getY() / 40;
                        for (int p = 0; p<COLS*ROWS; p++) {

                        }
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
     */
}
