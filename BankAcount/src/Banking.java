import java.util.ArrayList;

public class Banking {
    private  String ID , CustomerID , stk , PIN;
    private int soDu;

    public Banking(String ID, String CustomerID, String stk, String PIN, int soDu) {
        this.ID = ID;
        this.CustomerID = CustomerID;
        this.stk = stk;
        this.PIN = PIN;
        this.soDu = soDu;
    }

    public void congTien(int tien){
        this.soDu += tien;
    }

    public void truTien(int tien){
        if(this.soDu - 50000 >= tien){
            this.soDu -= tien;
        }
    }

    public int getSoDu(){
        return this.soDu;
    }

    public static int findAcc(ArrayList<Banking> a  , String tk){
        for (int i =0 ;i < a.size() ;i++){
            if (a.get(i).stk.equals(tk)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return "ID : " + ID + "\n"
                + "CustomerID : " + CustomerID + "\n"
                + "STK : " + stk + "\n"
                + "PIN : " + PIN + "\n"
                + "SODU : " + soDu + "VND" + "\n"
                + "--------------------------------------------\n";

    }
}
