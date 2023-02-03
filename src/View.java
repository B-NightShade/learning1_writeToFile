import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {

    int age;
    String name;
    String major;
    JTextField jTextFieldName;
    JTextField jTextFieldAge;
    JTextField jTextFieldMajor;

    void build(){
        JLabel labelName = new JLabel("Name");
        jTextFieldName = new JTextField();
        JLabel labelAge = new JLabel("Age");
        jTextFieldAge = new JTextField();
        JLabel labelMajor = new JLabel("Major");
        jTextFieldMajor = new JTextField();

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
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                major = jTextFieldMajor.getText();
                age = Integer.parseInt(jTextFieldAge.getText());
                name = jTextFieldName.getText();
                Model.write(age, name, major);
                jTextFieldAge.setText("");
                jTextFieldMajor.setText("");
                jTextFieldName.setText("");
            }
        });

        JFrame mainFrame = new JFrame();
        mainFrame.add(BorderLayout.NORTH, textFieldPanel);
        mainFrame.add(BorderLayout.CENTER, buttonSubmit);

        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
