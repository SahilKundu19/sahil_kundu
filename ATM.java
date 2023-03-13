import java.util.*;
//import create.*;
class acoount_holder{
    public class user1{
        private String name="SHREYASH GUPTA";
        private String userid="SHREY1234";
        private long acc=123456777;
        private int pin=6969;
        private int bal=10000;
        //System.out.println("NAME IS "+name);
        public int  getpin()
        {
            return(this.pin);
        }
        public int  getbal()
        {
            return(this.bal);
        }
        public void setbal(int nbal)
        {
            this.bal=nbal;
        }
        public String  getuserid()
        {
            return(this.userid);
        }
        public String  getname()
        {
            return(this.name);
        }
        public long  getacc()
        {
            return(this.acc);
        }
    }
    public class user2{
        String name="AMAN KUMAR";
        private String userid="AMAN1234";
        private int bal=10000;
        private long acc=123457999;
        private int pin=1769;
        public String bname="PNB";
        public int  getpin()
        {
            return(this.pin);
        }
        public int  getbal()
        {
            return(this.bal);
        }
        public String  getuserid()
        {
            return(this.userid);
        }
        public void setbal(int nbal)
        {
            this.bal=nbal;
        }
        public String  getname()
        {
            return(this.name);
        }
        public long  getacc()
        {
            return(this.acc);
        }
    }
    public class user3{
        String name="SAHIL KUNDU";
        private String userid="SAHIL705999";
        private int bal=10000;
        private long acc=123458999;
        private int pin=7059;
        public void setbal(int nbal)
        {
            this.bal=nbal;
        }
        public int  getpin()
        {
            return(this.pin);
        }
        public String  getuserid()
        {
            return(this.userid);
        }
        public String  getname()
        {
            return(this.name);
        }
        public long  getacc()
        {
            return(this.acc);
        }
        public int  getbal()
        {
            return(this.bal);
        }
    }
    public class user4{
        String name="SAYANDEEP SHARMA";
        private String userid="SAYANDEEP1236";
        private int bal=10000;
        private long acc=123459000;
        private int pin=1269;
        public int  getpin()
        {
            return(this.pin);
        }
        public void setbal(int nbal)
        {
            this.bal=nbal;
        }
        public int  getbal()
        {
            return(this.bal);
        }
        public String  getuserid()
        {
            return(this.userid);
        }
        public String  getname()
        {
            return(this.name);
        }
        public long  getacc()
        {
            return(this.acc);
        }
    }

}
class transaction {
    Scanner ob = new Scanner(System.in);

