package com.malay.stockaggregator.client;

import java.io.IOException;

import com.malay.stockaggregator.aggregators.*;


public class AggregatorApp {

	public static void main(String[] args) throws IOException {

		/**
		 * You'll need to uncomment the below code. You'll notice it does not compile!
		 * 
		 * There are 2 objectives in this assignment.
		 * 
		 * 1). Make sure the code compiles correctly after you uncomment it below. 2).
		 * Make sure it runs as explained in the assignment video!
		 * 
		 * -->> YOUR WORK SHOULD BE DONE IN THE AggregatorProcessor CLASS.
		 **/

		MinAggregator agg = new MinAggregator();
		AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<MinAggregator>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(1);
		System.out.println(value);

		// MaxAggregator maxagg = new MaxAggregator();
		// AggregatorProcessor<MaxAggregator> maxAggsProcessor = new
		// AggregatorProcessor<MaxAggregator>(maxagg, "table.csv");
		// double value1 = maxAggsProcessor.runAggregator(1);
		// System.out.println(value1);
		//
		// MeanAggregator meanAgg = new MeanAggregator();
		// AggregatorProcessor<MeanAggregator> meanAggsProcessor = new
		// AggregatorProcessor<MeanAggregator>(meanAgg, "table.csv");
		// double value2 = meanAggsProcessor.runAggregator(1);
		// System.out.println(value2);
		//

	}

}
