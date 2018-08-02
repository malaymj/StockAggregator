package com.malay.stockaggregator.aggregatorsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.malay.stockaggregator.aggregators.*;


public class MaxAggregatorTest {
	MaxAggregator maxAgg = new MaxAggregator();

	@Test
	public void calculateTest() {
		
		maxAgg.add(1.0);
		maxAgg.add(2.1);
		maxAgg.add(3.4);
		
		assertEquals(3.4, maxAgg.calculate(),0);
		
		
		
	}
}
