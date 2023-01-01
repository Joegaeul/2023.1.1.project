import java.util.Scanner;
public class BankManager {
    private Scanner scanner;
    static Account[] accounts = new Account[100];
    static int index = 0;
    public void makeAccount() {
        System.out.println("성명, 계좌번호, 비밀번호, 잔고를 입력하시오.");
        scanner = new Scanner(System.in);
        String name = scanner.next();
        String accountNumber = scanner.next();
        int password = scanner.nextInt();
        int total = scanner.nextInt();

        accounts[index] = new Account(name, accountNumber, password, total);
        index++;
    }
    public void deposit(){
        System.out.print("입금할 계좌번호 입력=> ");
        String accountNumber = scanner.next().trim();
        for(int i=0; i<accounts.length;i++){
            if(accountNumber.equals(accounts[i].getAccountNumber())){
                System.out.print("비밀번호 입력=> ");
                int password = scanner.nextInt();
                if(password==accounts[i].getPassWord()){
                    System.out.print("입금할 금액 입력=> ");
                    int money = scanner.nextInt();
                    accounts[i].deposit(money);
                    System.out.println("입금완료");
                }
            }
        }
    }
}
