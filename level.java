package simple.minds;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class level extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5;
    String username;
    level(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Select your difficulty level:");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        b1 = new JButton("Easy");
        b1.setBounds(230, 100, 300, 50);
        b1.setBackground(new Color(30, 144, 254));
        b1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Medium");
        b2.setBounds(230, 200, 300, 50);
        b2.setBackground(new Color(30, 144, 255));
        b2.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Hard");
        b3.setBounds(230, 300, 300, 50);
        b3.setBackground(new Color(30, 144, 255));
        b3.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("Expert");
        b4.setBounds(230, 400, 300, 50);
        b4.setBackground(new Color(30, 144, 255));
        b4.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("Back");
        b5.setBounds(230, 500, 300, 50);
        b5.setBackground(new Color(30, 144, 255));
        b5.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new easy(username).setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new medium(username).setVisible(true);
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new hard(username).setVisible(true);
        }else if(ae.getSource() == b4){
            this.setVisible(false);
            new expert(username).setVisible(true);
        }else if(ae.getSource() == b5){
            this.setVisible(false);
            new Rules(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new level("");
    }
}
        
        
    

