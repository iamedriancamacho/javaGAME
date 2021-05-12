package com.Majika;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame implements ActionListener {
//player1

    int winner;
    public float stopwatch;
    private final int ICRAFT_X = 120; //initially
    private final int ICRAFT_Y = 200; //initially
    private final int DELAY = 10; //initally 10
    private Timer timer;
    SpaceShip spaceShip;
    //player2
    private final int ICRAFT_X2 = 720;
    private final int ICRAFT_Y2 = 200;
    SpaceShip2 spaceShip2;
    //
    float lifep1 = 1;
    float lifep2 = 1;
    //end
    boolean deductlifep1 = false;
    DBConnector db;
    Spawn spawn = new Spawn();
    Potion apple = new Potion();

    ImageIcon imageBG = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\undergroundbg.gif");
    Image bg = imageBG.getImage();
    ImageIcon imageI = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\immunity.gif");
    Image immune = imageI.getImage();
    ImageIcon imageP = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\potion.png");
    Image potion = imageP.getImage();

    public Main() {
        initComponents();

        Game.setVisible(false);
        Main.setVisible(true);
        Account.setVisible(false);
        Howtoplay.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        howtoplay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        asasfasfas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JButton();
        finalplay1name = new javax.swing.JLabel();
        finalplay2name = new javax.swing.JLabel();
        decision3 = new javax.swing.JLabel();
        decision4 = new javax.swing.JLabel();
        decision1 = new javax.swing.JLabel();
        decision2 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        ww1 = new javax.swing.JLabel();
        www1 = new javax.swing.JLabel();
        wwww1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        qq2 = new javax.swing.JLabel();
        qqq2 = new javax.swing.JLabel();
        qqqq2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        gameON = new javax.swing.JLabel();
        play1name = new javax.swing.JTextField();
        play2name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        awdawdawdawdawd = new javax.swing.JLabel();
        awwrgba = new javax.swing.JLabel();
        Howtoplay = new javax.swing.JPanel();
        ssedsdvsdv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Game = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        health2 = new javax.swing.JLabel();
        round2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        health1 = new javax.swing.JLabel();
        round1 = new javax.swing.JLabel();
        gameHistory = new javax.swing.JTextArea();
        initBoard();
        Majika = new javax.swing.JPanel(){
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g); // Do the original draw
                //g.drawLine(10, 10, 60, 60); // Write here your coordinates
                //System.out.println("ni work");
                doDrawing(g);
                Toolkit.getDefaultToolkit().sync();
            }
        };
        jLabel11 = new javax.swing.JLabel();
        violet = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\undergroundbgsample.png")); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setBackground(new java.awt.Color(34, 15, 41));
        Main.setMaximumSize(new java.awt.Dimension(1280, 720));
        Main.setMinimumSize(new java.awt.Dimension(1280, 720));
        Main.setPreferredSize(new java.awt.Dimension(1280, 720));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edrian\\Desktop\\trial.gif")); // NOI18N
        Main.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\majika.png")); // NOI18N
        jLabel12.setText("jLabel12");
        Main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edrian\\Desktop\\trial.gif")); // NOI18N
        Main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\quit.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        howtoplay.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Options.png")); // NOI18N
        howtoplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                howtoplayMouseClicked(evt);
            }
        });
        Main.add(howtoplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Play.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        Main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Moira\\Images\\a 2d -  shooting game.png")); // NOI18N
        Main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        asasfasfas.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\undergroundbgsample.png")); // NOI18N
        asasfasfas.setMaximumSize(new java.awt.Dimension(1280, 720));
        asasfasfas.setMinimumSize(new java.awt.Dimension(1280, 720));
        asasfasfas.setName(""); // NOI18N
        Main.add(asasfasfas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\violetbg.png")); // NOI18N
        jLabel10.setText("jLabel10");
        Main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        Account.setMaximumSize(new java.awt.Dimension(1280, 720));
        Account.setMinimumSize(new java.awt.Dimension(1280, 720));
        Account.setPreferredSize(new java.awt.Dimension(1280, 720));
        Account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirm.setBackground(new java.awt.Color(34, 15, 41));
        btnConfirm.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("confirm");
        btnConfirm.setBorder(null);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        Account.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 150, 50));

        finalplay1name.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        finalplay1name.setForeground(new java.awt.Color(255, 255, 255));
        finalplay1name.setText("Name");
        Account.add(finalplay1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, -1, -1));

        finalplay2name.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        finalplay2name.setForeground(new java.awt.Color(255, 255, 255));
        finalplay2name.setText("name");
        Account.add(finalplay2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, -1, -1));

        decision3.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        decision3.setForeground(new java.awt.Color(255, 255, 255));
        decision3.setText("PLayer 1");
        Account.add(decision3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 340, -1, -1));

        decision4.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        decision4.setForeground(new java.awt.Color(255, 255, 255));
        decision4.setText("Player 2");
        Account.add(decision4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 470, -1, -1));

        decision1.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        decision1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png")); // NOI18N
        decision1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decision1MouseClicked(evt);
            }
        });
        Account.add(decision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, -1));

        decision2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png")); // NOI18N
        Account.add(decision2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, -1, -1));

        w1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png")); // NOI18N
        w1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w1MouseClicked(evt);
            }
        });
        Account.add(w1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        ww1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\hIcon.png")); // NOI18N
        ww1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ww1MouseClicked(evt);
            }
        });
        Account.add(ww1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        www1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\iIcon.png")); // NOI18N
        www1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                www1MouseClicked(evt);
            }
        });
        Account.add(www1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        wwww1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\pIcon.png")); // NOI18N
        wwww1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wwww1MouseClicked(evt);
            }
        });
        Account.add(wwww1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        q2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png")); // NOI18N
        q2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                q2MouseClicked(evt);
            }
        });
        Account.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        qq2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\hIcon.png")); // NOI18N
        qq2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qq2MouseClicked(evt);
            }
        });
        Account.add(qq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        qqq2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\iIcon.png")); // NOI18N
        qqq2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qqq2MouseClicked(evt);
            }
        });
        Account.add(qqq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        qqqq2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\pIcon.png")); // NOI18N
        qqqq2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qqqq2MouseClicked(evt);
            }
        });
        Account.add(qqqq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        jLabel16.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("create player names              choose your powers              check final decision");
        Account.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1270, -1));

        jLabel17.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Step 1                                         step 2                                      step 3");
        Account.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 1260, 50));

        gameON.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Play.png")); // NOI18N
        gameON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameONMouseClicked(evt);
            }
        });
        Account.add(gameON, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 640, -1, -1));

        play1name.setBackground(new java.awt.Color(34, 15, 41));
        play1name.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        play1name.setForeground(new java.awt.Color(255, 255, 255));
        play1name.setBorder(null);
        play1name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play1nameActionPerformed(evt);
            }
        });
        Account.add(play1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 220, -1));

        play2name.setBackground(new java.awt.Color(34, 15, 41));
        play2name.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        play2name.setForeground(new java.awt.Color(255, 255, 255));
        play2name.setBorder(null);
        Account.add(play2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 220, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\userpass.png")); // NOI18N
        Account.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\userpass.png")); // NOI18N
        Account.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        awdawdawdawdawd.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\majika.png")); // NOI18N
        Account.add(awdawdawdawdawd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        awwrgba.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\violetbg.png")); // NOI18N
        awwrgba.setText("sefe");
        Account.add(awwrgba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Howtoplay.setBackground(new java.awt.Color(34, 15, 41));
        Howtoplay.setMaximumSize(new java.awt.Dimension(1280, 720));
        Howtoplay.setPreferredSize(new java.awt.Dimension(1280, 720));
        Howtoplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ssedsdvsdv.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\quit.png")); // NOI18N
        ssedsdvsdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssedsdvsdvMouseClicked(evt);
            }
        });
        Howtoplay.add(ssedsdvsdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 660, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\howtoplay.png")); // NOI18N
        Howtoplay.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\violetbg.png")); // NOI18N
        Howtoplay.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Howtoplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Game.setBackground(new java.awt.Color(34, 15, 41));
        Game.setForeground(new java.awt.Color(34, 15, 41));
        Game.setMaximumSize(new java.awt.Dimension(1280, 720));
        Game.setMinimumSize(new java.awt.Dimension(1280, 720));
        Game.setName(""); // NOI18N
        Game.setPreferredSize(new java.awt.Dimension(1280, 720));
        Game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Player.png")); // NOI18N
        Game.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        health2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\health\\h1.png")); // NOI18N
        health2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                health2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Game.add(health2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        round2.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Action icons.png")); // NOI18N
        Game.add(round2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Player.png")); // NOI18N
        Game.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        health1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\health\\h1.png")); // NOI18N
        health1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                health1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Game.add(health1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        round1.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\Action icons.png")); // NOI18N
        Game.add(round1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        gameHistory.setBackground(new java.awt.Color(91, 80, 118));
        gameHistory.setColumns(20);
        gameHistory.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        gameHistory.setForeground(new java.awt.Color(255, 255, 255));
        gameHistory.setLineWrap(true);
        gameHistory.setRows(5);
        gameHistory.setText("game history");
        gameHistory.setWrapStyleWord(true);
        gameHistory.setBorder(null);
        Game.add(gameHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, 210, 360));

        Majika.setMaximumSize(new java.awt.Dimension(914, 548));
        Majika.setMinimumSize(new java.awt.Dimension(914, 548));
        Majika.setPreferredSize(new java.awt.Dimension(535, 380));
        Majika.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MajikaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Majika.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Game.add(Majika, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 548));

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\history.png")); // NOI18N
        Game.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 720));

        violet.setIcon(new javax.swing.ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\violetbg.png")); // NOI18N
        violet.setText("jLabel11");
        Game.add(violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initBoard() {

        addKeyListener(new TAdapter());
        addKeyListener(new TAdapter2());
        setFocusable(true);

        ImageIcon imageP = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\potion.png");
        Image potion = imageP.getImage();

        spaceShip = new SpaceShip(ICRAFT_X, ICRAFT_Y);
        spaceShip2 = new SpaceShip2(ICRAFT_X2, ICRAFT_Y2);
        timer = new Timer(DELAY, this);
        timer.start();

    }
    int test = 0;
    boolean immuneUse = false;
    boolean potionUse = false;
    int immuneDur = 0;
    int point = 0;

    int TimeIn;
    int immuneTime = 10;
    int immuneTimeOut = immuneTime + 10;
    int potionTime = apple.potionTime;
    int potionTimeOut = apple.potionTimeOut;
    int randx = TempX();
    int randy = TempY();
    int prandx = pTempX();
    int prandy = pTempY();

//     potionUse = apple.potionUse;
//            potionTimeOut = apple.potionTime;
//            potionTime = apple.potionTime + 5;
//            potionTimeOut = apple.potionTime + 10;
    private int TempX() {
        int temp = (int) spawn.getRandomIntegerRange(100, 792);
        return temp;

    }

    private int TempY() {
        int temp = (int) spawn.getRandomIntegerRange(148, 424);
        return temp;

    }

    private int pTempX() {
        int temp = (int) spawn.getRandomIntegerRange(100, 792);
        return temp;

    }

    private int pTempY() {
        int temp = (int) spawn.getRandomIntegerRange(148, 424);
        return temp;

    }

    private void doDrawing(Graphics g) {
        stopwatch++;
        if (immuneUse
                == false) {
            immuneDur = 0;
        }
        System.out.println("stopwatch: " + (int) stopwatch / 1500);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bg, 0, 0, this); //for background
        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(),
                spaceShip.getY(), this);
        g2d.drawImage(spaceShip2.getImage(), spaceShip2.getX(),
                spaceShip2.getY(), this);

        Rectangle player1 = new Rectangle(spaceShip.getX(), spaceShip.getY(), 20, 32);
        Rectangle player2 = new Rectangle(spaceShip2.getX(), spaceShip2.getY(), 20, 32);

        g2d.drawString("immuneTime: " + immuneTime + " immuneTimeOut: " + immuneTimeOut, 400, 400);
        g2d.drawString("potionTime: " + potionTime + " potionTimeOut: " + potionTimeOut, 200, 200);

        TimeIn = (int) stopwatch / 1500;
        if (TimeIn >= potionTime && TimeIn <= potionTimeOut) { //potion paint

            //boolean potion1 = apple.potion1, potion2 = apple.potion2;
            apple.lifep1 = lifep1;
            apple.lifep2 = lifep2;
            apple.Potion(g2d, player1, player2, prandx, prandy);
            lifep1 = apple.lifep1;
            lifep2 = apple.lifep2;
            potionTime = apple.potionTime;
            potionTimeOut = apple.potionTimeOut;

        }
        if (TimeIn >= immuneTime && TimeIn <= immuneTimeOut) { //immune paint
            Rectangle pot = new Rectangle(randx, randy, 40, 40); //for immune
            g2d.drawImage(immune, randx, randy, this); //the immune
            //diri ka ning stop sa apple
            //g2d.drawImage(potion, randx, randy, null);
            //System.out.println("immuneTime: " + immuneTime);
            if (pot.intersects(player1)) {
                randx = TempX();
                randy = TempY();
                immuneUse = true;
                point = 1;
                immuneTimeOut = immuneTime;
                immuneTime = immuneTime + 30;
                immuneTimeOut = immuneTime + 10;

                System.out.println("new potion: " + immuneTime);
            } else if (pot.intersects(player2)) {
                randx = TempX();
                randy = TempY();
                immuneUse = true;
                point = 2;
                immuneTimeOut = immuneTime;
                immuneTime = immuneTime + 30;
                immuneTimeOut = immuneTime + 10;
            }

        }

        boolean immunity1 = false, immunity2 = false;
        if (immuneUse) {
            //System.out.println("immuneTime: " + immuneTime + " immuneTimeOut: " + immuneTimeOut);

            if (point == 1) {
                immuneDuration(g2d, spaceShip.getX(), spaceShip.getY()); //immunity
                immunity1 = true;
                if (lifep1 <= 1) {
                    lifep1 = 1;
                }

            } else if (point == 2) {
                immuneDuration(g2d, spaceShip2.getX(), spaceShip2.getY()); //immunity
                immunity2 = true;
                if (lifep2 <= 1) {
                    lifep2 = 1;
                }

            }
        }

        List<Missile> missiles = spaceShip.getMissiles();
        List<Missile> missiles2 = spaceShip2.getMissiles();

        for (Missile missile : missiles2) { //for player2

            g2d.drawImage(missile.getImage(), missile.getX(),
                    missile.getY(), this);
            Rectangle r2 = new Rectangle(missile.getX(), missile.getY(), 60, 32);

            if (player1.intersects(r2)) { //collision detection
                g.drawString("Minus life si p1", 300, 300);
                if (immunity1) {
                    lifep1 += 0;
                } else {
                    lifep1 += 0.001;
                }
                //immunity1 = false;

                if (lifep1 >= 16) {
                    lifep1 = 16;
                    winner = 2;
                    win(winner);
                }
            }
        }
        ImageIcon heart1 = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\health\\h" + (int) lifep1 + ".png");
        health1.setIcon(heart1);

        for (Missile missile : missiles) { //forplayer1

            g2d.drawImage(missile.getImage(), missile.getX(),
                    missile.getY(), this);

            g2d.drawRect(missile.getX(), missile.getY(), 60, 32);
            Rectangle r2 = new Rectangle(missile.getX(), missile.getY(), 60, 32);
            if (player2.intersects(r2)) { //collision detection
                g.drawString("Minus life si p2", 300, 300);
                if (immunity2) {
                    lifep2 += 0;
                } else {
                    lifep2 += 0.001;
                }
                if (lifep2 >= 16) {
                    lifep2 = 16;
                    winner = 1;
                    win(winner);

                }

            }
        }
        ImageIcon heart2 = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\UserInterface\\health\\h" + (int) lifep2 + ".png");
        health2.setIcon(heart2);

    }

    private void immuneDuration(Graphics2D x, int a, int b) {
        Timer ff = new Timer(1000, null);
        ff.start();
        immuneDur++;
        //System.out.println("time is: " + immuneDur / 1500);
        if (immuneDur / 1500 <= 6) {
            x.drawImage(immune, a - 23, b - 20, this);
        } else {
            ff.stop();
            immuneUse = false;
        }

    }

    private void win(int winner) {
        if (winner == 1) {
            System.out.println("PLAYER 1 WINS!");
        } else if (winner == 2) {
            System.out.println("PLAYER 2 WINS!");
        }
        timer.stop();
    }

    public void actionPerformed(ActionEvent e) {

        updateMissiles();
        updateSpaceShip();

        repaint();
    }

    private void updateMissiles() {

        List<Missile> missiles = spaceShip.getMissiles();

        for (int i = 0; i < missiles.size(); i++) {
            Missile missile = missiles.get(i);
            if (missile.isVisible()) {
                missile.move();
            } else {
                missiles.remove(i);
            }
        }
        //for player2
        List<Missile> missiles2 = spaceShip2.getMissiles();

        for (int i = 0; i < missiles2.size(); i++) {
            Missile missile = missiles2.get(i);
            if (missile.isVisible()) {
                missile.move2();
            } else {
                missiles2.remove(i);
            }
        }
    }

    private void updateSpaceShip() {

        spaceShip.move();
        spaceShip2.move();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            spaceShip.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            spaceShip.keyPressed(e);
        }
    }

    private class TAdapter2 extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            spaceShip2.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            spaceShip2.keyPressed(e);
        }
    }


    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Game.setVisible(false);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Main.setVisible(false);
        Account.setVisible(true);
        //Game.setVisible(true);


    }//GEN-LAST:event_jLabel4MouseClicked

    private void MajikaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MajikaAncestorAdded
        //initBoard();

    }//GEN-LAST:event_MajikaAncestorAdded

    private void health1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_health1AncestorAdded
        //10 is dead

    }//GEN-LAST:event_health1AncestorAdded

    private void health2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_health2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_health2AncestorAdded

    private void howtoplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howtoplayMouseClicked
        Main.setVisible(false);
        Game.setVisible(false);
        Account.setVisible(false);
        Howtoplay.setVisible(true);
    }//GEN-LAST:event_howtoplayMouseClicked

    private void ssedsdvsdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssedsdvsdvMouseClicked
        // TODO add your handling code here:
        Howtoplay.setVisible(false);
        Main.setVisible(true);
        Game.setVisible(false);
    }//GEN-LAST:event_ssedsdvsdvMouseClicked

    private void gameONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameONMouseClicked
        // TODO add your handling code here:
        try {
            play1name.getText();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incorrect playername");
        }

        Account.setVisible(false);
        Game.setVisible(true);
    }//GEN-LAST:event_gameONMouseClicked

    private void decision1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decision1MouseClicked

    }//GEN-LAST:event_decision1MouseClicked

    private void wwww1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wwww1MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\pIcon.png");
        decision1.setIcon(decision);
    }//GEN-LAST:event_wwww1MouseClicked

    private void www1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_www1MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\iIcon.png");
        decision1.setIcon(decision);
    }//GEN-LAST:event_www1MouseClicked

    private void ww1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ww1MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\hIcon.png");
        decision1.setIcon(decision);
    }//GEN-LAST:event_ww1MouseClicked

    private void w1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png");
        decision1.setIcon(decision);
    }//GEN-LAST:event_w1MouseClicked

    private void qqqq2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qqqq2MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\pIcon.png");
        decision2.setIcon(decision);
    }//GEN-LAST:event_qqqq2MouseClicked

    private void qqq2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qqq2MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\iIcon.png");
        decision2.setIcon(decision);
    }//GEN-LAST:event_qqq2MouseClicked

    private void qq2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qq2MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\hIcon.png");
        decision2.setIcon(decision);
    }//GEN-LAST:event_qq2MouseClicked

    private void q2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_q2MouseClicked
        ImageIcon decision = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\fIcon.png");
        decision2.setIcon(decision);
    }//GEN-LAST:event_q2MouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        finalplay1name.setText(play1name.getText());
        finalplay2name.setText(play2name.getText());
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void play1nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play1nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_play1nameActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JPanel Game;
    private javax.swing.JPanel Howtoplay;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Majika;
    private javax.swing.JLabel asasfasfas;
    private javax.swing.JLabel awdawdawdawdawd;
    private javax.swing.JLabel awwrgba;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel decision1;
    private javax.swing.JLabel decision2;
    private javax.swing.JLabel decision3;
    private javax.swing.JLabel decision4;
    private javax.swing.JLabel finalplay1name;
    private javax.swing.JLabel finalplay2name;
    private javax.swing.JTextArea gameHistory;
    private javax.swing.JLabel gameON;
    private javax.swing.JLabel health1;
    private javax.swing.JLabel health2;
    private javax.swing.JLabel howtoplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel p2;
    private javax.swing.JTextField play1name;
    private javax.swing.JTextField play2name;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel qq2;
    private javax.swing.JLabel qqq2;
    private javax.swing.JLabel qqqq2;
    private javax.swing.JLabel round1;
    private javax.swing.JLabel round2;
    private javax.swing.JLabel ssedsdvsdv;
    private javax.swing.JLabel violet;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel ww1;
    private javax.swing.JLabel www1;
    private javax.swing.JLabel wwww1;
    // End of variables declaration//GEN-END:variables
}
