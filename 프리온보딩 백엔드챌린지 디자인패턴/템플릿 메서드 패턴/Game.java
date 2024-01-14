public abstract class Game { // �߻�Ŭ������ ���ø� ����
    // ���ø� �ޤļ���� final�� ����(�������̵� �Ұ�)
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    // �� �ܰ�� �߻�޼��� ����
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}