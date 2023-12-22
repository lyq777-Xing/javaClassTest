import java.util.ArrayList;
import java.util.Objects;

/**
 * @author lyq
 * @time 2023/12/22 19:26
 */
public class CourseSchedule{
    private String userCode;
    private ArrayList<Course> courses;

    public CourseSchedule() {
    }

    public CourseSchedule(String userCode, ArrayList<Course> courses) {
        this.userCode = userCode;
        this.courses = courses;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void add(Course course){
        courses.add(course);
    }

    public void delete(Course course){
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).equals(course)){
                courses.remove(i);
            }
        }
    }

    public ArrayList<Course> queryByKey(String key){
        ArrayList<Course> courses1 = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getName().contains(key)){
                courses1.add(courses.get(i));
            }
        }
        return courses1;
    }

    @Override
    public String toString() {
        return "CourseSchedule{" +
                "userCode='" + userCode + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseSchedule that = (CourseSchedule) o;
        return Objects.equals(userCode, that.userCode) && Objects.equals(courses, that.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCode, courses);
    }
}
