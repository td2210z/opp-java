public class hcn {
    private double with , weith;
    private String coLor;

    hcn(double with, double weith, String coLor) {
        this.with = with;
        this.weith = weith;
        this.coLor = coLor;
    }

    public double getWith(){
        return with;
    }
    public void setWith(double with){
        this.with = with;
    }
    public double getWeith(){
        return weith;

    }

    public void setWeith(double weith){
        this.weith = weith;
    }

    public String getColor(){
        return coLor;
    }
    public void setColor(String coLor){
        this.coLor = coLor;
    }

    public double getArea(){
        return this.with * this.weith;
    }

    public double getPerimeter(){
        return (this.with + this.weith)  * 2;
    }
    @Override
    public String toString(){
        return getArea() + " " + getPerimeter() + " " + coLor;
    }




}
