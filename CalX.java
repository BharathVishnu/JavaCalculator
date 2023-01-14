import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Evaluate.Eval;


class Calculator extends JFrame implements ActionListener {
    JTextField t;
    JButton bix, bx2, bx3, bxe, bsin, bcos, btan, bmod, bdiv, bdel, bac, bmul, bplus, bsub, beq, b9, b8, b7, b6, b5, b4,
            b3, b2, b1, b0, bp;
    JLabel llogx, lr2x, lr3x, lrex, lisin, licos, litan;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg;

    Calculator()
    {
        // preparing GUI
        setTitle("Calculator");
        setSize(450, 550);
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding other components
        t = new JTextField(" ");
        t.setBounds(7, 10, 420, 40);
        t.setEditable(false);
        t.setHorizontalAlignment(SwingConstants.RIGHT);
        add(t);

        rb1 = new JRadioButton("Norm");
        rb1.setBounds(10, 60, 60, 40);
        rb1.setBackground(Color.BLACK);
        rb1.setForeground(Color.white);
        rb1.setSelected(false);
        add(rb1);

        rb2 = new JRadioButton("Sci");
        rb2.setBounds(10, 86, 60, 40);
        rb2.setBackground(Color.BLACK);
        rb2.setForeground(Color.white);
        rb2.setSelected(false);
        add(rb2);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        rb3 = new JRadioButton("ON");
        rb3.setBounds(355, 60, 60, 40);
        rb3.setBackground(Color.BLACK);
        rb3.setForeground(Color.white);
        rb3.setSelected(false);
        add(rb3);

        rb4 = new JRadioButton("Shift");
        rb4.setBounds(355, 86, 60, 40);
        rb4.setBackground(Color.BLACK);
        rb4.setForeground(Color.yellow);
        rb4.setSelected(false);
        add(rb4);

        llogx = new JLabel("log");
        llogx.setBounds(30, 120, 50, 40);
        llogx.setForeground(Color.yellow);
        llogx.setEnabled(false);
        add(llogx);

        bix = new JButton("x-\u2071");
        bix.setBounds(10, 150, 50, 40);
        bix.setBackground(Color.gray);
        bix.setForeground(Color.white);
        bix.setEnabled(false);
        add(bix);

        lr2x = new JLabel("\u221A");
        lr2x.setBounds(80, 120, 50, 40);
        lr2x.setForeground(Color.yellow);
        lr2x.setEnabled(false);
        add(lr2x);

        bx2 = new JButton("x\u00B2");
        bx2.setBounds(66, 150, 50, 40);
        bx2.setBackground(Color.gray);
        bx2.setForeground(Color.white);
        bx2.setEnabled(false);
        add(bx2);

        lr3x = new JLabel("\u221B");
        lr3x.setBounds(142, 120, 50, 40);
        lr3x.setForeground(Color.yellow);
        lr3x.setEnabled(false);
        add(lr3x);

        bx3 = new JButton("x\u00B3");
        bx3.setBounds(122, 150, 50, 40);
        bx3.setBackground(Color.gray);
        bx3.setForeground(Color.white);
        bx3.setEnabled(false);
        add(bx3);

        lrex = new JLabel("\u081A\u221A");
        lrex.setBounds(190, 120, 50, 40);
        lrex.setForeground(Color.yellow);
        lrex.setEnabled(false);
        add(lrex);

        bxe = new JButton("x\u081A");
        bxe.setBounds(178, 150, 50, 40);
        bxe.setBackground(Color.gray);
        bxe.setForeground(Color.WHITE);
        bxe.setEnabled(false);
        add(bxe);

        lisin = new JLabel("sin-1");
        lisin.setBounds(247, 120, 60, 40);
        lisin.setForeground(Color.yellow);
        lisin.setEnabled(false);
        add(lisin);

        bsin = new JButton("sin");
        bsin.setBounds(234, 150, 60, 40);
        bsin.setBackground(Color.gray);
        bsin.setForeground(Color.WHITE);
        bsin.setEnabled(false);
        add(bsin);

        licos = new JLabel("cos-1");
        licos.setBounds(314, 120, 60, 40);
        licos.setForeground(Color.yellow);
        licos.setEnabled(false);
        add(licos);

        bcos = new JButton("cos");
        bcos.setBounds(300, 150, 60, 40);
        bcos.setBackground(Color.gray);
        bcos.setForeground(Color.WHITE);
        bcos.setEnabled(false);
        add(bcos);

        litan = new JLabel("tan-1");
        litan.setBounds(378, 120, 60, 40);
        litan.setForeground(Color.yellow);
        litan.setEnabled(false);
        add(litan);

        btan = new JButton("tan");
        btan.setBounds(366, 150, 60, 40);
        btan.setBackground(Color.gray);
        btan.setForeground(Color.WHITE);
        btan.setEnabled(false);
        add(btan);

        bmod = new JButton("%");
        bmod.setBounds(10, 200, 100, 50);
        bmod.setBackground(Color.gray);
        bmod.setForeground(Color.white);
        bmod.setEnabled(false);
        add(bmod);

        bdiv = new JButton("/");
        bdiv.setBounds(115, 200, 100, 50);
        bdiv.setBackground(Color.gray);
        bdiv.setForeground(Color.white);
        bdiv.setEnabled(false);
        add(bdiv);

        bdel = new JButton("DEL");
        bdel.setBounds(220, 200, 100, 50);
        bdel.setBackground(Color.green);
        bdel.setForeground(Color.white);
        bdel.setEnabled(false);
        add(bdel);

        bac = new JButton("AC");
        bac.setBounds(325, 200, 100, 50);
        bac.setBackground(Color.green);
        bac.setForeground(Color.white);
        bac.setEnabled(false);
        add(bac);

        b7 = new JButton("7");
        b7.setBounds(10, 260, 100, 50);
        b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
        b7.setEnabled(false);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(115, 260, 100, 50);
        b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
        b8.setEnabled(false);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(220, 260, 100, 50);
        b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
        b9.setEnabled(false);
        add(b9);

        bmul = new JButton("X");
        bmul.setBounds(325, 260, 100, 50);
        bmul.setBackground(Color.gray);
        bmul.setForeground(Color.white);
        bmul.setEnabled(false);
        add(bmul);

        b4 = new JButton("4");
        b4.setBounds(10, 320, 100, 50);
        b4.setBackground(Color.gray);
        b4.setForeground(Color.white);
        b4.setEnabled(false);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(115, 320, 100, 50);
        b5.setBackground(Color.gray);
        b5.setForeground(Color.white);
        b5.setEnabled(false);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(220, 320, 100, 50);
        b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
        b6.setEnabled(false);
        add(b6);

        bplus = new JButton("+");
        bplus.setBounds(325, 320, 100, 50);
        bplus.setBackground(Color.gray);
        bplus.setForeground(Color.white);
        bplus.setEnabled(false);
        add(bplus);

        b3 = new JButton("3");
        b3.setBounds(10, 380, 100, 50);
        b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
        b3.setEnabled(false);
        add(b3);

        b2 = new JButton("2");
        b2.setBounds(115, 380, 100, 50);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        b2.setEnabled(false);
        add(b2);

        b1 = new JButton("1");
        b1.setBounds(220, 380, 100, 50);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        b1.setEnabled(false);
        add(b1);

        bsub = new JButton("-");
        bsub.setBounds(325, 380, 100, 50);
        bsub.setBackground(Color.gray);
        bsub.setForeground(Color.white);
        bsub.setEnabled(false);
        add(bsub);

        b0 = new JButton("0");
        b0.setBounds(10, 440, 100, 50);
        b0.setBackground(Color.gray);
        b0.setForeground(Color.white);
        b0.setEnabled(false);
        add(b0);

        bp = new JButton(".");
        bp.setBounds(115, 440, 100, 50);
        bp.setBackground(Color.gray);
        bp.setForeground(Color.white);
        bp.setEnabled(false);
        add(bp);

        beq = new JButton("=");
        beq.setBounds(220, 440, 205, 50);
        beq.setBackground(Color.gray);
        beq.setForeground(Color.white);
        beq.setEnabled(false);
        add(beq);

        // adding actionListener methods
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        bix.addActionListener(this);
        bx2.addActionListener(this);
        bx3.addActionListener(this);
        bxe.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bmod.addActionListener(this);
        bdiv.addActionListener(this);
        bdel.addActionListener(this);
        bac.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        bplus.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        b0.addActionListener(this);
        bp.addActionListener(this);
        beq.addActionListener(this);

        setVisible(true);
    }

