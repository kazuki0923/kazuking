package curriculum_D;

public class Character {
    private String name;
    private int hp;
    private int at;
    private int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getAt() { return at; }
    public int getSp() { return sp; }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public int attack(Character defender) {
        int damage = this.at;
        defender.takeDamage(damage);
        return damage;
    }
}