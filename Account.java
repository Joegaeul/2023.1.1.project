public class Account {
    private String name;
    private String accountNumber;
    private int password;
    private  int total;
    public Account(String name, String accountNumber, int password, int total){
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.total = total;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getPassWord(){
        return this.password;
    }
    public int getTotal(){
        return this.total;
    }
    public void deposit(int money){
        this.total += money;
    }



}
