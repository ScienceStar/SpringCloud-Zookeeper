import com.bean.Singleton;
import org.junit.Test;

/**
 * @ClassName TestSing
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/26 13:14
 * @Version V1.0
 **/
public class TestSing {

    @Test
    public void getSingleton(){
        Singleton singleton = Singleton.getInstance();
        singleton.setUserName("jack");
        singleton.setUserAge(21);
        System.out.println(singleton.getUserName()+"   "+singleton.getUserAge());
    }
}
