import javax.swing.*;
import java.awt.*;

public class Info extends JFrame{
    private JPanel info;
    private JLabel titulo;
    private JLabel paso1;
    private JLabel paso2;
    private JLabel aircraft;
    private JLabel battle;
    private JLabel paso3;
    private JLabel submarine;
    private JLabel paso4;
    private JLabel cruiser;
    private JLabel paso5;
    private JLabel destroyer;

    public  Info() {
        super("INFO");
        setContentPane(info);
        setSize(700,600);
        aircraft.setIcon(new ImageIcon("aircraft.png"));
        battle.setIcon(new ImageIcon(("battleship.png")));
        submarine.setIcon(new ImageIcon("submarine.png"));
        cruiser.setIcon(new ImageIcon("cruiser.png"));
        destroyer.setIcon(new ImageIcon("destroyer.png"));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
