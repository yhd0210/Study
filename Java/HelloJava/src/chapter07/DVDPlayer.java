package chapter07;

public class DVDPlayer implements Player, Device, Display{
    private String name;

    public DVDPlayer() {}

    public DVDPlayer(String name) {
        this.name = name;
    }

    public void diplayDVDSence() {}

    @Override
    public void play() {
        System.out.println("DVD를 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("DVD를 멈춥니다.");
    }

    @Override
    public void input() {
        System.out.println("DVD를 기기에 넣었습니다.");
    }

    @Override
    public void output() {
        System.out.println("DVD를 기기에서 뺐습니다.");
    }

    @Override
    public void show(String content) {
        System.out.println(content);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("볼륨을 " + volume + "로 변경했습니다.");
    }
}
