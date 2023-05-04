class Monster {
    private int energy;
    private int attack_dmg;
    private String name;

    public Monster(String name, int energy, int attack_dmg) {
        this.energy = energy;
        this.attack_dmg = attack_dmg;
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttackDmg() {
        return attack_dmg;
    }

    public void setAttackDmg(int attack_dmg) {
        this.attack_dmg = attack_dmg;
    }

    public String getName() {
        return name;
    }
}