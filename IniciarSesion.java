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
    private JLabel error;

    public IniciarSesion() {
        super("INICIAR SESIÓN");
        error.setVisible(false);
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
        if (n.getText().isEmpty() || u.getText().isEmpty()) {
            error.setVisible(true);
        } else {
            VentanaMapa vm = new VentanaMapa();
            setVisible(false);
        }
    }
}
