


public class SalaCinema {
	
	private String film = "";
	private int postiOccupati;
	private int numeroFile;
	final private int maxPerFila;
	private double incasso;
	
	public SalaCinema(String film, int numFile){
		film ="The Avengers";
		numFile = numeroFile;
		postiOccupati = 0;	
		incasso = 0;
		maxPerFila = 24;
		
	}
	public int getPostiLiberi( int numFile, int maxPerFila){
		return numFile * maxPerFila - postiOccupati;
		
		
	}
	public void venditaBiglietti(int postiDaOccupare, String tipo){
		int postiDaOccupare = postiLiberi - postiOccupati;
		
		
	}
	
	

}
