//DAY9
//ENCAPSULATION

class Account{
    private String accname="Anuska";
    private int number=123456789;
    private int balance=500;
    public int get(){
        return balance;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName(){
        return accname;
    }
    public void setName(String n){
         accname=n;
    }
    public void setBalance(int val){
        balance=val;

    }
}
class online{
    public static void main(String args[]){
        Account ob=new Account();
        System.out.println("OLD name: "+ob.getName());
        ob.setName("Polly");
        System.out.println("NEW name: "+ob.getName());
        System.out.println("OLD balance: "+ob.get());
        ob.setBalance(800);
        System.out.println("NEW balance: "+ob.get());


    }
}
