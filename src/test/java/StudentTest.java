import com.yj.pojo.Clazz;
import com.yj.pojo.Student;
import com.yj.service.ClazzService;
import com.yj.service.StudentService;
import org.junit.Test;

public class StudentTest {
    private StudentService service = new StudentService();
    private ClazzService service1 = new ClazzService();

    @Test
    public void test1(){
        for (Student student : service.selectAll()) {
            System.out.println(student);
        }
        for (Clazz clazz : service1.selectAll()) {
            System.out.println(clazz);
        }
    }
}
