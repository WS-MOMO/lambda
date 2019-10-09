package Unit3.Unit3_2;

import javax.naming.ldap.InitialLdapContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 惰性求值方法:像filter这样只描述Stream,最终不产生新集合的方法
 * 及早求值方法:像count这样最终会从Stream产生值的方法
 * 区分方法:
 *  如果返回值是Stream,就是惰性求值方法
 *  如果返回值是另一个值或为空,那么就是及早求值方法
 */
public class Demo001 {
    public static void main(String[] args) {
        Integer[] intArr = {1, 3, 4, 5, 7, 3, 21, 2, 43, 547, 6, 433, 213, 21, 45, 6, 54, 3};
        List<Integer> intList = Arrays.asList(intArr);

        intList.stream().filter(x -> {
            System.out.println("没有使用count()方法: x = " + x);
            return x > 100;
        });

        long count = intList.stream().filter(x -> {
            System.out.println("使用了count()方法: x = " + x);
            return x > 100;
        }).count();


    }
}
