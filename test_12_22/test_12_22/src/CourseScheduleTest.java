import java.util.ArrayList;
import java.util.Objects;

/**
 * @author lyq
 * @time 2023/12/22 19:15
 */
public class CourseScheduleTest {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Java","N001"));
        courses.add(new Course("HTML","N002"));
        courses.add(new Course("Java Web","N003"));
        CourseSchedule schedule = new CourseSchedule("N3230443000", courses);
//        输出信息
        System.out.println(schedule);
//        添加课程
        Course course = new Course("计算机网络", "N004");
        schedule.add(course);
        System.out.println(schedule);
//        删除课程
        schedule.delete(course);
        System.out.println(schedule);
//        根据关键字查询
        ArrayList<Course> java = schedule.queryByKey("Java");
        System.out.println(java.toString());
    }
}

