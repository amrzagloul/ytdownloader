package dentex.youtube.downloader;

import android.content.SharedPreferences;

public class AudioExtr {
	SharedPreferences settings = SettingsActivity.settings;
	String PREFS_NAME = SettingsActivity.PREFS_NAME;
	static String enc;
	
	static String ffmpegPaste() {
		String inputFile = ShareActivity.path.getPath();
		if (ShareActivity.extrType.equals("strip")) {
			enc = "-acodec copy";
		} else {
			enc = "mp3... TODO";
		}
		String outputFile = ShareActivity.composedAudioFilename;
		return "-i " + inputFile + "-vn " + enc + " " + outputFile;
	}
	
}