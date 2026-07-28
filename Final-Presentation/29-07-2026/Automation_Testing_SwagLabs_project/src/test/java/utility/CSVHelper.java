package utility;

import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;

public class CSVHelper {
	private CSVReader reader;

	// Constructor
	public CSVHelper(String csvPath) throws IOException {
		reader = new CSVReader(new FileReader(csvPath));
		// Skip Header
		reader.readNext();
	}

	// Read next row
	public String[] getNextRow() throws IOException {
		return reader.readNext();
	}

	// Close CSV file
	public void closeCSV() throws IOException {
		if (reader != null) {
			reader.close();
		}
	}
}