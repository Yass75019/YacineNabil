package Puissance4;

public class Puissance {

	public static int nblignes = 4;
	static char [][] puissance ;
public static void puiss(){
	

puissance = new char [nblignes][];
for(int i=0; i< nblignes; i++)
puissance[i] = new char[nblignes];
}


public static void main(String[] args) {
	
	puiss();
	for (int i=0; i<nblignes; i++)
	{
		for(int j=0; j<nblignes; j++){
			puissance[i][j]='A';
		
			System.out.print(puissance[i][j]+""); //sans le ln
		}
		System.out.println(); //avec le ln
	}

}

}
