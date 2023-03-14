import java.util.*;
class account_holder {
    public class user1 {
        private String name = "SAHIL KUNDU";
        private String userid = "SAHIL123";
        private long  acc = 123456;
        private int pin = 705999;
        private int bal = 10000;
        public int getpin() {
            return(this.pin);
        }
        public int getbal() {
            return(this.bal);
        }
        public void setbal(int nbal) {
            this.bal = nbal;
        }
        public String getuserid() {
            return(this.userid);
        }
        public String getname() {
            return(this.name);
        }
        public long getacc() {
            return(this.acc);
        }
    }
    public class user2 {
        private String name = "SHREYASH GUPTA";
        private String userid = "SHREY456";
        private long  acc = 1234778;
        private int pin = 6969;
        private int bal = 10000;
        public int getpin() {
            return(this.pin);
        }
        public int getbal() {
            return(this.bal);
        }
        public void setbal(int nbal) {
            this.bal = nbal;
        }
        public String getuserid() {
            return(this.userid);
        }
        public String getname() {
            return(this.name);
        }
        public long getacc() {
            return(this.acc);
        }
    }
    public class user3 {
        private String name = "AMAN KUMAR";
        private String userid = "AMAN5987";
        private long  acc = 12345555;
        private int pin = 7169;
        private int bal = 10000;
        public int getpin() {
            return(this.pin);
        }
        public int getbal() {
            return(this.bal);
        }
        public void setbal(int nbal) {
            this.bal = nbal;
        }
        public String getuserid() {
            return(this.userid);
        }
        public String getname() {
            return(this.name);
        }
        public long getacc() {
            return(this.acc);
        }
    }
    public class user4 {
        private String name = "SAYANDEEP SHARMA";
        private String userid = "SAYANDEEP8977";
        private long  acc = 12344478;
        private int pin = 2569;
        private int bal = 10000;
        public int getpin() {
            return(this.pin);
        }
        public int getbal() {
            return(this.bal);
        }
        public void setbal(int nbal) {
            this.bal = nbal;
        }
        public String getuserid() {
            return(this.userid);
        }
        public String getname() {
            return(this.name);
        }
        public long getacc() {
            return(this.acc);
        }
    }
}
class transaction {
    Scanner ob = new Scanner(System.in);
    public List<Integer> amt = new ArrayList<Integer>();
    public List<String> type = new ArrayList<String>();
    public List<Integer> newbal = new ArrayList<Integer>();
    public int amtpos = 0;
    public void transhist() {
        int amt1[] = {5000,1000,5000,6000,7000};
        String type1[] = {"CREDIT","DEBIT","CREDIT","DEBIT","CREDIT"};
        int newbal1[] = {5000,4000,9000,3000,10000};
        System.out.println("SL.NO \t AMOUNT \t TRANSACTION TYPE \t CLOSING BALANCE");
        for(int i = 0; i < 5; i++) {
            System.out.println((i+1)+"\t\t"+amt1[i]+"\t\t\t"+type1[i]+"\t\t\t\t"+newbal1[i]);
        }
        for(int i = 0; i < this.amtpos; i++) {
            System.out.println((i+6)+"\t\t"+this.amt.get(i)+"\t\t\t"+this.type.get(i)+"\t\t\t\t"+this.newbal.get(i));
        }
    }
    public void addrec(int a, int b, String c) {
        this.amt.add(a);
        this.newbal.add(b);
        this.type.add(c);
        this.amtpos = amtpos + 1;
    }
    public int withdraw(int bal) {
        System.out.println("ENTER AMOUNT TO BE WITHDRAWED : ");
        int amt = ob.nextInt();
        System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
        bal = bal - amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt, bal, "DEBIT");
        return bal;
    }
    public int deposit(int bal) {
        System.out.println("ENTER AMOUNT TO BE DEPOSITED : ");
        int amt = ob.nextInt();
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        bal = bal + amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt, bal, "CREDIT");
        return bal;
    }
}
class mdp {
    Scanner mc = new Scanner(System.in);
    transaction ob = new transaction();
    public int choice(String nam, long acc, int bala) {
        int n = 1;
        while(n == 1) {
            System.out.println("PRESS 1 FOR INFO");
            System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
            System.out.println("PRESS 3 FOR WITHDRAWAL");
            System.out.println("PRESS 4 FOR DEPOSIT");
            System.out.println("PRESS 5 TO EXIST");
            int ch= mc.nextInt();
            int nbal;
            System.out.println("-----------------------------------------------------");
            switch(ch) {
                case 1 :
                    System.out.println("USER NAME IS :"+nam);
                    System.out.println("USER ACCOUNT NUMBER  IS :"+acc);
                    System.out.println("USER ACCOUNT BALANCE IS :"+bala);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2 :
                    ob.transhist();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3 :
                    nbal = ob.withdraw(bala);
                    bala = nbal;
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4 :
                    nbal = ob.deposit(bala);
                    bala = nbal;
                    System.out.println("-----------------------------------------------------");
                    break;
                default :
                    System.out.println("TRANSACTION COMPLETED");
                    System.out.println("-----------------------------------------------------");
                    n = 0;
            }
        }
        return(bala);
    }
}
public class Bank {
    public static void main(String[] args) {
        account_holder cl = new account_holder();
        account_holder.user1 ob1 = cl.new user1();
        account_holder.user2 ob2 = cl.new user2();
        account_holder.user3 ob3 = cl.new user3();
        account_holder.user4 ob4 = cl.new user4();
        mdp bc = new mdp();
        Scanner mc = new Scanner(System.in);
        System.out.println("ENTER USER ID : ");
        String usid = mc.nextLine();
        System.out.println("ENTER PIN : ");
        int pn = mc.nextInt();
        int n;
        if (pn == ob1.getpin() && usid.equals(ob1.getuserid())) {
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob1.getname());
            System.out.println("-----------------------------------------------------");
            n = bc.choice(ob1.getname(), ob1.getacc(), ob1.getbal());
            ob1.setbal(n);
        }
        else if (pn == ob2.getpin() && usid.equals(ob2.getuserid())) {
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob2.getname());
            System.out.println("-----------------------------------------------------");
            n = bc.choice(ob2.getname(), ob2.getacc(), ob2.getbal());
            ob2.setbal(n);
        }
        else if (pn == ob3.getpin() && usid.equals(ob3.getuserid())) {
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob3.getname());
            System.out.println("-----------------------------------------------------");
            n = bc.choice(ob3.getname(), ob3.getacc(), ob3.getbal());
            ob3.setbal(n);
        }
        else if (pn == ob4.getpin() && usid.equals(ob4.getuserid())) {
            System.out.println("-----------------------------------------------------");
            System.out.println("WELCOME "+ob4.getname());
            System.out.println("-----------------------------------------------------");
            n = bc.choice(ob4.getname(), ob4.getacc(), ob4.getbal());
            ob4.setbal(n);
        }
        else {
            System.out.println("INCORRECT USER ID OR PIN");
        }
    }
}