    // public int amt[]=new int[100];
    public int amt[]=new int [100];
    public String type[]=new String[100];
    public int newbal[]=new int[100];
    public int amtpos=0;
    public void transhist(){
        int amt1[]={5000,1000,5000,6000,7000,};
        String type1[]={"CREDIT","DEBIT","CREDIT","DEBIT","CREDIT"};
        int newbal1[]={5000,4000,9000,3000,10000};
        System.out.println("SL.NO \t AMOUNT \t TRANSACTION TYPE \t CLOSING BALANCE");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"\t\t"+amt1[i]+"\t\t\t"+type1[i]+"\t\t\t\t"+newbal1[i]);
        }
        for(int i=0;i<this.amtpos;i++){
            System.out.println((i+6)+"\t\t"+this.amt[i]+"\t\t\t"+this.type[i]+"\t\t\t\t"+this.newbal[i]);
        }

    }
    public void addrec(int a,int b,String c){
        this.amt[this.amtpos]=a;
        this.newbal[this.amtpos]=b;
        this.type[this.amtpos]=c;
        this.amtpos=amtpos+1;
    }
    public int withdraw(int bal) {
        System.out.println("ENTER AMOUNT TO BE WITHDRAWED");
        int amt = ob.nextInt();
        System.out.println("AMOUNT WITHDRAWED SUCCESSFULLY");
        bal = bal - amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt,bal,"DEBIT");
        return bal;
    }

    public int deposit(int bal) {
        System.out.println("ENTER AMOUNT TO BE DEPOSITED");
        int amt = ob.nextInt();
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        bal = bal + amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt,bal,"CREDIT");
        return bal;
    }
}
public class ATM {
    public static void main(String[] args) {
        acoount_holder cl=new acoount_holder();
        acoount_holder.user1 ob1=cl.new user1();
        acoount_holder.user2 ob2=cl.new user2();
        acoount_holder.user3 ob3=cl.new user3();
        acoount_holder.user4 ob4=cl.new user4();
        transaction ob=new transaction();
        // cl.getset();

        Scanner mc=new Scanner(System.in);
        System.out.println("ENTER USER ID ");
        String usid=mc.nextLine();
        System.out.println("ENTER PIN ");
        int pn=mc.nextInt();
        int n = 1;
        if (pn==ob1.getpin() &&  usid.equals(ob1.getuserid())){
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob1.getname());
            System.out.println();
            System.out.println("-----------------------------------------------------");;
            while(n == 1){
                System.out.println("PRESS 1 FOR INFO");
                System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
                System.out.println("PRESS 3 FOR WITHDRAWAL");
                System.out.println("PRESS 4 FOR DEPOSIT");
                System.out.println("PRESS 5 TO EXIST");
                int ch= mc.nextInt();
                int nbal=0;
                System.out.println("-----------------------------------------------------");
                switch(ch){
                    case 1:
                        System.out.println("USER NAME IS :"+ob1.getname());
                        System.out.println("USER ACCOUNT NUMBER  IS :"+ob1.getacc());
                        System.out.println("USER ACCOUNT BALANCE IS :"+ob1.getbal());
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 2:
                        ob.transhist();
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 3:
                        nbal=ob.withdraw(ob1.getbal());
                        ob1.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 4:
                        nbal=ob.deposit(ob1.getbal());
                        ob1.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    default:
                        System.out.println("TRANSACTION COMPLETED");
                        System.out.println("-----------------------------------------------------");
                        n=0;
                }
            }
        }
        else if (pn==ob2.getpin() &&  usid.equals(ob2.getuserid())){
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob2.getname());
            System.out.println();
            System.out.println("-----------------------------------------------------");;
            while(n == 1){
                System.out.println("PRESS 1 FOR INFO");
                System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
                System.out.println("PRESS 3 FOR WITHDRAWAL");
                System.out.println("PRESS 4 FOR DEPOSIT");
                System.out.println("PRESS 5 TO EXIST");
                int ch= mc.nextInt();
                int nbal=0;
                System.out.println("-----------------------------------------------------");
                switch(ch){
                    case 1:
                        System.out.println("USER NAME IS :"+ob2.getname());
                        System.out.println("USER ACCOUNT NUMBER  IS :"+ob2.getacc());
                        System.out.println("USER ACCOUNT BALANCE IS :"+ob2.getbal());
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 2:
                        ob.transhist();
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 3:
                        nbal=ob.withdraw(ob2.getbal());
                        ob2.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 4:
                        nbal=ob.deposit(ob2.getbal());
                        ob2.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    default:
                        System.out.println("TRANSACTION COMPLETED");
                        System.out.println("-----------------------------------------------------");
                        n=0;
                }
            }
        }
        else if (pn==ob3.getpin() &&  usid.equals(ob3.getuserid())){
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob3.getname());
            System.out.println();
            System.out.println("-----------------------------------------------------");;
            while(n == 1){
                System.out.println("PRESS 1 FOR INFO");
                System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
                System.out.println("PRESS 3 FOR WITHDRAWAL");
                System.out.println("PRESS 4 FOR DEPOSIT");
                System.out.println("PRESS 5 TO EXIST");
                int ch= mc.nextInt();
                int nbal=0;
                System.out.println("-----------------------------------------------------");
                switch(ch){
                    case 1:
                        System.out.println("USER NAME IS :"+ob3.getname());
                        System.out.println("USER ACCOUNT NUMBER  IS :"+ob3.getacc());
                        System.out.println("USER ACCOUNT BALANCE IS :"+ob3.getbal());
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 2:
                        ob.transhist();
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 3:
                        nbal=ob.withdraw(ob3.getbal());
                        ob3.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 4:
                        nbal=ob.deposit(ob3.getbal());
                        ob3.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    default:
                        System.out.println("TRANSACTION COMPLETED");
                        System.out.println("-----------------------------------------------------");
                        n=0;
                }
            }
        }
        else if (pn==ob4.getpin() &&  usid.equals(ob4.getuserid())){
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob4.getname());
            System.out.println();
            System.out.println("-----------------------------------------------------");;
            while(n == 1){
                System.out.println("PRESS 1 FOR INFO");
                System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
                System.out.println("PRESS 3 FOR WITHDRAWAL");
                System.out.println("PRESS 4 FOR DEPOSIT");
                System.out.println("PRESS 5 TO EXIST");
                int ch= mc.nextInt();
                int nbal=0;
                System.out.println("-----------------------------------------------------");
                switch(ch){
                    case 1:
                        System.out.println("USER NAME IS :"+ob4.getname());
                        System.out.println("USER ACCOUNT NUMBER  IS :"+ob4.getacc());
                        System.out.println("USER ACCOUNT BALANCE IS :"+ob4.getbal());
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 2:
                        ob.transhist();
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 3:
                        nbal=ob.withdraw(ob4.getbal());
                        ob4.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    case 4:
                        nbal=ob.deposit(ob4.getbal());
                        ob4.setbal(nbal);
                        System.out.println("-----------------------------------------------------");
                        break;
                    default:
                        System.out.println("TRANSACTION COMPLETED");
                        System.out.println("-----------------------------------------------------");
                        n=0;
                }
            }
        }
        else {
            System.out.println("INCORRECT USER ID OR PIN");
        }
    }
}


