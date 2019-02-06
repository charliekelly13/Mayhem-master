package gameengine;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.DefaultCaret;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

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
