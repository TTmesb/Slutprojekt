import java.awt.*;

public class star {
    private final int x;
    private final int y;

    public star(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics g) {
        g.fillOval(x,y,40,40);
        g.setColor(Color.black);
    }
}
