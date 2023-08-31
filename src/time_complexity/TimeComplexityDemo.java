package time_complexity;

/**
 * Although we can get delayed time in different algorithms in the below examples but
 * this may vary from platform to platform and to determine we have different
 * mathematical tools which helps us to determine time complexity
 */
public class TimeComplexityDemo {

    Long currentTime;
    public static void main(String[] args) {
        TimeComplexityDemo demo = new TimeComplexityDemo();
        demo.currentTime = System.currentTimeMillis();
        System.out.println(demo.findSum(99999999));
    }

    public long findSum(long n) {
        System.out.println(System.currentTimeMillis() - currentTime +" MilliSeconds");
        return n * (n + 1) / 2;
    }

//    public long findSum(long n) {
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(System.currentTimeMillis() - currentTime +" MilliSeconds");
//        return sum;
//    }
}