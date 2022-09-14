package com.yash_desai.AJP_22517.Practical_6;

import javax.swing.JComboBox;
import java.awt.Frame;
import java.awt.FlowLayout;

public class Exercise_1 {
    Frame F;
    String[] STATES_OF_INDIA = {"1. Andhra Pradesh", "2. Arunachal Pradesh",
            "3. Assam", "4. Bihar", "5. Chhattisgarh", "6. Goa", "7. Gujarat",
            "8. Haryana", "9. Himachal Pradesh", "10. Jammu and Kashmir",
            "11. Jharkhand", "12. Karnataka", "13. Kerala", "14. Madhya Pradesh", "15. Maharashtra",
            "16. Manipur", "17. Meghalaya", "18. Mizoram", "19. Nagaland", "20. Odisha",
            "21. Punjab", "22. Rajasthan", "23. Sikkim", "24. Tamil Nadu", "25. Telangana",
            "26. Tripura", "27. Uttar Pradesh", "28. Uttarakhand", "29. West Bengal"};

    Exercise_1() {
        F = new Frame();
        F.add(new JComboBox<String>(STATES_OF_INDIA));
        F.setSize(200,100);
        F.setLayout(new FlowLayout());
        F.setVisible(true);
    }
    public static void main(String args[]) {
        new Exercise_1();
    }
}