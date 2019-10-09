package Unit2.Unit2_5;

import org.junit.Test;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Lambda的类型推断
 */
public class Demo002 {

    @Test
    public void Test01(){
        Predicate<Integer> atLeast5 = x -> x > 5;

        BinaryOperator<Long> addLongs = (x, y) -> x + y;
//        Operator '+' cannot be applied to 'java.lang.Object', 'java.lang.Object'
//        BinaryOperator add = (x, y) -> x + y;
    }
}
