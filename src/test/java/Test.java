import com.yj.mapper.BrandMapper;
import com.yj.pojo.Brand;
import com.yj.pojo.User;
import com.yj.service.UserService;
import com.yj.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {

    private UserService userService = new UserService();

    @org.junit.Test
    public void test1(){
        List<User> list = userService.selectAll();
        for (User user : list) {
            System.out.println(user);
        }

    }
    @org.junit.Test
    public void test2(){
        // 通过用户名和密码进行查询
        User user = userService.selectByUsernameAndPassword("清梦楼", "123");
        System.out.println(user);
        // 通过id进行查询
        User user1 = userService.selectById(2);
        System.out.println(user1);

    }
    @org.junit.Test
    public void test3(){
        userService.add(new User(null,"楼明月11","123",18));
//        userService.add(new User(null,"楼明月12","123",18));
//        userService.add(new User(null,"楼明月13","123",18));
        for (User user : userService.selectAll()) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void test4(){
        userService.deleteByArr();
    }
    @org.junit.Test
    public void test5(){
        userService.deleteById(17);
    }

    @org.junit.Test
    public void test6(){
        User user = new User();
        user.setId(10);
        user.setPassword("123456");
        user.setAge(16);
        userService.updateByUser(user);
    }


}
