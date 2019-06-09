package dnd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Display extends JFrame {
    
        
    //Declaration
    
        int[] DM = new int[8];
        int set=1;
       
       
        //Dark Icons
        Icon D4i  = new ImageIcon( getClass().getResource("d4.png"));
        
        Icon D6i  = new ImageIcon( getClass().getResource("d6.png"));
        
        Icon D8i  = new ImageIcon( getClass().getResource("d8.png"));
        
        Icon D10i  = new ImageIcon( getClass().getResource("d10.png"));
        
        Icon D20i = new ImageIcon(getClass().getResource("d20.png"));
        
        Icon D100i  = new ImageIcon( getClass().getResource("d100.png"));
        
        //Light Icons
        Icon DNi  = new ImageIcon( getClass().getResource("custom.png"));
        
        Icon D4il = new ImageIcon( getClass().getResource("d4_.png"));
        
        Icon D6il = new ImageIcon( getClass().getResource("d6_.png"));
        
        Icon D8il = new ImageIcon( getClass().getResource("d8_.png"));
        
        Icon D10il = new ImageIcon( getClass().getResource("d10_.png"));
        
        Icon D20il = new ImageIcon( getClass().getResource("d20_.png"));
        
        Icon D100il = new ImageIcon( getClass().getResource("d100_.png"));
        
        Icon DNil = new ImageIcon( getClass().getResource("custom_.png"));
        
        
        
        
        //The FOnt That Will Be Used Throughout
        Font label = new Font("SANS_SERIF",10,39);
       
        
        
        //These are the multipliers
        static JTextField X4 = new JTextField("");
       
        static JTextField X6 = new JTextField("");
        
        static JTextField X8 = new JTextField("");
        
        static JTextField X10 = new JTextField("");
        
        static JTextField X20 = new JTextField("");
        
        static JTextField X100 = new JTextField("");
        
        static JTextField XN = new JTextField("");
        
        //This is the side number for the DN
        static JTextField XNS = new JTextField("");
        
        
        //The results of the dice will be here
        JLabel D20L = new JLabel("");
        
        JLabel D4L = new JLabel("");
        
        JLabel D6L = new JLabel("");
        
        JLabel D8L = new JLabel("");
        
        JLabel D10L = new JLabel("");
        
        JLabel D100L = new JLabel("");
        
        JLabel DNL = new JLabel("");
        
        
        //Buttons for rolling dice
        JButton D4 = new JButton("D4", D4i);
        
        JButton D6 = new JButton("D6", D6i);
        
        JButton D8 = new JButton("D8", D8i);
        
        JButton D10 = new JButton("D10", D10i);
        
        JButton D20 = new JButton("D20", D20i);
        
        JButton D100 = new JButton("D100", D100i);
        
        JButton DN = new JButton("D", DNi);
        
        JButton cls = new JButton("CLEAR");
        
        //Theme Buttons
        JButton Ltheme = new JButton();
        
        JButton Dtheme = new JButton();
        
        String str = new String();
 
        Display() 
        {
            //To prevent silly nulls
            for(int i=0;i<8;i++)
            {
                DM[i]=1;
            }
            
            //Because we OG
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    
            
            //ActionListener Block
            ActionListener click4 = null;
            click4 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                  
                    try{
                    if(X4.getText().isEmpty())
                    {
                        DM[0]=1;
                        X4.setText("1");
                    }
                    else if(!X4.getText().isEmpty())
                        DM[0] = Integer.decode(X4.getText());
                    }
                    catch(NumberFormatException a)
                    { X4.setText("1");
                    }
                    str=(Integer.toString((ges.Generate(4))*(DM[0])));
                    D4L.setText(str);
                    X4.setText("");
                    }
            };
            
            ActionListener click6 = null;
            click6 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                    try{
                    if(X6.getText().isEmpty())
                    {
                        DM[1]=1;
                        X6.setText("1");
                    }
                    else if(!X6.getText().isEmpty())
                        DM[1] = Integer.decode(X6.getText());
                    }
                    catch(NumberFormatException a)
                    { X6.setText("1");
                    }
                    str=(Integer.toString((ges.Generate(6))*(DM[1])));
                    D6L.setText(str);
                    X6.setText("");
                }
            };
            
            ActionListener click8 = null;
            click8 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                    try{
                    if(X8.getText().isEmpty())
                    {
                        DM[2]=1;
                        X8.setText("1");
                    }
                    else if(!X8.getText().isEmpty())
                        DM[2] = Integer.decode(X8.getText());
                    }
                    catch(NumberFormatException a)
                    { X8.setText("1");
                    }
                    
                    str=(Integer.toString((ges.Generate(8))*(DM[2])));
                    D8L.setText(str);
                    X8.setText("");
                }
            };
            
            
            
            ActionListener click10= null;
            click10 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    try{
                    if(X10.getText().isEmpty())
                    {
                        DM[3]=1;
                        X10.setText("1");
                    }
                    else if(!X10.getText().isEmpty())
                        DM[3] = Integer.decode(X10.getText());
                    }
                    catch(NumberFormatException a)
                    { X10.setText("1");
                    }
                    str=(Integer.toString((ges.Generate(10))*(DM[3])));
                    D10L.setText(str);
                    X10.setText("");
                }
            };
            
            ActionListener click100 = null;
            click100 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                    try{
                    if(X100.getText().isEmpty())
                    {
                        DM[5]=1;
                        X100.setText("1");
                    }
                    else if(!X100.getText().isEmpty())
                        DM[5] = Integer.decode(X100.getText());
                    }
                    catch(NumberFormatException a)
                    { X100.setText("1");
                    }
                    str=(Integer.toString((ges.Generate(100))*(DM[5])));
                    D100L.setText(str);
                    X100.setText("");
                }
            };
            
            ActionListener click20;
            click20 = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                    try{
                    if(X20.getText().isEmpty())
                    {
                        DM[4]=1;
                        X20.setText("1");
                    }
                    else if(!X20.getText().isEmpty())
                        DM[4] = Integer.decode(X20.getText());
                    }
                    catch(NumberFormatException a)
                    { X20.setText("1");
                    }
                    str=(Integer.toString((ges.Generate(20))*(DM[4])));
                    D20L.setText(str);
                    X20.setText("");
                    
                }
            };
            
            
            ActionListener clickN = null;
            clickN = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    
                    Generate ges = new Generate();
                    
                    try{
                    if(XN.getText().isEmpty())
                    {
                        DM[6]=1;
                        XN.setText("1");
                    }
                    else if(!XN.getText().isEmpty())
                        DM[6] = Integer.decode(XN.getText());
                    }
                    catch(NumberFormatException a)
                    { XN.setText("1");
                    }
                    
                    try{
                    if(XNS.getText().isEmpty())
                    {
                        set=20;
                        XNS.setText("1");
                    }
                    else if(!XNS.getText().isEmpty())
                        set = Integer.decode(XNS.getText());
                    }
                    catch(NumberFormatException a)
                    { XNS.setText("1");
                    }
                    
                    str=(Integer.toString((ges.Generate(set))*(DM[6])));
                    DNL.setText(str);
                    XN.setText("");
                    if(Integer.decode(XNS.getText())==1)
                        XNS.setText("");
                }
            };
            
            ActionListener clickC = null;
            clickC = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    D4L.setText("");
                    D6L.setText("");
                    D8L.setText("");
                    D10L.setText("");
                    D20L.setText("");
                    D100L.setText("");
                    DNL.setText("");
                    }
            };
           
            ActionListener clickL = null;
            clickL = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    D4.setIcon(D4il);
                    D6.setIcon(D6il);
                    D8.setIcon(D8il);
                    D10.setIcon(D10il);
                    D20.setIcon(D20il);
                    D100.setIcon(D100il);
                    DN.setIcon(DNil);
                    }
            };
            
            ActionListener clickD = null;
            clickD = new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    D4.setIcon(D4i);
                    D6.setIcon(D4i);
                    D8.setIcon(D8i);
                    D10.setIcon(D10i);
                    D20.setIcon(D20i);
                    D100.setIcon(D100i);
                    DN.setIcon(DNi);
                    }
            };
            
            
            
           
            add(D4);
            add(D4L);
            add(D6);
            add(D6L);
            add(D8);
            add(D8L);
            add(D10);
            add(D10L);
            add(D20);
            add(D20L);
            add(D100);
            add(D100L);
            add(DN);
            add(DNL);
            add(X4);
            add(X6);
            add(X8);
            add(X10);
            add(X20);
            add(X100);
            add(XN);
            add(XNS);
            add(cls);
            add(Ltheme);
            add(Dtheme);
            
            
            D20.addActionListener(click20);
            D4.addActionListener(click4);
            D6.addActionListener(click6);
            D8.addActionListener(click8);
            D10.addActionListener(click10);
            D100.addActionListener(click100);
            DN.addActionListener(clickN);
            cls.addActionListener(clickC);
            Ltheme.addActionListener(clickL);
            Dtheme.addActionListener(clickD);
            
            
