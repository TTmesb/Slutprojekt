import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.LinkedList;

/**
 * Created 2021-04-27
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        // Här startas ditt program
        // Design av framen
        final MyPanel panel = new MyPanel();
        final JFrame frame = new JFrame("Vecka.nu");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("src/a.png").getImage());
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Delar av framen

        JLabel vecka = new JLabel();

        LocalDate datum = LocalDate.now();
        vecka.setPreferredSize(new Dimension(350,350));
        vecka.setFont(new Font("Arial, serif", Font.BOLD,260));
        vecka.setForeground(new Color(28, 123, 183));

        int veckanu = datum.get(ChronoField.ALIGNED_WEEK_OF_YEAR)-1;

        vecka.setText(String.valueOf(veckanu));
        panel.add(vecka);
        frame.add(panel);
        // frame.add(vecka);
        panel.getContentPane();
        frame.pack();
        frame.setVisible(true);
    }
        public static class MyPanel extends JPanel {
        private LinkedList<star> stars;
        public MyPanel(){
            stars = new LinkedList<>();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    stars.add(new star(e.getX(),e.getY()));
                    MyPanel.this.repaint();
                }
            });

        }

            @Override
            public void paintComponent(final Graphics g) {
                super.paintComponent(g);
                stars.stream().forEach((e)->e.render(g));
                g.setColor(Color.black);
                g.fillOval(0,0,40,40);

            }

            public Dimension getPreferredSize() {
                return new Dimension(400, 400);
            }

            public void getContentPane() {
            setBackground(new Color(144, 192, 222));
            }
        }
}
