import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ThreadId
 * @Description: TODO ThreadLocal 测试
 * @Author lxc
 * @Date 2020/8/29 10:39
 * @Version V1.0
 **/
public class ThreadId {

    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };

    public static int get() {
        return threadId.get();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    () -> {
                        System.out.println(Thread.currentThread().getId());
                    }
            ).start();
        }
    }
}
