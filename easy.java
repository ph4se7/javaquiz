package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public final class easy extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    easy(String username){
        this.username = username;
        setBounds(250, 50, 1440, 950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       ImageIcon i1;
       i1 = new ImageIcon("C:\\Users\\User1\\Desktop\\p\\p1\\src\\main\\java\\icons\\quiz.jpeg");
       JLabel l1 = new JLabel(i1);
       l1.setBounds(0, 0, 1440, 392);
       add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(100, 450, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150, 450, 900, 30);
        add(question);
        
        q[0][0] = "Which is the largest continent in the world?";
        q[0][1] = "Europe";
        q[0][2] = "Africa";
        q[0][3] = "Asia";
        q[0][4] = "Australia";

        q[1][0] = "Which planet in our solar system is known as the Blue Planet?";
        q[1][1] = "Earth";
        q[1][2] = "Uranus";
        q[1][3] = "Jupiter";
        q[1][4] = "Mars";

        q[2][0] = "How many cards are there in one complete pack?";
        q[2][1] = "20";
        q[2][2] = "32";
        q[2][3] = "40";
        q[2][4] = "52";

        q[3][0] = "Which of the following is not amongst the seven wonders of the world?";
        q[3][1] = "Mecca Madina";
        q[3][2] = "Taj Mahal";
        q[3][3] = "Statue of Liberty";
        q[3][4] = "The Great Wall of China";

        q[4][0] = "Who was the first President of India?";
        q[4][1] = "Pt. Jawaharlal Nehru";
        q[4][2] = "Dr. Rajendra Prasad";
        q[4][3] = "Dr. Sarvepalli Radhakrishnan";
        q[4][4] = "Mahatma Gandhi";

        q[5][0] = "Who invented the Computer?";
        q[5][1] = "Charles Babbage";
        q[5][2] = "Thomas Alva Edison";
        q[5][3] = "John Logie Baird";
        q[5][4] = "Benjamin Franklin";

        q[6][0] = "Which is the odd one out in the group?";
        q[6][1] = "Driving";
        q[6][2] = "Swimming";
        q[6][3] = "Sailing";
        q[6][4] = "Diving";

        q[7][0] = "Total number of oceans in the World is";
        q[7][1] = "3";
        q[7][2] = "5";
        q[7][3] = "7";
        q[7][4] = "4";

        q[8][0] = "Which one is the largest tropical rainforest in the world?";
        q[8][1] = "Amazon";
        q[8][2] = "Bosawas";
        q[8][3] = "Southeast Asian RainForest";
        q[8][4] = "Daintree RainForest";

        q[9][0] = "Which one of the following is the smallest bird in the world?";
        q[9][1] = "The Goldcrest";
        q[9][2] = "The Bee Hummingbird";
        q[9][3] = "The Pardalote";
        q[9][4] = "The Weebill";
        
        qa[0][1] = "Asia";
        qa[1][1] = "Earth";
        qa[2][1] = "52";
        qa[3][1] = "Mecca Madina";
        qa[4][1] = "Dr. Rajendra Prasad";
        qa[5][1] = "Charles Babbage";
        qa[6][1] = "Driving";
        qa[7][1] = "5";
        qa[8][1] = "Amazon";
        qa[9][1] = "The Bee Hummingbird";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 520, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 560, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 600, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 640, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100, 550, 200, 40);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100, 710, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 1100, 500);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    public static void main(String[] args){
        new easy("").setVisible(true);
    }
}
