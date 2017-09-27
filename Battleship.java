public class Battleship{
	int players;
	int StartTime;
	int EndTime;
	Set<Player> players;

	Game(Set<Player> players) throws Exception{
		if(players.size() < MIN_SIZE || players.siz() > MAX_SIZE)
			throw new Exception();
		this.players = players;
	}
	void removePlaer(Player p) throw Exeption {
		if (players.size() - 1 < MIN_SIZE)
			throw new Exception();
		players.remove(p);
	}
	void addPlayer (Player p) throws Exception{
		if (players.size() +1 > MAX_SIZE)
			throw new Exception();
		players.remove(p);
	}
	void listPlayers(){
		if(players.size() -1 < MIN_SIZE)
			throw new Exception();
		players.list();
		
	}

	// Initialiaze game
	public void StartGame(){
	// will ask for the number of players
	}
	public Player getPlayers(int typeOfGame){
	//will intake the number of players
	}
	public Ship getMap(){
	//will create maps
	}	
	public void PlayGame(Player p){
	// starts game with players
	}
	public boolean checkWinner(Player p){
	// checks map if they have any ships left
	}

		
}
