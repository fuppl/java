    package com.example.resource;

    import com.example.entity.Course;
    import com.example.entity.Student;
    import com.example.entity.Teacher;

    import java.util.List;

    public class Database {
        private static List<Student> students;
        private static List<Teacher> teachers;
        private static List<Course> courses;
        private static void create() {
            Student s1 = new Student(1, "a");
            Student s2 = new Student(2, "b");
            List<Student> students = List.of(s1, s2);

            Teacher t1 = new Teacher(3, "c");
            Teacher t2 = new Teacher(4, "d");
            List<Teacher> teachers = List.of(t1, t2);

            Course c1 = new Course("java", t1, students);
            Course c2 = new Course("lalala", t2, students);

            List<Course> courses = List.of(c1, c2);
        }
            public static List<Student> getStudents () {
                return students;
            }

            public static List<Teacher> getTeachers () {
                return teachers;
            }

            public static List<Course> getCourses () {
                return courses;
            }

        }
