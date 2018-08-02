package com.malay.stockaggregator.aggregatorsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.malay.stockaggregator.aggregators.MinAggregator;

public class MinAggregatorTest {

	MinAggregator minAgg = new MinAggregator();

	@Test
	public void calculateTest() {

		minAgg.add(1.2);
		minAgg.add(2.5);
		minAgg.add(3.5);

		assertEquals(1.2, minAgg.calculate(), 0);

	}

}
