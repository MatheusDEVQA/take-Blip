package Runner;

import static org.junit.Assert.*;

import org.junit.Test;

import metodos.Metodos;
import pageobjects.EsqueciSenha;
import pageobjects.LoginGoogle;

public class Tests {
	LoginGoogle lgn = new LoginGoogle();
	EsqueciSenha esq = new EsqueciSenha();
	Metodos me = new Metodos();

	@Test
	public void testLoginGoogle() {
		me.acessarSistema(
				"https://account.blip.ai/login?returnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dblip-portal%26redirect_uri%3Dhttps%253A%252F%252Fportal.blip.ai%252Fauthorize%26response_type%3Did_token%2520token%26scope%3Doffline_access%2520openid%2520profile%2520email%2520api-msging-hub.full_access%26state%3D78bd3e1c334945f9a9e050d3d7b63ec4%26nonce%3D6452da4ad6fc44079d69a135e7e4c3e2");
		lgn.testeLoginGoogle();

	}

	@Test
	public void testEsqueciSenha() {
		me.acessarSistema(
				"https://account.blip.ai/login?returnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dblip-portal%26redirect_uri%3Dhttps%253A%252F%252Fportal.blip.ai%252Fauthorize%26response_type%3Did_token%2520token%26scope%3Doffline_access%2520openid%2520profile%2520email%2520api-msging-hub.full_access%26state%3D78bd3e1c334945f9a9e050d3d7b63ec4%26nonce%3D6452da4ad6fc44079d69a135e7e4c3e2");
		esq.testeEsqueciSenha();
	}

}
