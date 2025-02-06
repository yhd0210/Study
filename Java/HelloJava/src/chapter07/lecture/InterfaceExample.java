package chapter07.lecture;

// 첫 번째 상위 인터페이스
interface Playable {
    // 재생
    void play();

    // 재생 멈춤
    void stop();
}
interface Recordable {
    // 녹음
    void record();

    // 녹음 일시중지
    void pause();
}

interface MultimediaPlayer extends Playable, Recordable {
    // 해당 인터페이스에서 추가적으로 정의할 메서드 등이 있을 수 있음
    //void charge();
}

class MP3Player implements MultimediaPlayer{

    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 정지합니다.");
    }

    @Override
    public void record() {
        System.out.println("현재 소리를 녹음합니다.");
    }

    @Override
    public void pause() {
        System.out.println("녹음을 일시 정지합니다.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MultimediaPlayer player = new MP3Player();

        player.play();
        player.stop();
        player.record();
        player.pause();
    }
}
