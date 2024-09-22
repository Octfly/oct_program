import java.util.Random;
import java.util.Scanner;

public class LotteryTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("选出你的号码（一元一次）：");
        int HaoMa = scanner.nextInt();
        int hsh = random.nextInt(20);
        System.out.println("中奖号码是" + hsh);

        scanner.close();

        if (HaoMa == hsh) {
            System.out.println("中奖啦！（￥8）");
        }
        else {
            System.out.println("谢谢惠顾");
        }
    }

    
}