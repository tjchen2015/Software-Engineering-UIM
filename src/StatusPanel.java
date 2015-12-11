import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Sandy on 2015/10/28.
 */
public class StatusPanel {
    Border borderLine = BorderFactory.createLineBorder(Color.black);
    private UIM mainWindow;
    private int count;
    public JPanel bigPanel;
    public JLabel bigLabel, iconLabel, bloodLabel, abilityLabel1, abilityLabel2, abilityLabel3;

    public void setMainWindow(UIM start){
        this.mainWindow = start;
    }

    public StatusPanel(int count){
        this.count = count;

        bigPanel = new JPanel();
        bigPanel.setLayout(null);

        bigLabel = new JLabel(Integer.toString(count));
        bigLabel.setBounds(5, 5, 10, 10);
        bigPanel.add(bigLabel);

        iconLabel = new JLabel(Integer.toString(count+4));
        iconLabel.setBounds(15, 15, 70, 70);
        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        iconLabel.setBorder(borderLine);
        bigPanel.add(iconLabel);

        bloodLabel = new JLabel(Integer.toString(count+8));
        bloodLabel.setBounds(100, 15, 130, 25);
        bloodLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bloodLabel.setBorder(borderLine);
        bigPanel.add(bloodLabel);

        abilityLabel1 = new JLabel(Integer.toString(14+3*(count-2)));
        abilityLabel1.setBounds(110, 50, 30, 30);
        abilityLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        abilityLabel1.setBorder(borderLine);
        bigPanel.add(abilityLabel1);

        abilityLabel2 = new JLabel(Integer.toString(15+3*(count-2)));
        abilityLabel2.setBounds(150, 50, 30, 30);
        abilityLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        abilityLabel2.setBorder(borderLine);
        bigPanel.add(abilityLabel2);

        abilityLabel3 = new JLabel(Integer.toString(16+3*(count-2)));
        abilityLabel3.setBounds(190, 50, 30, 30);
        abilityLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        abilityLabel3.setBorder(borderLine);
        bigPanel.add(abilityLabel3);

        bigPanel.setBounds(250 * (count - 2), 570, 250, 90);
        bigPanel.setBorder(borderLine);
        bigPanel.setVisible(true);
    }
}
