import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    private static List<String> fruits = create();

    private static List<String> create() {
        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("strawberry");
        fruits.add("watermelon");
        return fruits;
    }

    /**
     * 基于fruits集合操作
     *
     * @param args
     */
    public static void main(String[] args) {
        getFruit1("apple");
        System.out.println("------------------");
        getFruit2("peach");
        System.out.println("-----  传入不同大小写水果名称，查看全部  -------");
        System.out.println(getFruit10("ApPlE"));
        System.out.println(fruits.size());
        fruits.forEach(System.out::println);
    }

    /**
     * 传入水果名称，如果集合中有则打印显示，没有打印显示none
     * 提示：stream findFirst()方法，将存在的第一个结果封装到optional容器，没有返回空容器
     * 基于optional容器操作
     *
     * @param fruit
     */
    private static void getFruit1(String fruit) {
        fruits.stream()
                .filter(f -> f.equals(fruit))
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        () -> {
                            System.out.println("none");
                        });
    }

    /**
     * 判断水果名称时，忽略大小写
     * 传入水果名称，如果集合中有则打印显示，没有打印显示none
     * 即，Apple与aPPLe，相同
     * 提示：将集合中水果名称映射为大写，再与传入水果转大写，比较
     *
     * @param fruit
     */
    private static void getFruit2(String fruit) {
        fruits.stream()
                .map(f->f.toLowerCase())
                .filter(f->f.equals(fruit))
                .findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> {
                            System.out.println("none");
                        });
    }

    /**
     * 如果集合中存在，直接转为，全大写，返回
     * 如果集合中不存在，则将水果存入集合，将水果转为，全大写，返回
     * <p>
     * 提示：stream过滤后，findfirst()方法，返回Optional容器
     * 无论集合中是否存在均会返回结果，所以先执行or()操作集合中不存在的处理方法，将结果置于容器
     * 再从，当前，容器中获取，返回
     *
     * @param fruit
     * @return
     */
    private static String getFruit10(String fruit) {
        return fruits.stream()
                .map(f->f.toUpperCase())
                .findFirst()
                .or(()->Optional.of(fruit.toUpperCase()))
                .get();
    }
}