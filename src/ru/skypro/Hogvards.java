package ru.skypro;
//
public class Hogvards {
    private String name;
    private int magicPower;
    private int magicMove;

    public Hogvards(String name, int magicPower, int magicMove) {
        this.name = name;
        this.magicPower = magicPower;
        this.magicMove = magicMove;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getMagicMove() {
        return magicMove;
    }

    @Override
    public String toString() {
        return "Хогвартс {" +
                "Имя ='" + name + '\'' +
                ", Колдовство= " + magicPower +
                ", Ерансгрессировать=" + magicMove +
                '}';
    }

}
