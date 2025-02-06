package chapter07;

public class DVDPlayerExample {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer("name") {
            public void diplayDVDSence(){
                show("DVD 장면을 랜더링 중");
            }
        };

        dvdPlayer.input();

        dvdPlayer.play();

        dvdPlayer.setVolume(10);

        dvdPlayer.diplayDVDSence();

        dvdPlayer.stop();

        dvdPlayer.output();
    }
}
