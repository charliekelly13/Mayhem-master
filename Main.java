package gameengine;

import java.util.ArrayList;

import Character;

public class Main  {
	
	 private Main() {
		 
		 Setup frame=new Setup();
		 final ArrayList<Character> play = frame.players;
		 frame.setVisible(false);
	        new GUI(play);
	    }

	    public static void main(String args[]) {
	        new Main();
	    }
 
}