    // Overriding method actionPerformed
    public void actionPerformed(ActionEvent e) 
    {
        Object s = e.getSource();
        if (rb1.isSelected() == true && rb3.isSelected() == true)
        {
            bmod.setEnabled(true);
            bdiv.setEnabled(true);
            bdel.setEnabled(true);
            bac.setEnabled(true);
            b9.setEnabled(true);
            b8.setEnabled(true);
            b7.setEnabled(true);
            b6.setEnabled(true);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b3.setEnabled(true);
            b2.setEnabled(true);
            b1.setEnabled(true);
            b0.setEnabled(true);
            bplus.setEnabled(true);
            bsub.setEnabled(true);
            bmul.setEnabled(true);
            b0.setEnabled(true);
            bp.setEnabled(true);
            beq.setEnabled(true);
        } 

        else if (rb2.isSelected() == true && rb3.isSelected() == true) 
        {
            bmod.setEnabled(true);
            bdiv.setEnabled(true);
            bdel.setEnabled(true);
            bac.setEnabled(true);
            b9.setEnabled(true);
            b8.setEnabled(true);
            b7.setEnabled(true);
            b6.setEnabled(true);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b3.setEnabled(true);
            b2.setEnabled(true);
            b1.setEnabled(true);
            b0.setEnabled(true);
            bplus.setEnabled(true);
            bsub.setEnabled(true);
            bmul.setEnabled(true);
            b0.setEnabled(true);
            bp.setEnabled(true);
            beq.setEnabled(true);
            bix.setEnabled(true);
            bx2.setEnabled(true);
            bx3.setEnabled(true);
            bxe.setEnabled(true);
            bsin.setEnabled(true);
            bcos.setEnabled(true);
            btan.setEnabled(true);
            llogx.setEnabled(true);
            lr2x.setEnabled(true);
            lr3x.setEnabled(true);
            lrex.setEnabled(true);
            lisin.setEnabled(true);
            licos.setEnabled(true);
            litan.setEnabled(true);
        }

        else if(rb3.isSelected() == false)
        {
            t.setText("");
            bg.clearSelection();
            rb4.setSelected(false);
            bmod.setEnabled(false);
            bdiv.setEnabled(false);
            bdel.setEnabled(false);
            bac.setEnabled(false);
            b9.setEnabled(false);
            b8.setEnabled(false);
            b7.setEnabled(false);
            b6.setEnabled(false);
            b5.setEnabled(false);
            b4.setEnabled(false);
            b3.setEnabled(false);
            b2.setEnabled(false);
            b1.setEnabled(false);
            b0.setEnabled(false);
            bplus.setEnabled(false);
            bsub.setEnabled(false);
            bmul.setEnabled(false);
            b0.setEnabled(false);
            bp.setEnabled(false);
            beq.setEnabled(false);
            bix.setEnabled(false);
            bx2.setEnabled(false);
            bx3.setEnabled(false);
            bxe.setEnabled(false);
            bsin.setEnabled(false);
            bcos.setEnabled(false);
            btan.setEnabled(false);
            llogx.setEnabled(false);
            lr2x.setEnabled(false);
            lr3x.setEnabled(false);
            lrex.setEnabled(false);
            lisin.setEnabled(false);
            licos.setEnabled(false);
            litan.setEnabled(false);
        }

        if(s == bac)
        {
            t.setText("");
        }
        else if (s == bdel)
        {
            int length = t.getText().length();
            int number = length - 1;

            if (length > 0) 
            {
                StringBuilder back = new StringBuilder(t.getText());
                back.deleteCharAt(number);
                t.setText(back.toString());

            }
        }

        else if(s == b0)
        {
            if (t.getText().equals("0"))
                return;
            else
                t.setText(t.getText() + "0");
        }
        else if(s == b9)
            t.setText(t.getText()+'9');
        else if(s == b8)
            t.setText(t.getText()+'8');
        else if(s == b7)
            t.setText(t.getText()+'7');
        else if(s == b6)
            t.setText(t.getText()+'6');
        else if(s == b5)
            t.setText(t.getText()+'5');
        else if(s == b4)
            t.setText(t.getText()+'4');
        else if(s == b3)
            t.setText(t.getText()+'3');
        else if(s == b2)
            t.setText(t.getText()+'2');
        else if(s == b1)
            t.setText(t.getText()+'1');
        else if(s == bp)
            t.setText(t.getText()+'.');
        else if(s == bp)
            t.setText(t.getText()+'.');
        else if(s == bplus)
            t.setText(t.getText()+'+');    
        else if(s == bmul)
            t.setText(t.getText()+'x');
        else if(s == bdiv)
            t.setText(t.getText()+'/');
        else if(s == bsub)
            t.setText(t.getText()+'-');
        else if(s == bmod)
            t.setText(t.getText()+'%');


        else if (s == bx2) 
        {
            if (rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                Double sqrt = Math.pow(number,1/2);
                String string = Double.toString(sqrt);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);   
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                Double square = Math.pow(number,2);
                String string = Double.toString(square);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);
            }
        }
        else if (s == bx3) 
        {
            if (rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                Double curt = Math.pow(number,1/3);
                String string = Double.toString(curt);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);   
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                Double cube = Math.pow(number,3);
                String string = Double.toString(cube);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);
            }
        }
        else if (s == bix)
        {
            if (rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                double logg = Math.log(number);
                String string = Double.toString(logg);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                Double inv = 1/number;
                String string = Double.toString(inv);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);      
            }      
        }
        else if(s == bxe)
        {
            if (rb4.isSelected() == true)
            {
                t.setText(t.getText()+'^'+"1/");
            }
            else
            {
                t.setText(t.getText()+'^');
            }
        }
        else if(s == bsin)
        {   
            if (rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                double isin = Math.asin(number);
                double deg = Math.toDegrees(isin);
                String string = Double.toString(deg);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                double rad = Math.toRadians(number);
                double sin = Math.sin(rad);
                String string = Double.toString(sin);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
        }
        else if(s == bcos)
        {
            if (rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                double icos = Math.acos(number);
                double deg = Math.toDegrees(icos);
                String string = Double.toString(deg);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                double rad = Math.toRadians(number);
                double cos = Math.cos(rad);
                String string = Double.toString(cos);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
        }
        else if(s == btan)
        {   
            if(rb4.isSelected() == true)
            {
                double number = Double.parseDouble(t.getText());
                double itan = Math.atan(number);
                double deg = Math.toDegrees(itan);
                String string = Double.toString(deg);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string); 
            }
            else
            {
                double number = Double.parseDouble(t.getText());
                double rad = Math.toRadians(number);
                double tan = Math.tan(rad);
                String string = Double.toString(tan);
                if (string.endsWith(".0"))
                    t.setText(string.replace(".0", ""));
                else 
                    t.setText(string);
            } 
        }

        //calling method from package
        else if (s == beq)
        {
            Eval p = new Eval();
            String result = p.evaluate(t.getText());
            t.setText(result);
        }
    }
}

class CalX 
{
    public static void main(String[] args) 
    {
        new Calculator();
    }
}
