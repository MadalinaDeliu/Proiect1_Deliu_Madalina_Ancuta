package genEmisiune.Madalina;

public class Actiune implements GenEmisiune
{

	@Override
	public String toString() {
		return "Actiune";
	}

	@Override
	public void getEmisiune() {
		System.out.println("Actiune");
	}

}
