import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentCounter implements Counter {

    private AtomicLong value = new AtomicLong(COUNT);

    @Override
    public void increment() {
        value.incrementAndGet();
        System.out.println("value is " + value);
    }

    @Override
    public long getValue() {
        return value.get();
    }
}
