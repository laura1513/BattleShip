import javax.swing.*;

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
        });
    }

    public static void main(String[] args) {
        InicioBattle app = new InicioBattle();
    }

    
}
