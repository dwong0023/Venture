package People;

public class Pet {
    public String name;
    public int attack;
    public int speed;
    public int dodge;
    public int accuracy;
    public int petbond;

    public String regattack;

    public Pet(String name, int attack, int speed, int dodge, int accuracy, int bond, String regattack)
    {
        this.name = name;
        this.attack = attack;
        this.speed = speed;
        this.dodge = dodge;
        this.accuracy = accuracy;
        this.petbond = bond;

        this.regattack = regattack;
    }

    public void attack(String target, String ability)
    {

    }
}
