package Unit3.Unit3_3;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream中的常用方法
 *
 */
public class Demo001 {

    @Test
    public void method01(){
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());

    }

}
