package Q_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_04 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(today));
    }
}
