import javax.swing.*;
import java.time.LocalDate;
/**
 * Created 2021-04-27
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        // Här startas ditt program
        // Design av framen
        JFrame frame = new JFrame("Vecka.nu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350,350);
        frame.setIconImage(new ImageIcon("src/a.png").getImage());
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Delar av framen

        JLabel nummer = new JLabel("Hej");
        LocalDate hej = LocalDate.now();
        nummer.setText(hej.toString());
        System.out.println(hej);

        frame.setVisible(true);

    }
}
