import Service.Service;
import resourse.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Service s= new ServiceImpl();
        List<Integer> integers=new ArrayList<>();
        for(int i=0;i<100;i++){
            Random rand=new Random();
            integers.add(rand.nextInt(100)+1);
        }
        System.out.println("一");
        for(int a:s.Service1(integers)){
            System.out.println(a);
        }
        System.out.println("二");
        for(int a:s.Service2(integers)){
            System.out.println(a);
        }
        System.out.println(("三"));
        for(int a:s.Service3(integers)){
            System.out.println(a);
        }
        System.out.println("四");
        for(int a:s.Service4(integers)){
            System.out.println(a);
        }
    }
}
