package com.joaoavi.ufop.edu.br.creational.singletonpattern;

public class Database {
    static private Database INSTANCE = null;
    private Database(){
        System.out.println("create database");
    }
    public Database getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Database();
        }
        return INSTANCE;
    }
}
