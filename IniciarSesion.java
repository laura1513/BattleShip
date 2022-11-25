import javax.swing.*;

public class IniciarSesion extends JFrame{
    private InicioBattle ib;
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
        siguiente.addActionListener(a -> {
        validarDatos(tfNombre, tfUser);
        });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void validarDatos(JTextField n, JTextField u) {
        boolean bien = true;
        if (n.getText().isEmpty()) {
            System.out.println("Cadena nombre vacía");
            bien = false;
        }
        if (u.getText().isEmpty()) {
            System.out.println("Cadena user vacía");
            bien = false;
        }
        if (bien) {
            VentanaMapa vm = new VentanaMapa();
            setVisible(false);
        }
    }
}
