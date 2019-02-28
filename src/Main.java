import java.util.ArrayList;
public class Main  {
    public static void main(String args[]) {
        Setup frame=new Setup();
        final ArrayList<Character> play = frame.players;
        frame.setVisible(false);
        new GUI(play);
    }

}