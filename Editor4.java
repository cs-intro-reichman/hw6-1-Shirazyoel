import java.awt.Color;

public class Editor4 {

	public static void main (String[] args) {
		String FileName = args[0];
		int n = Integer.parseInt(args[2]);
		Color[][] sourceImage = Runigram.read(FileName);
		Color[][] Grey = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, Grey, n);
	}
}
