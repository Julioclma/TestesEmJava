package org.example;

public class Pessoa {
    private String name;
    private Integer age;
    public Pessoa(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public boolean verificaMaioridade(){
        if(this.age >= 18){
            return true;
        }

        return false;
    }

}
