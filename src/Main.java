import javax.swing.*;
import java.awt.*;
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
        frame.setSize(350,350);
        frame.setIconImage(new ImageIcon("src/a.png").getImage());
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Delar av framen

        JLabel nummer = new JLabel("",SwingConstants.CENTER);
        LocalDate hej = LocalDate.now();
        nummer.setText(hej.toString());
        frame.getContentPane().add(nummer);

        frame.pack();
        frame.setVisible(true);

    }
}
