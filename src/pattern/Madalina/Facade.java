package pattern.Madalina;

import edu.Madalina.Firma_televiziune;

public class Facade {
	Firma_televiziune firma = Firma_televiziune.getInstance();

	public void startAplicatie() {
		firma.read_json();
    }

}
