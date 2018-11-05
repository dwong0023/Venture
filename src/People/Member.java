package People;

public class Member {
    public String name;
    public int health;
    public int attack;
    public int speed;
    public int dodge;
    public int accuracy;
    public int bond;

    public String regattack;
    public String powerattack;
    public String specability;

    public Member(String name, int health, int attack, int speed, int dodge, int accuracy, int bond, String regattack, String powerattack, String specability)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.dodge = dodge;
        this.accuracy = accuracy;
        this.bond = bond;

        this.regattack = regattack;
        this.powerattack = powerattack;
        this.specability = specability;
    }

    public void attack(String target, String ability)
    {

    }
}
