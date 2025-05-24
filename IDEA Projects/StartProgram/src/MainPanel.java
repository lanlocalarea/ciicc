import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton calculate;
    private JPanel MainForm;
    private JLabel output;
    private JButton exitButton;

    public MainPanel() {
        setContentPane(MainForm);
        setVisible(true);
        setTitle("Calculate");
        setSize(400, 300);
        setLocationRelativeTo(null);



        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                sum = Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText());
                output.setText(String.valueOf(sum));

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new MainPanel();
    }


}
