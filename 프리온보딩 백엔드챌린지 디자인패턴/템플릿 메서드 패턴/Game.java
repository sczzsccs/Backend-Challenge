public abstract class Game { // 추상클래스로 템플릿 정의
    // 템플릿 메ㅔ서드는 final로 선언(오버라이드 불가)
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // 각 단계는 추상메서드 선언
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}