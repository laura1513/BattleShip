import javax.swing.*;

public class Info extends JFrame{
    private JLabel paso1;
    private JLabel titulo;
    private JLabel paso2;
    private JLabel paso3;
    private JLabel paso4;
    private JPanel panel;

    public Info() {
        super("");
        setContentPane(panel);
        setSize(900,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
