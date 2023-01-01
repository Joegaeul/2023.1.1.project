import java.util.Scanner;
public class BankUI extends BankManager{
    private Scanner scanner = new Scanner(System.in);
    public BankUI(){
        System.out.println("=====은행 입출금 관리 시스템=====");
        System.out.println();
        System.out.println("1. 계좌개설");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 잔액조회");
        System.out.println("5. 전체 계좌 조회");
        System.out.println("6. 종료");
        System.out.println();
        System.out.print("항목을 선택하세요=> ");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                makeAccount();
            case 2:
                deposit();


        }
    }
}
