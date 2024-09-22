import java.util.Random;
import java.util.Scanner;

public class Batch_LotteryTicket {
    public static void main(String[] args) {
        int ci = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("要抽几次（一次一毛）：");
        int ChouShu = scanner.nextInt();

        System.out.println("中奖号码是66");

        for (int i = 0; i < ChouShu; i++) {
            int hsh = random.nextInt(100);
            if (hsh == 66) {
                System.out.println(hsh + "中奖啦！（￥5）");
                ci += 1;
            }
            
            else {
                System.out.println(hsh + "谢谢惠顾");
            }
        }
        scanner.close();
        System.out.println("中奖数：" + ci);
    }
    
}