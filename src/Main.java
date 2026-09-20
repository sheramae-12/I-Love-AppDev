import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello AppDev");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello AppDev", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 24));

        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}