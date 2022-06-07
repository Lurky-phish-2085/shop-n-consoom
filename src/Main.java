
public class Main {

	public static void main(String[] args) {

		try {
			Game.play();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
