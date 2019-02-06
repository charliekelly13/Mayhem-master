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
import java.util.Arrays;

public class GUI extends JFrame {

    // These are the variables contained in the GUI - the board components and the pieces on the board
   
    private JPanel board;
    private JTextArea infoField;
    private JScrollPane scrollPane;
    private BufferedImage boardImage;
    Frame f=new Frame();
    static ArrayList<Character> players= new ArrayList<>();
    private static int playerSize = 6;
    private Character currCharacter;
    private JButton buttonR;
    private JButton buttonL;
    private JButton buttonU;
    private JButton buttonD;
    private JButton buttonA;
    private JButton buttonM;
    private JButton buttonC;
    private JButton buttonE1;
    private JButton buttonE2;
    private JButton buttonB;
    private JButton buttonP1;
    private JButton buttonP2;
    private JButton buttonP3;
    private int team = 1;
    private int Num=0;
    Boolean first=true;
    String[] attPlay= new String[3];
    /**
     * This method creates the graphical interface for the program
     * @param setup 
     * @param setup 
     */
    GUI(ArrayList<Character> setup) {
    	players=setup;
    	int[][] map = new int[][]{
    		 {0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0 ,0},
     		 {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 2, 1, 1, 1, 1, 1, 1, 1, 3, 3, 0},
     		 {0, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
     		 {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
     		 {0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0 ,0}
     		};
    	 
     		
       currCharacter=players.get(0);
        board = new JPanel();
        setLayout(new BorderLayout());
        try {
            setIconImage(ImageIO.read(getClass().getResourceAsStream("gameBoard.jpg")));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        setSize(1327, 1050);
        setTitle("Mayhem");
        setBackground(new Color(76, 133, 99));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

   
        boardImage = null;
       try {
            boardImage = ImageIO.read(this.getClass().getResource("gameBoard.jpg"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: cannot load board image.");
        }
       infoField = new JTextArea(12, 42);
       infoField.setSize(300, 717);
       infoField.setEditable(false);
       infoField.setBackground(new Color(107, 106, 104));
       infoField.setForeground(Color.WHITE);
       infoField.setLineWrap(true);
       infoField.setWrapStyleWord(true);
       infoField.setMargin(new Insets(5, 5, 5, 5));
       infoField.setFont(new Font("Serif", Font.ITALIC, 22));
      
      infoField.setLocation(1021, 0);
      scrollPane = new JScrollPane(infoField);
       DefaultCaret caret = (DefaultCaret) infoField.getCaret();
       caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        buttonR =  new JButton( new AbstractAction(">") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();
            	if(currCharacter.getCurrentMovement()>0)
            	{
            	if(map[currCharacter.getrow()][currCharacter.getcol()+1]!=1)
            	{
            		infoField.append("Cannot move there\n");

            	}
            	else
            	{
            		map[currCharacter.getrow()][currCharacter.getcol()]=1;
                	currCharacter.moveRight();
                	if(team==1)
                	{
                	map[currCharacter.getrow()][currCharacter.getcol()]=2;
                	}
                	else
                	{
                    	map[currCharacter.getrow()][currCharacter.getcol()]=2;	
                	}
                    repaint();
            		            	}
            	}
            	else
            	{
            		infoField.append("Out of available movement\n");
            	}
            }
        });
        buttonR.setSize(100, 100);
        buttonR.setLocation(1221, 817);
        buttonL =new JButton( new AbstractAction("<") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();
            	if(currCharacter.getCurrentMovement()>0)
            	{
            	if(map[currCharacter.getrow()][currCharacter.getcol()-1]!=1)
            	{
            		infoField.append("Cannot move there\n");

            	}
            	else
            	{
            		map[currCharacter.getrow()][currCharacter.getcol()]=1;
                	currCharacter.moveLeft();
                	if(team==1)
                	{
                	map[currCharacter.getrow()][currCharacter.getcol()]=2;
                	}
                	else
                	{
                    	map[currCharacter.getrow()][currCharacter.getcol()]=3;	
                	}
                    repaint();
            		            	}
            	}
            	else
            	{
            		infoField.append("Out of available movement\n");
            	}
            }
        });
        buttonL.setSize(100, 100);
        buttonL.setLocation(1021, 817);
        buttonD =  new JButton( new AbstractAction("v") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();
            	if(currCharacter.getCurrentMovement()>0)
            	{
            	if(map[currCharacter.getrow()+1][currCharacter.getcol()]!=1)
            	{
            		infoField.append("Cannot move there\n");
            	}
            	else
            	{
            		map[currCharacter.getrow()][currCharacter.getcol()]=1;
                	currCharacter.moveDown();
                	if(team==1)
                	{
                	map[currCharacter.getrow()][currCharacter.getcol()]=2;
                	}
                	else
                	{
                    	map[currCharacter.getrow()][currCharacter.getcol()]=3;	
                	}
                    repaint();
            		            	}
            	}
            	else
            	{
            		infoField.append("Out of available movement\n");
            	}
            }
        });
        buttonD.setSize(100, 100);
        buttonD.setLocation(1121, 917);
        buttonM =  new JButton(new AbstractAction("Menu") {
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();

            	infoField.append("Name: "+ currCharacter.getName()+ "\n");
            	infoField.append("Hp: "+currCharacter.getCurrentHp()+"/"+ currCharacter.getBaseHp()+ "\n");
            	infoField.append("Atk: "+ currCharacter.getCurrentAtk()+ "\n");
            	infoField.append("Spd: "+ currCharacter.getCurrentSpd()+ "\n");
            	infoField.append("Def: "+ currCharacter.getCurrentDef()+ "\n");
            	infoField.append("Res: "+ currCharacter.getCurrentRes()+ "\n");
            	infoField.append("Movement: "+ currCharacter.getCurrentMovement()+ "\n");
            }
        });
       
        buttonM.setSize(100, 100);
        buttonM.setLocation(1221, 717);
        buttonU = new JButton( new AbstractAction("^") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();
            	if(currCharacter.getCurrentMovement()>0)
            	{
            	if(map[currCharacter.getrow()-1][currCharacter.getcol()]!=1)
            	{
            		infoField.append("Cannot move there\n");
            	}
            	else
            	{
            		map[currCharacter.getrow()][currCharacter.getcol()]=1;
                	currCharacter.moveUp();
                	if(team==1)
                	{
                	map[currCharacter.getrow()][currCharacter.getcol()]=2;
                	}
                	else
                	{
                    	map[currCharacter.getrow()][currCharacter.getcol()]=3;	
                	}
                    repaint();
            		            	}
            	}
            	else
            	{
            		infoField.append("Out of available movement\n");
            	}
            }
        });
        buttonU.setSize(100, 100);
        buttonU.setLocation(1121, 717);
        
        buttonB = new JButton( new AbstractAction("Back") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	removeMenu();
            }
        });
		
		 buttonB.setSize(75, 75);
	        buttonB.setLocation(1246, 642);
	        buttonP1 = new JButton( new AbstractAction("P1") { 
	            @Override
	            public void actionPerformed( ActionEvent e ) {
	            	removeMenu();
	            	int a = 0;
	            	while(a<playerSize)
	            	{
	            		if(players.get(a).getName().equals(attPlay[0]))
	        			{
	        				infoField.append("\n"+currCharacter.getName()+" has done " +Gameplay.Attack(currCharacter, players.get(a))+" to " + players.get(a).getName()+"\n"+players.get(a).getName()+" retaliates with "+Gameplay.Attack( players.get(a),currCharacter));
	        				if(players.get(a).getCurrentHp()<=0)
	        				{
	        					map[currCharacter.getrow()][currCharacter.getcol()]=0;	
	        					infoField.append(players.get(a).getName()+" has died\n");
	        					map[players.get(a).getrow()][players.get(a).getcol()]=1;
	        					repaint();
	        					checkWin();
	        				}	        			}
	        			a++;
	            	}
	            }
	        });
	        buttonP1.setSize(75, 75);
	        buttonP1.setLocation(1171, 642);
	        buttonP2 = new JButton( new AbstractAction("P2") { 
	            @Override
	            public void actionPerformed( ActionEvent e ) {
	            	removeMenu();
	            	int a = 0;
	            	while(a<playerSize)
	            	{
	            		if(players.get(a).getName().equals(attPlay[1]))
	        			{
	        				infoField.append(currCharacter.getName()+" has done " +Gameplay.Attack(currCharacter, players.get(a))+" to " + players.get(a).getName()+"\n"+players.get(a).getName()+" retaliates with "+Gameplay.Attack( players.get(a),currCharacter));
	        				if(players.get(a).getCurrentHp()<=0)
	        				{
	        					map[currCharacter.getrow()][currCharacter.getcol()]=0;
	        					infoField.append(players.get(a).getName()+" has died\n");
	        					map[players.get(a).getrow()][players.get(a).getcol()]=1;
	        					repaint();
	        					checkWin();
	        				}	        			
	        			}
	        			a++;
	            	}
	            }
	        });
	        buttonP2.setSize(75, 75);
	        buttonP2.setLocation(1096, 642);
	        buttonP3= new JButton( new AbstractAction("P3") { 
	            @Override
	            public void actionPerformed( ActionEvent e ) {
	            	removeMenu();
	            	int a = 0;
	            	while(a<playerSize)
	            	{
	            		if(players.get(a).getName().equals(attPlay[2]))
	        			{
	        				infoField.append(currCharacter.getName()+" has done " +Gameplay.Attack(currCharacter, players.get(a))+" to " + players.get(a).getName()+"\n"+players.get(a).getName()+" retaliates with "+Gameplay.Attack( players.get(a),currCharacter));
	        				if(players.get(a).getCurrentHp()<=0)
	        				{
	        					map[currCharacter.getrow()][currCharacter.getcol()]=0;	
	        					infoField.append(players.get(a).getName()+" has died\n");
	        					map[players.get(a).getrow()][players.get(a).getcol()]=1;
	        					repaint();
	        					checkWin();
	        				}
	        			}
	        			a++;
	            	}
	            }
	        });
	        buttonP3.setSize(75, 75);
	        buttonP3.setLocation(1021, 642);
	        buttonA =  new JButton(new AbstractAction("Attack"){ 
            @SuppressWarnings("deprecation")
			@Override
            public void actionPerformed( ActionEvent e ) {
            	if(team==1)
            	{
            		if(map[currCharacter.getrow()-1][currCharacter.getcol()]==3||map[currCharacter.getrow()][currCharacter.getcol()-1]==3||map[currCharacter.getrow()][currCharacter.getcol()+1]==3||map[currCharacter.getrow()+1][currCharacter.getcol()]==3)
                	{
                		
                		infoField.append("Capable of Attacking\n");
                		int track =0;
                		int availablePlay=0;
                		while(track<6)
                		{
                		if((currCharacter.getrow()-1==players.get(track%players.size()).getrow()&&currCharacter.getcol()==players.get(track%players.size()).getcol())||(currCharacter.getrow()+1==players.get(track%players.size()).getrow()&&currCharacter.getcol()==players.get(track%players.size()).getcol())||(currCharacter.getrow()==players.get(track%players.size()).getrow()&&currCharacter.getcol()-1==players.get(track%players.size()).getcol())||(currCharacter.getrow()==players.get(track%players.size()).getrow()&&currCharacter.getcol()+1==players.get(track%players.size()).getcol()))
                		{
                			if(players.get(track%players.size()).isAlive()==true)
                			{
                			attPlay[availablePlay]=players.get(track%players.size()).getName();
                			availablePlay++;
                			}
                		}
                		track++;
                		}
                		buttonB.setVisible(true);
                		if(attPlay[2]!=null)
                		{
                		buttonP1.setText(attPlay[0]);
                		buttonP1.setVisible(true);
                		buttonP2.setText(attPlay[1]);
                		buttonP2.setVisible(true);
             	        buttonP3.setText(attPlay[2]);
                		buttonP3.setVisible(true);
                		}
                		else if(attPlay[1]!=null)
                		{
                			buttonP1.setText(attPlay[0]);
                    		buttonP1.setVisible(true);
                    		buttonP2.setText(attPlay[1]);
                    		buttonP2.setVisible(true);
                		}
                		else if(attPlay[0]!=null)
                		{
                			buttonP1.setText(attPlay[0]);
                    		buttonP1.setVisible(true);	
                		}
                	}
                	else
                	{
                		infoField.append("Unable to attack\n");
                	}
            	}
            	else
            	{
            	if(map[currCharacter.getrow()-1][currCharacter.getcol()]==2||map[currCharacter.getrow()][currCharacter.getcol()-1]==2||map[currCharacter.getrow()][currCharacter.getcol()+1]==2||map[currCharacter.getrow()+1][currCharacter.getcol()]==2)
            	{
            		
            		infoField.append("Capable of Attacking\n");
            		int track =0;
            		int availablePlay=0;
            		while(track<6)
            		{
            		if((currCharacter.getrow()-1==players.get(track%players.size()).getrow()&&currCharacter.getcol()==players.get(track%players.size()).getcol())||(currCharacter.getrow()+1==players.get(track%players.size()).getrow()&&currCharacter.getcol()==players.get(track%players.size()).getcol())||(currCharacter.getrow()==players.get(track%players.size()).getrow()&&currCharacter.getcol()-1==players.get(track%players.size()).getcol())||(currCharacter.getrow()==players.get(track%players.size()).getrow()&&currCharacter.getcol()+1==players.get(track%players.size()).getcol()))
            		{
            			attPlay[availablePlay]=players.get(track%players.size()).getName();
            			infoField.append(attPlay[availablePlay]);
            			availablePlay++;
            		}
            		track++;
            		}
            		buttonB.setVisible(true);
            		if(attPlay[2]!=null)
            		{
            		buttonP1.setText(attPlay[0]);
            		buttonP1.setVisible(true);
            		buttonP2.setText(attPlay[1]);
            		buttonP2.setVisible(true);
         	        buttonP3.setText(attPlay[2]);
            		buttonP3.setVisible(true);
            		}
            		else if(attPlay[1]!=null)
            		{
            			buttonP1.setText(attPlay[0]);
                		buttonP1.setVisible(true);
                		buttonP2.setText(attPlay[1]);
                		buttonP2.setVisible(true);
            		}
            		else if(attPlay[0]!=null)
            		{
            			buttonP1.setText(attPlay[0]);
                		buttonP1.setVisible(true);	
            		}
            	}
            	else
            	{
            		infoField.append("Unable to attack\n");
            	}
            	}
            }
        });
        buttonA.setSize(100, 100);
        buttonA.setLocation(1021, 717);
        buttonC =  new JButton();
        buttonC.setSize(100, 100);
        buttonC.setLocation(1221, 917);
        buttonE1 =  new JButton();
        buttonE1.setSize(100, 100);
        buttonE1.setLocation(1121, 817);
        buttonE2 =  new JButton( new AbstractAction("Switch") { 
            @Override
            public void actionPerformed( ActionEvent e ) {
            	endTurn();
            	
            }
        });
        buttonE2.setSize(100, 100);
        buttonE2.setLocation(1021, 917);
        
        addComponents();
       
        setVisible(true);
    }
 

   

   
    private void addComponents() {
        
        add(buttonR);
        add(buttonL);
        add(buttonM);
        add(buttonD);
        add(buttonU);
        add(buttonA);
        add(buttonC);
        add(buttonE1);
        add(buttonE2);
        add(buttonB);
        add(buttonP1);
        add(buttonP2);
        add(buttonP3);
        removeMenu();
        add(infoField);
        // add(scrollPane);
        add(board);
    }
   
    public void endTurn()
    {
    	Num++;
  	  currCharacter=players.get(Num%players.size());
  	  while(!currCharacter.isAlive())
  	  {
  		  Num++;
      	  currCharacter=players.get(Num%players.size());
  	  }
  	  if(Num%players.size()>2)
  	  {
  		  team=2;
  	  }
  	  else
  	  {
  		  team=1;
  	  }
  	  infoField.setText("");
  	  currCharacter.resetMovement();
  	  infoField.append("Playing" + currCharacter.getName());
  	Arrays.fill(attPlay, null);
    }
    public void removeMenu()
    {
    	 buttonB.setVisible(false);
         buttonP1.setVisible(false);
         buttonP2.setVisible(false);
         buttonP3.setVisible(false);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(boardImage, 0, 25, this);
        if(first)
        {
        DrawCharacters(g);
        }
        else
        {
        	ContinueDraw(g);
        }
    }
  
    public void DrawCharacters(Graphics g)
    {
    	int a=0;
    	for(Character c: players)
    	{
    		if(a==0)
    		{
    		c.paintComponent(g, true, 10, 545, 6, 1);
    		}
    		else if(a==1)
    		{
    			c.paintComponent(g, true, 110, 545, 6, 2);
    		}
    		else if(a==2)
    		{
    			c.paintComponent(g, true,10, 445, 5, 1);
    		}else if(a==3)
    		{
    			c.paintComponent(g, false, 840, 445,5, 9);
    		}
    		else if(a==4)
    		{
    			c.paintComponent(g, false,940, 445, 5, 10);
    		}else if(a==5)
    		{
    			c.paintComponent(g, false, 940, 545,6,10);
    		}
    		
    		a++;
    	}
    	first=false;
    }
    public void ContinueDraw(Graphics g)
    {
    	int a=0;
    	for(Character c: players)
    	{
    		if(a==0&&c.isAlive())
    		{
    		c.paintComponent(g, true, c.getX(), c.getY(), c.getrow(), c.getcol());
    		}
    		else if(a==1&&c.isAlive())
    		{
    			c.paintComponent(g, true, c.getX(), c.getY(), c.getrow(), c.getcol());
    		}
    		else if(a==2&&c.isAlive())
    		{
    			c.paintComponent(g, true,c.getX(), c.getY(), c.getrow(), c.getcol());
    		}else if(a==3&&c.isAlive())
    		{
    			c.paintComponent(g, false, c.getX(), c.getY(), c.getrow(), c.getcol());
    		}
    		else if(a==4&&c.isAlive())
    		{
    			c.paintComponent(g, false, c.getX(), c.getY(), c.getrow(), c.getcol());
    		}else if(a==5&&c.isAlive())
    		{
    			c.paintComponent(g, false, c.getX(), c.getY(), c.getrow(), c.getcol());
    		}
    		
    		a++;
    	}
    	first=false;
    }
    
   public void checkWin()
   {
	   if(!players.get(0).isAlive()&&!players.get(1).isAlive()&&!players.get(2).isAlive())
	   {
		   infoField.append("Team 2 has won!");
		   System.exit(0);
	   }if(!players.get(0).isAlive()&&!players.get(1).isAlive()&&!players.get(2).isAlive())
	   {
		   infoField.append("Team 1 has won!");
		   System.exit(0);
	   }
	  
   }
}
