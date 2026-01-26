package ch11.sec06;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    //입금
    public void deposit(int money){
        balance += money;
    }
    //출금
    //예외객체를 던진다면 메소드에 throws로 어떤 예외를 던지는지 명시해줘야 함.
    public void withdraw(int money) throws InsufficienException {
        if(balance< money){
            throw new InsufficienException("잔고 부족: "+ (money-balance)+ "원이 부족함");
        }
        balance -= money;
    }
    public void checkBalance(){
        System.out.printf("예금액: %,d원\n",balance);
    }
}
