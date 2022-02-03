import java.math.BigInteger;
import java.util.*;

public class PizanoPeriod {


//    Map<Long, BigInteger> cache = new HashMap<>();
    List<BigInteger> cache = new ArrayList<>();
    {
        cache.add(BigInteger.ONE);
        cache.add(BigInteger.ZERO);
    }

    private BigInteger get_fibonacci_huge(int n) {

        for (int i = cache.size(); i<=n; i++){
            BigInteger res = cache.get(i-1).add(cache.get(i-2));
            cache.add(res);
        }
        return cache.get(n);
    }

    private void run(int n,int m){
        System.out.println(get_fibonacci_huge(n).divide(get_fibonacci_huge(m)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibaNum = sc.nextInt();
        int fibaDec = sc.nextInt();
        new PizanoPeriod().run(fibaNum,fibaDec);
    }
}
