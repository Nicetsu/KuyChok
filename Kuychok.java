
import javax.swing.JFrame;

public class Kuychok extends JFrame {

    public Kuychok() {
        Ngo();
    }

    public void Ngo() {
        setSize(300, 300);
        setTitle("Kuy Chok");
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Kuychok();

    }
}
