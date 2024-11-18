public class Circle extends Shape{
    protected double radius;

    Circle(){}
    Circle(String color , Boolean fi , double radius){
        super(color , fi);
        this.radius = radius;
    }


    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public  double getArea(){
        return Math.PI * radius * radius;
    }


    @Override
    public  double getPerimeter(){
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString(){
        return "----------------------------------\n" + "radius : " + String.format("%.2f\n" , radius) + super.toString()
                + "perimiter" + String.format("%.2f" , this.getPerimeter())
                + "area" + String.format("%.2f" , this.getArea())
                + "----------------------------------\n";

    }


}
