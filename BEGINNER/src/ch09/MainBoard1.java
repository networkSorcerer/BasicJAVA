package ch09;

public class MainBoard1 {
	public static void main(String []args) {
		Player player = new Player();
		player.play(1);
		
		AdvencedLevel aLevel = new AdvancedLevel( ) :
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SupperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
