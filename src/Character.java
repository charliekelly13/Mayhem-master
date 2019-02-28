import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Character
        extends JComponent {
    private String Name;
    private int CurrentHp;
    private int BaseHp;
    private int CurrentAtk;
    private int BaseAtk;
    private int CurrentSpd;
    private int BaseSpd;
    private int CurrentDef;
    private int BaseDef;
    private int CurrentRes;
    private int BaseRes;
    private Boolean Magic;
    private Boolean Physical;
    private BufferedImage ImageL;
    private BufferedImage ImageR;
    private int BaseMovement;
    private int CurrentMovement;
    private int x;
    private int y;
    private int row;
    private int col;
    private Boolean alive = true;

    Character(String Name, int BaseHp, int BaseAtk, int BaseSpd, int BaseDef, int BaseRes, String imageLocationL, String imageLocationR, Boolean Magic, Boolean Physical) {
        this.BaseAtk = BaseAtk;
        this.Name = Name;
        this.BaseDef = BaseDef;
        this.BaseHp = BaseHp;
        this.BaseRes = BaseRes;
        this.BaseSpd = BaseSpd;
        this.CurrentDef = BaseDef;
        this.CurrentHp = BaseHp;
        this.CurrentRes = BaseRes;
        this.CurrentSpd = BaseSpd;
        this.CurrentAtk = BaseAtk;
        this.CurrentMovement = this.BaseMovement = this.CurrentSpd / 10;
        try {
            this.ImageL = ImageIO.read(this.getClass().getResource(imageLocationL));
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: cannot load board image.");
            e.printStackTrace();
        }
        try {
            this.ImageR = ImageIO.read(this.getClass().getResource(imageLocationR));
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: cannot load board image.");
            e.printStackTrace();
        }
        this.Magic = Magic;
        this.Physical = Physical;
    }

    public Boolean isMagic() {
        return this.Magic;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    public int getCurrentHp() {
        return this.CurrentHp;
    }

    public void setCurrentHp(int HP) {
        this.CurrentHp = HP;
        if (this.CurrentHp <= 0) {
            this.alive = false;
        }
    }

    public boolean isAlive() {
        return this.alive;
    }

    public int getBaseHp() {
        return this.BaseHp;
    }

    public int getCurrentAtk() {
        return this.CurrentAtk;
    }

    public int getBaseAtk() {
        return this.BaseAtk;
    }

    public int getCurrentSpd() {
        return this.CurrentSpd;
    }

    public int getBaseSpd() {
        return this.BaseSpd;
    }

    public int getCurrentDef() {
        return this.CurrentDef;
    }

    public int getBaseDef() {
        return this.BaseDef;
    }

    public int getCurrentRes() {
        return this.CurrentRes;
    }

    public int getBaseRes() {
        return this.BaseRes;
    }

    public void moveRight() {
        ++this.col;
        this.x += 105;
        --this.CurrentMovement;
    }

    public void moveUp() {
        --this.row;
        this.y -= 105;
        --this.CurrentMovement;
    }

    public void moveDown() {
        ++this.row;
        this.y += 105;
        --this.CurrentMovement;
    }

    public void moveLeft() {
        --this.col;
        this.x -= 105;
        --this.CurrentMovement;
    }

    public int getCurrentMovement() {
        return this.CurrentMovement;
    }

    public int getBaseMovement() {
        return this.BaseMovement;
    }

    public void resetMovement() {
        this.CurrentMovement = this.BaseMovement;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public int getrow() {
        return this.row;
    }

    public int getcol() {
        return this.col;
    }

    public void paintComponent(Graphics g, Boolean direction, int x, int y, int row, int col) {
        this.x = x;
        this.y = y;
        this.row = row;
        this.col = col;
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if (direction.booleanValue()) {
            g2.drawImage(this.ImageL, x, y, 80, 80, null);
        } else {
            g2.drawImage(this.ImageR, x, y, 80, 80, null);
        }
    }
}