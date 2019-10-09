package Unit2.Unit2_7;

import org.junit.Test;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Protect {

    public void Test01() {
        Function<Long, Long> add1 = (x) -> x + 1;

        Function<Long, Boolean> equals1 = (x) -> x == 1;

    }


    public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
    @Test
    public void Test02() throws ParseException {
        System.out.println(formatter.get().valueToString(new Date()));
    }

    public void Test03(){
        Runnable helloworld = () -> System.out.println("Hello World");


        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));


    }

}

interface IntPred{
    boolean test(Integer value);
}
