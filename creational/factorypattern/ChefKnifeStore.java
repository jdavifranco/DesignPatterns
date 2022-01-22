package com.joaoavi.ufop.edu.br.creational.factorypattern;

public class ChefKnifeStore extends KnifeStore {

    public ChefKnifeStore() {}

    @Override
    Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
            return new ChefSteakKnife();
        }
        return null;
    }
}
