import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Data {
	private final double[][][] data;
	private final int cSize = 10, lSize = 8, max = 2000;

	public Data(){
		Path path = Paths.get("AllData.txt");
		List<String>str;

		try {
			str = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		data = new double[cSize][lSize][max];
		for (String s : str) {
			String[] tmp = s.split(",");
			data[Integer.parseInt(tmp[0])][Integer.parseInt(tmp[1])][Integer.parseInt(tmp[2])] = Double.parseDouble(tmp[3]);
		}
	}

	public double search(int c, int l, int num){
		if (c < 0 || c >= cSize || l < 0 || l >= lSize || num < 0 || num >= max) {
			return Double.NaN;
		}
		return data[c][l][num];
	}
}
