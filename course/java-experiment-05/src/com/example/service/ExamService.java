package com.example.service;

import com.example.entity.Exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 实现类中，通过调用Database.getExams()方法，获取考试集合操作
 */
public interface ExamService {
    /**
     * 获取考试日期是学期的第几周，周起始从1而非0计算
     * 提示：在接口实现类中，创建一个基于2019-02-25日期的常量对象
     * 检索ChronoUnit中合适的日期时间单位枚举常量
     *
     * @param date
     * @return
     */
    int getWeeks(LocalDate date);

    /**
     * 获取指定日期当天所有考试
     * 提示：可使用isEquals()方法，日期时间类均重写了equals()方法，也可用于判断
     *
     * @param date
     * @return
     */
    List<Exam> listExams(LocalDate date);

    /**
     * 获取指定日期时间，的所有考试
     * 提示：日期与开始时间相同，即可
     * 提示：日期时间类均重写了equals()方法，也可用于判断
     *
     * @param startDateTime
     * @return
     */
    List<Exam> listExams(LocalDateTime startDateTime);

    /**
     * 获取指定考试持续时间的所有考试，基于分钟为计算单位
     * 例如，获取所有90钟的考试，或所有120分钟的考试
     * 提示：可以将开始时间加上传入的持续时间，判断是否等于结束时间
     * 提示：LocalTime重写了equals方法，用于判断时间是否相等
     *
     * @param durationMinutes
     * @return
     */
    List<Exam> listExams(int durationMinutes);
}