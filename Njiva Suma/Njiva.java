package domacMart8;

public class Njiva extends Parcela{

	private double prinosKvM;
	
public Njiva(double povrsina, double prinosKvM)	{
	super(povrsina);
	this.prinosKvM=prinosKvM;
	
}
@Override
public double prinos(int godine) {
	return this.getPovrsina()*this.prinosKvM*godine;
}
	
public char getVrsta() {
	return 'N';
}
@Override
public String toString() {
	return super.toString()+":"+this.prinosKvM+".";
}


}
