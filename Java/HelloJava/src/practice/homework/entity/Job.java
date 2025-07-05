package practice.homework.entity;

public enum Job {
    Warrior(10, 7, 30, 100.0, 50.0),
    Wizard(5, 12, 15, 50.0, 100.0);

    final int baseStrength;

    final int baseIntelligence;

    final int baseDefense;

    final double baseHealthPoint;

    final double baseManaPoint;

    Job(int baseStrength, int baseIntelligence, int baseDefense, double baseHealthPoint, double baseManaPoint) {
        this.baseStrength = baseStrength;
        this.baseIntelligence = baseIntelligence;
        this.baseDefense = baseDefense;
        this.baseHealthPoint = baseHealthPoint;
        this.baseManaPoint = baseManaPoint;
    }
}