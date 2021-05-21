import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class grafik {
    private final int x;
    private final int y;

    public grafik(final int x, final int y){
        this.x = x;
        this.y = y;
    }


    public void staren(Graphics g) {
        g.fillOval(x,y,20,20);
        g.setColor(new Color(0, 0, 0));

    }

    public void gubben(Graphics g) throws IOException {
        final BufferedImage gubben = ImageIO.read(new File("C:\\Code\\programmering\\Slutprojekt\\src\\pigpogabdul.png"));
        g.drawImage(gubben,x,y,null);
    }
}

