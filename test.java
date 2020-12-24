import java.util.Scanner;

class postoffice{
    private String name;
    private String account;
    private int saving;

    public postoffice(String name,String account,int deposit){
        this.name = name;
        //name = "韓國瑜";
        //System.out.println("name是postoffice建構子的參數為: "+name+"\n而this.name是postoffice類別的屬性: "+this.name);
        this.account = account;
        saving = deposit;
    }
    public void showdata() {
        System.out.print("\n"+this.name+"先生/小姐,你的帳號為"+this.account);
        System.out.println(",存款餘額為: "+saving+".");
    }
}




public class test {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.println("建立客戶資料");
        System.out.print("輸入客戶姓名: ");
        String name = keyin.next();
        System.out.print("設定開戶帳號:　"); 
        String account = keyin.next();
        System.out.print("輸入開戶存款金額: ");
        int deposit = keyin.nextInt();
        postoffice customer = new postoffice(name, account, deposit);
        customer.showdata();
        keyin.close(); 
    }
}