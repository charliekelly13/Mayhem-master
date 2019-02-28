
import javax.swing.*;

public class Gameplay extends JFrame {

    // These are the variables contained in the GUI - the board components and the pieces on the board


    public static int Attack(Character Attacker, Character Defender)
    {
        int Damage=0;
        if(Attacker.isMagic())
        {
            Damage = Attacker.getCurrentAtk()- Defender.getCurrentRes();
        }
        else
        {
            Damage = Attacker.getBaseAtk()- Defender.getBaseDef();
        }
        if(Damage<0)
        {
            Damage=0;
        }

        Defender.setCurrentHp(Defender.getCurrentHp()-Damage);
        return Damage;
    }






}