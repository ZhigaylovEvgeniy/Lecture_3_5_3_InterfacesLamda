import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        long time = timer1.measureTime(new BigDecimalPower());
        System.out.println(time);
    }

    private static class BigDecimalPower implements Runnable{
        @Override
        public void run(){
            new BigDecimal("1234567").pow(100000);
        }
    }
}
