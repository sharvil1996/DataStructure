import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import javax.naming.directory.SearchControls;

public class VectorClass {
	public static void main(String[] args) throws IOException {

		Hashtable<String, ZuneballDetails> hashtable = new Hashtable<String, ZuneballDetails>();

		BufferedReader br = new BufferedReader(new FileReader("d:\\temp1.txt"));

		String contentLine = br.readLine();
		while (contentLine != null) {

			String temp[] = contentLine.split("~");
			ZuneballDetails details = new ZuneballDetails();
			details.setSongName(temp[0]);
			details.setMovieName(temp[1]);
			details.setSingerName(temp[2]);
			details.setSongDuration(temp[3]);
			details.setImageName(temp[4]);
			details.setImageDestination(temp[5]);
			hashtable.put(temp[0], details);
			contentLine = br.readLine();
		}
		new VectorClass().search(hashtable);

	}

	public void search(Hashtable<String, ZuneballDetails> hashtable) {
		for (Map.Entry m : hashtable.entrySet()) {
			String songName = (String) m.getKey();
			ZuneballDetails objSongs = (ZuneballDetails) m.getValue();
			if (songName.contains("er") || objSongs.getMovieName().contains("k")
					|| objSongs.getSingerName().contains("Ranjivini")) {
				System.out.println(songName);
				System.out.println(objSongs.getMovieName());
				System.out.println(objSongs.getSingerName());
				System.out.println();
			}
		}

	}
}
