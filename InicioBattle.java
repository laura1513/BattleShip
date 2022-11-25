import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InicioBattle extends JFrame{

    private JPanel principal;
    private JLabel titulo;
    private JButton empezarJuego;
    private JButton salirJuego;

    public InicioBattle() {
        super("");
        setContentPane(principal);
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        empezarJuego.addActionListener(i ->  {
            IniciarSesion inSes = new IniciarSesion();
            setVisible(false);

            inSes.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setVisible(true);
                }
            });
        });
        salirJuego.addActionListener(i -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        InicioBattle app = new InicioBattle();
    }

    
}
