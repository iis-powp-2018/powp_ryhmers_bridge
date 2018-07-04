package edu.kis.vh.nursery;

// kombinacja klawiszy alt + ← oraz → nawiguje pomiedzy otwartymi klasami
// zmiana wymaga podania implementacji IntContainer
public class CountingOutRhymer {

  private IntContainer intContainer;

    public CountingOutRhymer(IntContainer intContainer) {
        this.intContainer = intContainer;
    }

    public CountingOutRhymer() {
    }

    public boolean callCheck() {
        return intContainer.callCheck();
    }

    public boolean isFull() {
        return intContainer.isFull();
    }

    public void countIn(int in) {
        intContainer.countIn(in);
    }

    public int countOut() {
        return intContainer.countOut();
    }

    public int peekaboo() {
        return intContainer.peekaboo();
    }
}
