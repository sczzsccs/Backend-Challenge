public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("축구 게임을 초기화합니다.");
    }

    @Override
    protected void startPlay() {
        System.out.println("축구 게임을 시작합니다.");
    }

    @Override
    protected void endPlay() {
        System.out.println("축구 게임을 종료합니다.");
    }
}