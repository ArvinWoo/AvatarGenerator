import org.opencv.core.Core;

public class Main {
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	// main
	public static void main(String[] args) {
		GithubAvatarGenerator githubAvatarGenerator = new GithubAvatarGenerator();
		for (int i = 100; i <= 150; i++) {
			githubAvatarGenerator.getARandomAvatar("img\\"+ String.valueOf(i) + ".jpg");
		}
	}
}
