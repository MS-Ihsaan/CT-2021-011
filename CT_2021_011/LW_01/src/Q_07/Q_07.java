package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        String title = sdf.format(today);

        frame.setSize(300,200);
        frame.setTitle(title);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
