
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Kuychok extends JFrame {

    public Kuychok() {
        Ngo();
    }

    public void Ngo() {
        setSize(300, 300);
        setTitle("Kuy Chok");
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 4));
        createButton();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Kuychok();

    }

    public void createButton() {
        Button[] buttons = new Button[20];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("" + i);
            add(buttons[i]);
        }
    }
}
