package com.malay.stockaggregator.fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {

	String filePath = null;

	public StockFileReader(String filePath) {
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException {
		String line = readFirstLine(filePath);
		String[] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}

	static String readFirstLine(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	/**
	 * Complete the body of this method.
	 * 
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException {
		List<String> lines = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			// skip the first line:
			br.readLine();
			String line = null;
			// populate data from next line onwards
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		}
		return lines;
	}

	public int getNumofDataLines() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			br.readLine();
			int numOfLines = 0;
			while ((br.readLine()) != null) {
				numOfLines++;
			}
			return numOfLines;

		}
	}

	public Double getColumnValue(int rowNum, int columnNum) throws IOException {
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			int itr = 0;
			while ( itr < rowNum) {
				br.readLine();
				itr++;
			}
			
			columnNum--;
			String line = br.readLine();
			String[] rowValues = line.split(",");
			List<String> listOfRowValues = Arrays.asList(rowValues);
			return Double.parseDouble(listOfRowValues.get(columnNum));
		}

	}
}
