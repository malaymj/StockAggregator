package com.malay.stockaggregator.aggregatorsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.malay.stockaggregator.aggregators.MeanAggregator;


	public class MeanAggregatorTest {
		MeanAggregator meanAgg = new MeanAggregator();

		@Test
		public void calculateTest() {
			
			meanAgg.add(1.0);
			meanAgg.add(2.0);
			meanAgg.add(3.0);
		
			assertEquals(2.0, meanAgg.calculate(),0);
			
			
			
		}
	}

