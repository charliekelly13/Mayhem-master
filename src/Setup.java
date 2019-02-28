import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Setup extends JFrame {

    // These are the variables contained in the GUI - the board components and the pieces on the board


    private JPanel board;
    private JTextArea infoField;
    private BufferedImage boardImage;
    final static ArrayList<Character> players = new ArrayList<>();
    private JButton buttonLuke;
    private JButton buttonConor;
    private JButton buttonDara;
    private JButton buttonCharlie;
    private JButton buttonViolet;
    private JButton buttonAnoth;
    private JButton buttonAnna;
    private JButton buttonSomhairle;
    private JButton buttonSean;
    private JButton buttonCiaran;
    private JButton buttonVincent;
    private JButton buttonSeth;
    private JButton buttonLiam;
    private JButton buttonKerry;
    private JButton buttonCynthia;
    private JButton buttonCain;
    private JButton buttonJuliet;
    private JButton buttonJulius;
    private JButton buttonJade;
    private JButton buttonDante;
    private JButton buttonIsaac;
    private JButton buttonElaine;
    private JButton buttonDamien;
    private JButton buttonAlicia;
    private JButton buttonEnigma;
    private int keeper=0;
    /**
     * This method creates the graphical interface for the program
     * @return
     */
    @SuppressWarnings("deprecation")
    Setup() {

        board = new JPanel();
        setLayout(new BorderLayout());
        try {
            setIconImage(ImageIO.read(getClass().getResourceAsStream("Character_Art/gameBoard.jpg")));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        setSize(1000, 1100);
        setTitle("Mayhem");
        setBackground(new Color(76, 133, 99));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





        buttonLuke =  new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Luke = new Character("Luke", 50, 28, 18, 30, 30, "Character_Art/LukeModelL.png", "Character_Art/LukeModelR.png", false, true);
                players.add(Luke);
                buttonLuke.setVisible(false);
                keeper++;
            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/LukeMayhemArtLarge1.png"));
            img=scaleImg(img);
            buttonLuke.setIcon(new ImageIcon(img));
        } catch (Exception ex1) {
            System.out.println(ex1);
        }
        buttonLuke.setSize(200,200);
        buttonLuke.setLocation(0, 0);
        buttonConor =new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Conor = new Character("Conor", 34, 37, 36, 25, 23, "Character_Art/ConorModelL.png", "Character_Art/ConorModelR.png", false, true);
                players.add(Conor);
                buttonConor.setVisible(false);
                keeper++;
            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/ConorMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonConor.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonConor.setSize(200,200);
        buttonConor.setLocation(200, 0);
        buttonCharlie =  new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Charlie = new Character("Charlie", 41, 36, 33, 21, 21, "Character_Art/CharlieModelL.png", "Character_Art/CharlieModelR.png", false, true );
                players.add(Charlie);
                buttonCharlie.setVisible(false);
                keeper++;

            }
        });

        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/CharlieMayhemArtLarge1.png"));
            img=scaleImg(img);

            buttonCharlie.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonCharlie.setSize(200,200);
        buttonCharlie.setLocation(400,0);
        buttonDara =  new JButton(new AbstractAction() {
            public void actionPerformed(ActionEvent e)
            {
                Character Dara = new Character("Dara", 28, 40, 38, 20, 18, "Character_Art/DaraModelL.png", "Character_Art/DaraModelR.png", false, true);
                players.add(Dara);
                buttonDara.setVisible(false);
                keeper++;

            }
        });

        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/DaraMayhemArtLarge0.png"));
            img=scaleImg(img);

            buttonDara.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonDara.setSize(200,200);
        buttonDara.setLocation(600, 0);
        buttonViolet = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Violet = new Character("Violet", 31, 43, 29, 15, 36, "Character_Art/VioletModelL.png", "Character_Art/VioletModelR.png", true, false);
                players.add(Violet);
                buttonViolet.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/VioletMayhemLargeArt1.png"));
            img=scaleImg(img);

            buttonViolet.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonViolet.setSize(200,200);
        buttonViolet.setLocation(800,0);
        buttonAnoth = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Anoth = new Character("Anoth", 41, 38, 35, 24, 27, "Character_Art/AnothModelL.png", "Character_Art/AnothModelR.png", true, false);
                players.add(Anoth);
                buttonAnoth.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/AnothMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonAnoth.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonAnoth.setSize(200,200);
        buttonAnoth.setLocation(0, 200);

        buttonAnna = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Anna = new Character("Anna",33, 34, 46, 21, 17, "Character_Art/AnnaModelL.png", "Character_Art/AnnaModelR.png", false, true);
                players.add(Anna);
                buttonAnna.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/AnnaMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonAnna.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonAnna.setSize(200,200);
        buttonAnna.setLocation(200, 200);

        buttonSean = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Sean = new Character("Sean",35, 40, 26, 22, 36, "Character_Art/SeanModelL.png", "Character_Art/SeanModelR.png", true, false);
                players.add(Sean);
                buttonSean.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/SeanMayhemArtLarge1.png"));
            img=scaleImg(img);

            buttonSean.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonSean.setSize(200,200);
        buttonSean.setLocation(200, 400);

        buttonKerry = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Kerry = new Character("Kerry",38, 34, 31, 29, 27, "Character_Art/KerryModelL.png", "Character_Art/KerryModelR.png", false, true);
                players.add(Kerry);
                buttonKerry.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/KerryMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonKerry.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonKerry.setSize(200,200);
        buttonKerry.setLocation(200, 600);

        buttonLiam = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Liam = new Character("Liam",36, 37, 33, 20, 24, "Character_Art/LiamModelL.png", "Character_Art/LiamModelR.png", false, true);
                players.add(Liam);
                buttonLiam.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/LiamModel.png"));
            img=scaleImg(img);

            buttonLiam.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonLiam.setSize(200,200);
        buttonLiam.setLocation(400, 200);
        buttonSomhairle = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Somhairle = new Character("Somhairle",30, 28, 30, 25, 25, "Character_Art/SomhairleModelL.png", "Character_Art/SomhairleModelR.png", false, true);
                players.add(Somhairle);
                buttonSomhairle.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/SomhairlModel.png"));
            img=scaleImg(img);

            buttonSomhairle.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonSomhairle.setSize(200,200);
        buttonSomhairle.setLocation(600, 200);
        buttonSeth = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Seth = new Character("Seth",36, 38, 35, 23, 22, "Character_Art/SethModelL.png", "Character_Art/SethModelR.png", false, true);
                players.add(Seth);
                buttonSeth.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/SethArtLarge.png"));
            img=scaleImg(img);

            buttonSeth.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonSeth.setSize(200,200);
        buttonSeth.setLocation(800, 200);
        buttonVincent = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Vincent = new Character("Vincent",29, 36, 33, 16, 32, "Character_Art/VincentModelL.png", "Character_Art/VincentModelR.png", true,false);
                players.add(Vincent);
                buttonVincent.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/VincentMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonVincent.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonVincent.setSize(200,200);
        buttonVincent.setLocation(000, 400);
        buttonCiaran = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Ciaran = new Character("Ciaran",34, 30, 22, 20, 16, "Character_Art/CiaranModelL.png", "Character_Art/CiaranModelR.png", false, true);
                players.add(Ciaran);
                buttonCiaran.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/CiaranMayhemArtLarge1.png"));
            img=scaleImg(img);

            buttonCiaran.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonCiaran.setSize(200,200);
        buttonCiaran.setLocation(600, 400);

        buttonCain = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Cain = new Character("Cain",40, 42, 28, 16, 9, "Character_Art/CainModelL.png", "Character_Art/CainModelR.png", false, true);
                players.add(Cain);
                buttonCain.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/CainMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonCain.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonCain.setSize(200,200);
        buttonCain.setLocation(800, 400);

        buttonCynthia = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Cynthia = new Character("Cynthia",29, 35, 42, 12, 26, "Character_Art/CynthiaModelL.png", "Character_Art/CynthiaModelR.png", false, true);
                players.add(Cynthia);
                buttonCynthia.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/CynthiaMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonCynthia.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonCynthia.setSize(200,200);
        buttonCynthia.setLocation(400, 400);

        buttonJuliet = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Juliet = new Character("Juliet",32, 30, 34, 22, 28, "Character_Art/JulietModelL.png", "Character_Art/JulietModelR.png", false, true);
                players.add(Juliet);
                buttonJuliet.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/JulietMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonJuliet.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonJuliet.setSize(200,200);
        buttonJuliet.setLocation(0, 600);

        buttonJulius = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Julius = new Character("Julius",31, 39, 26, 29, 19, "Character_Art/JuliusModelL.png", "Character_Art/JuliusModelR.png", true, false);
                players.add(Julius);
                buttonJulius.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/JuliusLargeArt.png"));
            img=scaleImg(img);

            buttonJulius.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonJulius.setSize(200,200);
        buttonJulius.setLocation(400, 600);

        buttonEnigma = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Enigma = new Character("Enigma",37, 39, 14, 23, 23, "Character_Art/EnigmaModelL.png", "Character_Art/EnigmaModelR.png", true, false);
                players.add(Enigma);
                buttonEnigma.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/EnigmaMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonEnigma.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonEnigma.setSize(200,200);
        buttonEnigma.setLocation(800, 600);

        buttonJade = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Jade = new Character("Jade",21, 44, 37, 9, 27, "Character_Art/JadeModelL.png", "Character_Art/JadeModelR.png", false, true);
                players.add(Jade);
                buttonJade.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/JadeMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonJade.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonJade.setSize(200,200);
        buttonJade.setLocation(600, 600);

        buttonAlicia = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Alicia = new Character("Alicia",32, 36, 17, 39, 24, "Character_Art/AliciaModelL.png", "Character_Art/AliciaModelR.png", false, true);
                players.add(Alicia);
                buttonAlicia.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/AliciaMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonAlicia.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonAlicia.setSize(200,200);
        buttonAlicia.setLocation(0, 800);

        buttonDamien = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Damien = new Character("Damien",26, 46, 17, 11, 42, "Character_Art/DamienModelL.png", "Character_Art/DamienModelR.png", true, false);
                players.add(Damien);
                buttonDamien.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/DamienMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonDamien.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonDamien.setSize(200,200);
        buttonDamien.setLocation(200, 800);

        buttonDante = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Dante = new Character("Dante",36, 38, 31, 22, 13, "Character_Art/DanteModelL.png", "Character_Art/DanteModelR.png", false, true);
                players.add(Dante);
                buttonDante.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/DanteMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonDante.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonDante.setSize(200,200);
        buttonDante.setLocation(400, 800);

        buttonElaine = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Elaine = new Character("Elaine",20, 32, 50, 8, 11, "Character_Art/ElaineModelL.png", "Character_Art/ElaineModelR.png", false, true);
                players.add(Elaine);
                buttonElaine.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/ElaineMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonElaine.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonElaine.setSize(200,200);
        buttonElaine.setLocation(600, 800);

        buttonIsaac = new JButton( new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                Character Isaac = new Character("Isaac",41, 45, 26, 18, 18, "Character_Art/IsaacModelL.png", "Character_Art/IsaacModelR.png", true, false);
                players.add(Isaac);
                buttonIsaac.setVisible(false);
                keeper++;

            }
        });
        try {
            Image img = ImageIO.read(getClass().getResource("Character_Art/IsaacMayhemArtLarge.png"));
            img=scaleImg(img);

            buttonIsaac.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        buttonIsaac.setSize(200,200);
        buttonIsaac.setLocation(800, 800);
        addComponents();

        setVisible(true);
        while(keeper<6)
        {
            System.out.println();
        }
        board.setVisible(false);
        removeAll();
    }



    private Image scaleImg(Image img){
        BufferedImage resizedImg = new BufferedImage(200,200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, 200, 200, null);
        g2.dispose();


        return resizedImg;
    }

    private void addComponents() {

        add(buttonLuke);
        add(buttonConor);
        add(buttonDara);
        add(buttonCharlie);
        add(buttonViolet);
        add(buttonAnoth);
        add(buttonAnna);
        add(buttonKerry);
        add(buttonSean);
        add(buttonLiam);
        add(buttonSomhairle);
        add(buttonSeth);
        add(buttonVincent);
        add(buttonCiaran);
        add(buttonCain);
        add(buttonCynthia);
        add(buttonJuliet);
        add(buttonJulius);
        add(buttonEnigma);
        add(buttonJade);
        add(buttonDante);
        add(buttonElaine);
        add(buttonDamien);
        add(buttonIsaac);
        add(buttonAlicia);
        add(board);
    }





}

