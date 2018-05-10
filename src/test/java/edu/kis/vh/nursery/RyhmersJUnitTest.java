package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RyhmersJUnitTest {

    @Test
    public void testCountIn() {
        defaultCountingOutRyhmer ryhmer = new defaultCountingOutRyhmer();
        int testValue = 4;
        ryhmer.countIn(testValue);

        int result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        defaultCountingOutRyhmer ryhmer = new defaultCountingOutRyhmer();
        boolean result = ryhmer.callCheck();
        Assert.assertEquals(true, result);

        ryhmer.countIn(888);

        result = ryhmer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        defaultCountingOutRyhmer ryhmer = new defaultCountingOutRyhmer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = ryhmer.isFull();
            Assert.assertEquals(false, result);
            ryhmer.countIn(888);
        }

        boolean result = ryhmer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        defaultCountingOutRyhmer ryhmer = new defaultCountingOutRyhmer();
        final int EMPTY_STACK_VALUE = -1;

        int result = ryhmer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        ryhmer.countIn(testValue);

        result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = ryhmer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        defaultCountingOutRyhmer ryhmer = new defaultCountingOutRyhmer();
        final int EMPTY_STACK_VALUE = -1;

        int result = ryhmer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        ryhmer.countIn(testValue);

        result = ryhmer.countOut();
        Assert.assertEquals(testValue, result);
        result = ryhmer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
