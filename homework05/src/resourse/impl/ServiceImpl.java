package resourse.impl;

import Service.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {
    @Override
    public List<Integer> Service1(List<Integer> integers) {
        return integers.stream()
                .filter(a->a%2==0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> Service2(List<Integer> integers) {
        return integers.stream()
                .filter(a->a%2==1&&a<30)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> Service3(List<Integer> integers) {
                return integers.stream()
                .filter(a->a%3==0)
                .map(a->a*1000)
                        .collect(Collectors.toList());
    }

    @Override
    public List<Integer> Service4(List<Integer> integers) {
        return integers.stream()
                .filter(a->a%3==0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
