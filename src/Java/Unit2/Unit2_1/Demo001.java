package Unit2.Unit2_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 第一个Lambda表达式
 */
public class Demo001 {
        static JButton button = new JButton();
        static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.add(button);
        // 匿名内部类形式
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("button clicked");
//            }
//        });
        // Lambda形式
        button.addActionListener(event -> System.out.println("Lambda button clicked"));
        frame.setVisible(true);
    }
}
