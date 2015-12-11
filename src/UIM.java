import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sandy on 2015/10/26.
 */
public class UIM extends JFrame implements KeyListener{
    Border borderLine = BorderFactory.createLineBorder(Color.black);
    JPanel panel1, panel2, panel3, panel4, panel5;
    JLabel label1;
    StatusPanel statusPanel1, statusPanel2, statusPanel3, statusPanel4;
    public int curFocus;
    TCPCM tcpcm;
    DOM dom;

    public static void main(String[] args){
        //Start start = new Start();
    }

    public UIM(TCPCM tcpcm, DOM dom){
        super("Start");

        this.tcpcm = tcpcm;
        this.dom = dom;

        this.setLayout(null);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1020, 700);
        this.setVisible(true);

        curFocus = 1;

        panel1 = new JPanel();
        panel1.setLayout(null);

        label1 = new JLabel("1");
        label1.setFont(new Font("Serif", Font.BOLD, 30));
        label1.setBounds(470, 260, 50, 50);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(label1);

        panel1.setBounds(0, 0, 1000, 570);
        panel1.setBorder(borderLine);
        panel1.setVisible(true);
        add(panel1);

        statusPanel1 = new StatusPanel(2);
        statusPanel1.setMainWindow(this);
        panel2 = statusPanel1.bigPanel;
        add(panel2);

        statusPanel2 = new StatusPanel(3);
        statusPanel2.setMainWindow(this);
        panel3 = statusPanel2.bigPanel;
        add(panel3);

        statusPanel3 = new StatusPanel(4);
        statusPanel3.setMainWindow(this);
        panel4 = statusPanel3.bigPanel;
        add(panel4);

        statusPanel4 = new StatusPanel(5);
        statusPanel4.setMainWindow(this);
        panel5 = statusPanel4.bigPanel;
        add(panel5);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Keyboard input on screen " + curFocus + ": " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        int moveCode;
        if (key==KeyEvent.VK_KP_UP || key==KeyEvent.VK_UP){
            moveCode = 0;
            tcpcm.inputMoves(moveCode);
        }
        else if (key==KeyEvent.VK_KP_RIGHT || key==KeyEvent.VK_RIGHT){
            moveCode = 1;
            tcpcm.inputMoves(moveCode);
        }
        else if (key==KeyEvent.VK_KP_DOWN || key==KeyEvent.VK_DOWN){
            moveCode = 2;
            tcpcm.inputMoves(moveCode);
        }
        else if (key==KeyEvent.VK_KP_LEFT || key==KeyEvent.VK_LEFT){
            moveCode = 3;
            tcpcm.inputMoves(moveCode);
        }
        else if (key == KeyEvent.VK_SPACE){
            dom.keyGETPressed();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
