package edu.kis.vh.nursery;

public class HanoiRyhmer extends DefaultCountingOutRyhmer {

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

	int getTotalRejected() {
		return totalRejected;
	}
}