import java.util.ArrayList;
import java.lang.Math;

public class GameEnvironment{
	double width, height;
	ArrayList<GamePlayer> arrPlayer;
	ArrayList<GameEnemies> arrEnemies;
	

	GameEnvironment(){
		arrPlayer = new ArrayList<GamePlayer>();
		arrEnemies = new ArrayList<GameEnemies>();
	}

	GameEnvironment(double width, double height){
		this.width = width;
		this.height = height;
	}

	public void addPlayer(GamePlayer p){
		arrPlayer.add(p);
	}

	public void removePlayer(GamePlayer p){
		arrPlayer.remove(p);
	}

	public void getAllPlayers(){
		System.out.println("All of Player: "+arrPlayer);
	}

	public void addEnemy(GameEnemies e){
		arrEnemies.add(e);
	}

	public void removeEnemy(GameEnemies e){
		arrPlayer.remove(e);
	}

	public void getAllEnemies(){
		System.out.println("All of Player: "+arrEnemies);
	}

	public double EuclideanDistance(int x1, int y1, int x2, int y2) {
    	return Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
	}


	public void Interaction(){
		if (arrPlayer == null || arrEnemies == null) {
			System.out.println("Player or Enemy not sets");
		}

		for (int i=0; i<arrPlayer.size(); i++) {
			for (int j=0; j<arrEnemies.size(); j++) {
				if (arrPlayer.get(i).getY() != arrEnemies.get(j).getY()) {
					System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemies.get(j)+" not in the same Y position");
				}

				if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(),arrEnemies.get(j).getX(), arrEnemies.get(j).getY()) < 2) {
					System.out.println("Player: "+arrPlayer.get(i)+" Attacked");
					System.out.println("Enemiy: "+arrEnemies.get(j)+" loses");
				}else{
					System.out.println("==> Player "+arrPlayer.get(i));
					arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
					System.out.println("Current x position = "+arrPlayer.get(i).getX()+" <===");
				}
			}
		}
	}
}