import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;

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
        LocalDate datum = LocalDate.now();
        nummer.setPreferredSize(new Dimension(350,350));
        nummer.setFont(new Font("Arial, serif", Font.BOLD,260));
        nummer.setForeground(new Color(28, 123, 183));
        int vecka = datum.get(ChronoField.ALIGNED_WEEK_OF_YEAR)-1;


        nummer.setText(String.valueOf(vecka));
        frame.getContentPane().setBackground(new Color(144, 192, 222));
        frame.add(nummer);

        frame.pack();
        frame.setVisible(true);

    }
}
