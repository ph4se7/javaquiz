package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static simple.minds.easy.ans_given;
import static simple.minds.easy.score;
import static simple.minds.easy.timer;

public class hard extends JFrame implements ActionListener{
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
    hard(String username){
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
        
        q[0][0] = "Name the country parmesan cheese comes from";
        q[0][1] = "India";
        q[0][2] = "Italy";
        q[0][3] = "France";
        q[0][4] = "Mexico";

        q[1][0] = "Which of the following birds is known for its intelligence?";
        q[1][1] = "Kingfisher";
        q[1][2] = "Owl";
        q[1][3] = "Sparrow";
        q[1][4] = "Pigeon";

        q[2][0] = "The minimum and maximum age for a candidate to contest elections for President of India’s office?";
        q[2][1] = "25 years, 65 years";
        q[2][2] = "35 years, 65 years";
        q[2][3] = "35 years , no limit";
        q[2][4] = "25 years, no limit";

        q[3][0] = "Who among the following wrote Sanskrit grammar?";
        q[3][1] = "Kalidasa";
        q[3][2] = "Charak";
        q[3][3] = "Panini";
        q[3][4] = "Aryabhatta";

        q[4][0] = "D.D.T. was invented by?";
        q[4][1] = "Mosley";
        q[4][2] = "Rudolf";
        q[4][3] = "Karl Benz";
        q[4][4] = "Dalton";

        q[5][0] = "Grand Central Terminal, Park Avenue, New York is the world’s";
        q[5][1] = "Highest railway station";
        q[5][2] = "Longest railway station";
        q[5][3] = "Largest railway station";
        q[5][4] = "None of the above";

        q[6][0] = "When did demonetisation happen in India?";
        q[6][1] = "8 November 2016";
        q[6][2] = "5 November 2016";
        q[6][3] = "9 November 2016";
        q[6][4] = "4 November 2016";

        q[7][0] = "Which of the following country is not a member of G-7?";
        q[7][1] = "Japan";
        q[7][2] = "Russia";
        q[7][3] = "France";
        q[7][4] = "Italy";

        q[8][0] = "Which of the following was Satyajit Ray associated with?";
        q[8][1] = "Classical music";
        q[8][2] = "Commercial art";
            q[8][3] = "Film direction";
        q[8][4] = "Classical dance";

        q[9][0] = "What was the name of the spacecraft that landed the first humans on the moon?";
        q[9][1] = "Apollo 9";
        q[9][2] = "Apollo 10";
        q[9][3] = "Apollo 11";
        q[9][4] = "Apollo 12";
        
        qa[0][1] = "Italy";
        qa[1][1] = "Owl";
        qa[2][1] = "35 years , no limit";
        qa[3][1] = "Panini";
        qa[4][1] = "Mosley";
        qa[5][1] = "Largest railway station";
        qa[6][1] = "8 November 2016";
        qa[7][1] = "Russia";
        qa[8][1] = "Film direction";
        qa[9][1] = "Apollo 11";
        
        
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
                        score+=15;
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
    new hard("").setVisible(true);
    }
}

