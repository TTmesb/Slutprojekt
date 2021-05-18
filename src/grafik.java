import java.awt.*;

public class grafik {
    private final int x;
    private final int y;

    public grafik(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void bilden(Graphics g) {
        g.fillOval(x,y,20,20);
        g.setColor(new Color(212, 212, 35));

        g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);

        g.setColor(new Color(212, 212, 35));
    }
}
