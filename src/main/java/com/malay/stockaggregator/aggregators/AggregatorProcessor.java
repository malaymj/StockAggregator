package com.malay.stockaggregator.aggregators;

import java.io.IOException;
import com.malay.stockaggregator.fileprocessors.*;

public class AggregatorProcessor<T extends Aggregator> {

	T agg;
	com.malay.stockaggregator.fileprocessors.StockFileReader sr;

	public AggregatorProcessor(T agg, String filepath) {

		this.agg = agg;
		sr = new StockFileReader(filepath);
	}

	public double runAggregator(int column) throws IOException {

		int numOfLines = sr.getNumofDataLines();

		for (int i = 1; i <= numOfLines; i++) {
			Double val = sr.getColumnValue(i, column);
			agg.add(val);
		}
		return agg.calculate();

	}

}
