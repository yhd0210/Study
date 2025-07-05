package practice.homework.entity;

import java.util.Random;

public class RandomCharacter {

    private String name;

    private Job job;

    private int strength;

    private int intelligence;

    private int defense;

    private double healthPoint;

    private double manaPoint;

    public RandomCharacter(String name, Job job) {
        this.name = name;
        this.job = job;
        this.strength = job.baseStrength;
        this.intelligence = job.baseIntelligence;
        this.defense = job.baseDefense;
        this.healthPoint = job.baseHealthPoint;
        this.manaPoint = job.baseManaPoint;
    }

    public static RandomCharacter roleCharacter(String name) {

        Job job = new Random().nextInt(2) == 0?  Job.Warrior: Job.Wizard;

        RandomCharacter randomCharacter = new RandomCharacter(name, job);

        return randomCharacter;
    }

    @Override
    public String toString() {
        return "--------------- 내 세부 정보 ---------------" +
                "\n이름 = " + name +
                "\n직업 = " + job +
                "\n힘 = " + strength +
                "\n지능 = " + intelligence +
                "\n방어력 = " + defense +
                "\n체력 = " + healthPoint +
                "\n마력 = " + manaPoint +
                "\n-------------------------------------------\n";
    }
}
