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

        JLabel vecka = new JLabel("",SwingConstants.CENTER);
        JLabel manad = new JLabel("",SwingConstants.RIGHT);
        JLabel år = new JLabel("",SwingConstants.LEFT);

        LocalDate datum = LocalDate.now();
        vecka.setPreferredSize(new Dimension(350,350));
        vecka.setFont(new Font("Arial, serif", Font.BOLD,260));
        vecka.setForeground(new Color(28, 123, 183));

        manad.setForeground(new Color(28, 123, 183));
        manad.setFont(new Font("Arial, serif", Font.BOLD,260));
        manad.setPreferredSize(new Dimension(100,100));
        int veckanu = datum.get(ChronoField.ALIGNED_WEEK_OF_YEAR)-1;
        int manadnu = datum.get(ChronoField.DAY_OF_MONTH);
        vecka.setText(String.valueOf(veckanu));
        manad.setText(String.valueOf(manadnu));
        frame.add(vecka);
        frame.add(manad);

        frame.getContentPane().setBackground(new Color(144, 192, 222));
        frame.pack();
        frame.setVisible(true);

    }
}
