public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name; 
    private int award; 
    private int orginalHealth;

    public Obstacle(int id, int damage, int health, String name, int award) {
        this.id = id;
        this.damage = damage;
        this.setOrginalHealth(health);
        this.name = name;
        this.award = award;
    }

    public int getOrginalHealth() {
        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
  
}
