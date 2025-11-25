package curriculum_D;

public class Character {
    public String name;
    public int hp;
    public int at;
    public int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public void attack(Character target) {
        target.hp -= this.at;
        System.out.println(this.name + " attacks " + target.name + " for " + this.at + " damage!");
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}