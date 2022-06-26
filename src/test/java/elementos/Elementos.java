package elementos;

import org.openqa.selenium.By;

public class Elementos {
private By google = By.id("blip-login-with-google");
private By esqueceuSenha = By.id("login-forgot-password");
private By email = By.id("Email");
private By buttonEnviar = By.id("submitButton");
public By getGoogle() {
	return google;
}
public By getEsqueceuSenha() {
	return esqueceuSenha;
}
public By getEmail() {
	return email;
}
public By getButtonEnviar() {
	return buttonEnviar;
}
}