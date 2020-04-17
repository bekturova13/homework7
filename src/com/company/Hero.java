package com.company;

public abstract class Hero implements HavıngSuperAbılıty{
    int heroHealth;
    int heroDamage;
    String superAbilityType;

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

    }
}
