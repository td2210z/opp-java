public class Cus {
    private int id;
    private String name;
    private Character gender;

    public Cus(int id, String name, Character gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer ID :" + id + "\n"
                + "Full Name :" + name + "\n"
                + "Gender :" + gender + "\n";
    }

}
