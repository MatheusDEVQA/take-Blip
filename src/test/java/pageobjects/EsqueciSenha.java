package pageobjects;

import elementos.Elementos;
import metodos.Metodos;

public class EsqueciSenha {
	Elementos el = new Elementos();
	Metodos me = new Metodos();
	
	public void testeEsqueciSenha() {
		me.clicar(el.getEsqueceuSenha());
		me.escrever(el.getEmail(), "marilu@gmil.com");
		me.clicar(el.getButtonEnviar());
	}
	
}
