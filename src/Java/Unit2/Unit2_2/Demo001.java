package Unit2.Unit2_2;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Lambda表达式的不同形式
 */
public class Demo001 {
    public static void main(String[] args) {

        // 不含参数的Lambda,使用()表示没有参数,改Lambda表达式实现了Runnable接口,
        // 该接口也只有一个run方法,没有参数,且返回类型为void
        Runnable noArguments = () -> System.out.println("Hello World");

        // 包含且包含一个参数,可省略括号
        ActionListener oneArgument = event -> System.out.println("button clicked");

        // Lambda主体不仅可以是一个表达式,也可以是一段代码块,使用{}将代码栝起来
        Runnable multiStatement = () -> {
            System.out.print("Hello ");
            System.out.println("World");
        };

        // 包含多个参数的Lambda表达式,变量add不是两个数字的和,是将两个数字相加的那行代码
        BinaryOperator<Long> add = (x, y) -> x + y;

        // 显式声明参数类型
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }
}
