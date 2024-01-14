public class Chess extends Game {
    @Override
    protected void initialize() {
        System.out.println("체스 게임을 초기화합니다.");
    }

    @Override
    protected void startPlay() {
        System.out.println("체스 게임을 시작합니다.");
    }

    @Override
    protected void endPlay() {
        System.out.println("체스 게임을 종료합니다.");
    }
}