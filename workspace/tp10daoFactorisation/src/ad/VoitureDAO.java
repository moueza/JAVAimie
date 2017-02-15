package ad;

import entites.Parking;
import entites.Voiture;

public class VoitureDAO extends Dao{
	private static Dao instance;
	Voiture getAllVoitures(){
		return null;
		
	}
private VoitureDAO() {
if(instance == null )
	instance = new VoitureDAO();
}
	@Override
	public Dao getInstance() {
		// TODO Auto-generated method stub
		return null;
	};
}
