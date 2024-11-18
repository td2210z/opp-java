public class Chacter {
    private int power , blood;
    private boolean alive;


    public Chacter(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }


    public int checkSucManh(int power, int blood ) {
        if(power <= 0 && blood <= 0) {
            return 0;
        }
        return 1;

    }


    public void mushRoom(){
        if(alive) {
            power -= 2;
            blood -=15;
            if(power <= 0 || blood <= 0) {
                power =0;
                blood = 0;
                alive = false;
            }
        }
    }

    public void witch(int poWer){
        if(alive) {
            if(poWer >= power) {
                alive = false;
                power =0;
                blood =0;
            }else{
                power += 5;
            }

        }
    }

    public void Pea(){
        if(alive) {
            blood += 10;
            power += 2;
        }
    }


    public void soldier(int poWer){
        if(alive){
            if(poWer >= power) {
                alive = false;
                power =0;
                blood =0;

            } else{
                power += 7;
                blood += 5;
            }
        }

    }

    @Override
    public String toString(){
        String res = "";
        if (this.alive){
            res = "ALIVE";
        } else{
            res = "DEAD";
        }
        return "POWER : " + power + "\n"
                + "BLOOD : " + blood + "\n"
                + "ALIVE : " + res + "\n"
                + "-".repeat(30) + "\n";
    }

}
