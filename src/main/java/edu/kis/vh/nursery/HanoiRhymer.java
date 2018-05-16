package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /*W intelij:
        alt + ctrl + strzałka, przenosi miedzy ostatnimi pozycjami kursorów
        alt + shitf + backspace, przenosi w miejsce ostatniej edycji

     */
}