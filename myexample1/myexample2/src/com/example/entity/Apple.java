package com.example.entity;

import com.example.util.Database;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Apple {
    public enum Color{
        RED, GREEN
    }

    private int id;
    private Color color;
    private int weight;
    public Apple(int id, Color color, int weight){
        this.id = id;
        this.color = color;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 获取指定颜色的苹果
     * @param c 颜色
     */
    public static List<Apple> getStreamMap(Apple.Color c){
        return Database.getApples()
                .stream()
                .filter(a -> c == a.getColor())
                .collect(Collectors.toList());
    }

    /**
     * 获取指定颜色和重量的苹果
     * @param c 颜色
     * @param weight 重量
     * @return
     */
    public static List<Apple> getColorAndWeight(Apple.Color c, int weight){
        return Database.getApples()
                .stream()
                .filter(a -> c == a.getColor())
                .filter(a -> weight == a.getWeight())
                .collect(Collectors.toList());
    }

    /**
     * 将苹果集合映射为苹果质量集合
     * @return
     */
    public static List<Integer> getWeightList(){
        return Database.getApples()
                .stream()
                .map(Apple::getWeight)
                .collect(Collectors.toList());
    }

    /**
     *
     */
    public static void getColors(){
        Database.getApples()
                .stream()
                .map(Apple::getColor)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    /**
     * 将苹果以颜色分组
     */
    public static void groupApples(){
        Database.getApples()
                .stream()
                .collect(Collectors.groupingBy(Apple::getColor));
    }


}


