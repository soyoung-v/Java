package ch11.sec06;

public class AccountMain {
    public static void main(String[] args){
        Account account = new Account();
        account.deposit(20_000);
        account.checkBalance();
        try {
            account.withdraw(5000);
        } catch (InsufficienException e){
            System.out.println("insufficient 예외: "+ e.getMessage());
        } catch (Exception e){
            System.out.println("예외 발생");
        }
        account.checkBalance();
    }
}
