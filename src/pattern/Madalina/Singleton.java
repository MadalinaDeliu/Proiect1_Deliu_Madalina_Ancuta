package pattern.Madalina;

import edu.Madalina.Firma_televiziune;

public final class Singleton {
    private static Singleton instance;
    private Firma_televiziune firma;

    private Singleton(Firma_televiziune firma) {
        this.setFirma(firma);
    }

    public static Singleton getInstance(Firma_televiziune firma) {
        if (instance == null) {
            instance = new Singleton(firma);
        }
        return instance;
    }

	public Firma_televiziune getFirma() {
		return firma;
	}

	public void setFirma(Firma_televiziune firma) {
		this.firma = firma;
	}
}