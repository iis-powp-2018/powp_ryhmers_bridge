package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    final private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    private DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}