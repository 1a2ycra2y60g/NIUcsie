import java.util.Scanner;

class postoffice{
    private String name;
    private String account;
    private int saving;

    public postoffice(String name,String account,int deposit){
        this.name = name;
        //name = "�����";
        //System.out.println("name�Opostoffice�غc�l���ѼƬ�: "+name+"\n��this.name�Opostoffice���O���ݩ�: "+this.name);
        this.account = account;
        saving = deposit;
    }
    public void showdata() {
        System.out.print("\n"+this.name+"����/�p�j,�A���b����"+this.account);
        System.out.println(",�s�ھl�B��: "+saving+".");
    }
}




public class test {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.println("�إ߫Ȥ���");
        System.out.print("��J�Ȥ�m�W: ");
        String name = keyin.next();
        System.out.print("�]�w�}��b��:�@"); 
        String account = keyin.next();
        System.out.print("��J�}��s�ڪ��B: ");
        int deposit = keyin.nextInt();
        postoffice customer = new postoffice(name, account, deposit);
        customer.showdata();
        keyin.close(); 
    }
}