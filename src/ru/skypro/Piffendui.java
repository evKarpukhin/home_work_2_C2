package ru.skypro;

public class Piffendui extends Hogvards implements Comparable<Piffendui> {
    // Студенты Пуффендуя трудолюбивы, верны, честны.
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Piffendui(String name, int magicPower, int magicMove, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, magicMove);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуя {" +
                "Трудолюбие = " + hardWork +
                ", Верность = " + loyalty +
                ", Честность = " + honesty +
                '}';
    }

    @Override
    public int compareTo(Piffendui o) {
        int result;
        result = Integer.compare(hardWork, o.hardWork);
        return result;
    }
}
