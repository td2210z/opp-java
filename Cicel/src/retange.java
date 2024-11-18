public class retange extends Shape{
    protected double with , height;

    retange(){}
    retange(String color , Boolean ok , double w, double h){
        super(color, ok);
        with = w;
        height = h;


    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return with * height;
    }
    public double getPerimeter() {
        return (with + height) * 2;
    }

    @Override
    public String toString(){
        return "---------------------------------\n" + "width :  " + String.format("%.2f\n" , with)
                + "length :  " + String.format("%.2f\n" , height)
                + super.toString()
                + "primater : " + String.format("%.2f\n" , this.getPerimeter())
                + "area : " + String.format("%.2f\n" , this.getArea())
                + "-----------------------------------------------\n";

    }

}
