package sample;

public class BewerkingDeel implements Bewerking
{
	@Override
	public int bereken(int getal1, int getal2)
	{
		return getal1 / getal2;
	}
}
