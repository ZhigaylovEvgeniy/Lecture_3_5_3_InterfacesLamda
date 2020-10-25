import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        long time = timer1.measureTime(new Runnable(){
            @Override
            public void run(){
                new BigDecimal("1234567").pow(100000);
            }
        });
        System.out.println(time);
    }
}
