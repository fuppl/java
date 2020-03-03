package Service;

import java.util.List;

public interface Service{
    /**
     * 返回全部偶数
     */
    List<Integer> Service1(List<Integer> integers);
    /**
     * 返回小于30的奇数
     */
    List<Integer> Service2(List<Integer> integers);
    /**
     * 所有3的倍数扩大1000倍
     */
    List<Integer> Service3(List<Integer> integers);
    /**
     * 3的倍数由大到小输出
     */
    List<Integer> Service4(List<Integer> integers);
}
