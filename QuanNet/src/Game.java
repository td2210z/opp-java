public class Game
{
    private String user , pass , name;
    private String gioVao , gioRa;

    public Game(String user , String pass , String name , String gioVao , String gioRa){
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.gioVao = gioVao;
        this.gioRa = gioRa;

    }

    public String getUser() {
        return user;
    }

    public int layGio(){
        int g1 = Integer.parseInt(gioVao.substring(0 , 2));
        int g2 = Integer.parseInt(gioRa.substring(0 , 2));
        int r1 = Integer.parseInt(gioVao.substring(3));
        int r2 = Integer.parseInt(gioRa.substring(3));

        int p = g1 * 60 + r1;
        int p2 = g2 * 60 + r2;
        return p2 -p;

    }

    @Override
    public String toString(){
        int  ok = layGio();
        int h = ok / 60;
        int p = ok % 60;
        return user + " " + pass + " " + name + " " + h + " gio  " + p + " phut ";
    }

}
