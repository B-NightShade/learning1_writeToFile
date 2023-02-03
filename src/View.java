import javax.swing.*;
import java.awt.*;

public class View {
    void build(){
        JLabel labelName = new JLabel("Name");
        JTextField jTextFieldName = new JTextField();
        JLabel labelAge = new JLabel("Age");
        JTextField jTextFieldAge = new JTextField();
        JLabel labelMajor = new JLabel("Major");
        JTextField jTextFieldMajor = new JTextField();

        JPanel textFieldPanel = new JPanel();
        GridLayout textFieldLayout = new GridLayout(3,1); //3 rows 2 columns
        textFieldPanel.setLayout(textFieldLayout);
        textFieldPanel.add(labelName);
        textFieldPanel.add(jTextFieldName);
        textFieldPanel.add(labelAge);
        textFieldPanel.add(jTextFieldAge);
        textFieldPanel.add(labelMajor);
        textFieldPanel.add(jTextFieldMajor);

        JButton buttonSubmit = new JButton("submit");

        JFrame mainFrame = new JFrame();
        mainFrame.add(BorderLayout.NORTH, textFieldPanel);
        mainFrame.add(BorderLayout.CENTER, buttonSubmit);

        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
