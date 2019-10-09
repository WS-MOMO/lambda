package Unit2.Unit2_5;

import java.util.HashMap;
import java.util.Map;

/**
 * 类型推断
 */
public class Demo001 {

    public void Test01() {
        Map<String, Integer> oldWordCounts = new HashMap<String, Integer>();
        // 使用菱形操作符,根据变量类型做推断
        Map<String, Integer> diamondWordCounts = new HashMap<>();
    }

    public void Test02(){
        // 使用菱形操作符,根据方法签名做推断
        // 在JDK7之前无法通过编译
        userHashMap(new HashMap<>());
    }

    public void userHashMap(Map<String, Integer> values){
    }
}
