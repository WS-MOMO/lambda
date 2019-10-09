package Unit2.Unit2_3;

import com.sun.org.apache.xpath.internal.operations.Variable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lambda引用既成事实上的final变量
 */
public class Demo001 {
    JButton button = new JButton();

    /**
     * 匿名内部类中使用方法内的final变量
     */
    public void Test01(){
        String name = "张三";
//        name = "李四";
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Variable 'name' is accessed from within inner class, needs to be final or effectively final
                System.out.println("hi " + name);
            }
        });
    }

    public void Test02(){
        String name = "张三";
//        name = "李四";
        // Variable used in lambda expression should be final or effectively final
        button.addActionListener(event -> System.out.println("hi " + name));
    }
}
