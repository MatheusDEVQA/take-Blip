package pageobjects;

import elementos.Elementos;
import metodos.Metodos;

public class LoginGoogle {
	Elementos el = new Elementos();
	Metodos me = new Metodos();

	public void testeLoginGoogle() {

		me.clicar(el.getGoogle());

	}

}
