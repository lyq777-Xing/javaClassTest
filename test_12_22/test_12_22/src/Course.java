/**
 * @author lyq
 * @time 2023/12/22 19:26
 */
public class Course{
    private String name;
    private String courseId;
    private String teacherName;

    public Course(String name, String courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    public Course(String name, String courseId, String teacherName) {
        this.name = name;
        this.courseId = courseId;
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseId='" + courseId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
