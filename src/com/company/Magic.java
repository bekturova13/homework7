package com.company;

public class Magic extends Hero {
    public Magic() {
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Magic used Magical SuperAbility");

    }
}
