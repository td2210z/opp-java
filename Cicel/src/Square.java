public class Square extends retange{
    Square(){}

    Square(double x){

    }

    public Square(String color, Boolean ok, double w, double h) {
        super(color, ok, w, h);
    }



    @Override
    public double getArea() {
        return with * height;
    }
    public double getPerimeter() {
        return (with + height) * 2;
    }


    public String toString(){
        return "-------------------------\n" + "side : " + String.format("%.2f\n" , with) + super.toString();
    }
}
