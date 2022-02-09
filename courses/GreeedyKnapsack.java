import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class GreeedyKnapsack {

    public static void main(String[] args) throws FileNotFoundException {
        Long startTime = System.currentTimeMillis();
        new GreeedyKnapsack().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime-startTime + "ms");

    }

    class Item implements Comparable<Item>{
        int cost;
        int weigth;
        public Item (int cost , int weigth){
            this.cost = cost;
            this.weigth = weigth;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weigth=" + weigth +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            long rl1 = cost * o.weigth;
            long rl2 = o.cost * weigth;
//            double r1 = cost/weigth; замена дабл на лонг, чтобы сравнивать без погрешностей
//            double r2 = o.cost/o.weigth;
            return -Long.compare(rl1,rl2);
        }
    }

    private void run() throws FileNotFoundException {

        Scanner sc = new Scanner( new File("courses\\text.txt"));
        int n = sc.nextInt();
        int w = sc.nextInt();

        Item[] items = new Item[n];
        for(int i = 0;i<n;i++){
            items[i] = new Item(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(items);

        double result = 0;
        for (Item it : items){
            if (it.weigth<= w){
                result+=it.cost;
                w-=it.weigth;
            }else {
                result+=(double) it.cost * w/it.weigth;
                break;
            }
        }
        String formattedDouble = new DecimalFormat("#0.000").format(result);
        System.out.print(formattedDouble);
    }
}
