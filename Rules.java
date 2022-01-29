package simple.minds;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Levelwise GK Quiz");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
                "1. The Quiz will have 10 Questions." + "<br><br>" +
                "2. Each Question will have 4 options out of which only one will be correct." + "<br><br>" +
                "3. You will be allowed to use a 50:50 hint, which when activated will eliminate 2 wrong options. You will only be allowed to use this hint once during the entire quiz." + "<br><br>" +
                "4. You will have 15 seconds to answer every question on the quiz" + "<br><br>" +
                "5. You will have to click the 'Next' option after selecting the appropriate answer." + "<br><br>" +
                "6. If you do not click the 'Next' option at the end of 15 seconds, the selected answer will be considered." + "<br><br>" +
                "7. If you do not select any option at the end of 15 seconds, the question will be skipped and no answer will be considered." + "<br><br>" +
                "8. You have a choice of four difficulty levels: Easy, Medium, Hard and Expert" + "<br><br>" +
                "9. You will be awarded 10 points for a correct answer in the Easy level, 12 in the Medium level, 15 in Hard level and 20 in Expert level" + "<br><br>" +                             
                                                 "ALL THE BEST!" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(60, 500, 300, 50);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Select Difficulty Level");
        b2.setBounds(400, 500, 300, 50);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new level(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}
