package com.joaoavi.ufop.edu.br.creational.factorypattern;

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife;
        knife = createKnife(knifeType);
        knife.sharpen();
        return knife;
    }
    abstract Knife createKnife(String type);
}
