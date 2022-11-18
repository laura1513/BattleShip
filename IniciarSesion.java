import javax.swing.*;

public class IniciarSesion extends JFrame{
    private JPanel iniciarSesion;
    private JLabel inicioSesion;
    private JLabel name;
    private JLabel user;
    private JPanel datos;
    private JButton siguiente;
    private JTextField tfNombre;
    private JTextField tfUser;

    public IniciarSesion() {
        super("INICIAR SESIÓN");
        setContentPane(iniciarSesion);
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        siguiente.addActionListener(a -> {
            VentanaMapa vm = new VentanaMapa();
            setVisible(false);
        });
    }
}