//            X4.addKeyListener(type4);
          
            
            
            //BUTTONS
            D4.setBounds(new Rectangle(70,20,120,65));
            D6.setBounds(new Rectangle(70,95,120,65));
            D8.setBounds(new Rectangle(70,170,120,65));
            D10.setBounds(new Rectangle(70,245,120,65));
            D20.setBounds(new Rectangle(70,320,120,65));
            D100.setBounds(new Rectangle(70,395,130,65));
            DN.setBounds(new Rectangle(70, 470, 115, 65));
            cls.setBounds(new Rectangle(220,0,100,19));
            Ltheme.setBounds(new Rectangle(17,540,15,15));
            Dtheme.setBounds(new Rectangle(0,540,15,15));
            Ltheme.setBackground(Color.white);
            Dtheme.setBackground(Color.black);
            
            //MULTIPLIERS
            X4.setBounds(new Rectangle(10, 20, 50, 65));
            X4.setFont(label);
            X6.setBounds(new Rectangle(10, 95, 50, 65));
            X6.setFont(label);
            X8.setBounds(new Rectangle(10, 170, 50, 65));
            X8.setFont(label);
            X10.setBounds(new Rectangle(10, 245, 50, 65));
            X10.setFont(label);
            X20.setBounds(new Rectangle(10, 320, 50, 65));
            X20.setFont(label);
            X100.setBounds(new Rectangle(10, 395, 50, 65));
            X100.setFont(label);
            XN.setBounds(new Rectangle(10, 470, 50, 65));
            XN.setFont(label);
            XNS.setBounds(new Rectangle(190, 470, 50, 65));
            XNS.setFont(label);
           
            //LABELS
            D4L.setBounds(new Rectangle(220, 20, 120, 65));
            D4L.setFont(label);
            D6L.setBounds(new Rectangle(220, 95, 120, 65));
            D6L.setFont(label);
            D8L.setBounds(new Rectangle(220, 170, 120, 65));
            D8L.setFont(label);
            D10L.setBounds(new Rectangle(220, 245, 120, 65));
            D10L.setFont(label);
            D20L.setBounds(new Rectangle(220, 320, 120, 65));
            D20L.setFont(label);
            D100L.setBounds(new Rectangle(220, 395, 120, 65));
            D100L.setFont(label);
            DNL.setBounds(new Rectangle(245, 470, 120, 65));
            DNL.setFont(label);
            
                
                
        }
         
        
}
