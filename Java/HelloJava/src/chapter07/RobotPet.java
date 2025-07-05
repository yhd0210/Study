package chapter07;

public abstract class RobotPet {
    private String name;
    private String masterName;

    public RobotPet(String name, String masterName){
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() {
        return name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void introduce() {
        toStr();
        work();
    }

    public abstract void work();
    public abstract void toStr();
}
