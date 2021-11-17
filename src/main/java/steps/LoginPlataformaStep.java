package steps;

import org.junit.Assert;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginPlataformaStep extends BasePage {
	

	

	@Dado("^que eu esteja na tela de Login da Plataforma$")
	public void que_eu_esteja_na_tela_de_Login_da_Plataforma() throws Exception {
		abrirUrl("https://account.blip.ai/login");
		Thread.sleep(4000);
	}


	@Quando("^insiro um email inválido no formulário$")
	public void insiro_um_email_inválido_no_formulário() throws Exception {
		
		escrever("email", "Teste");
	

	}


	
	@Entao("^deve ser apresentado a mensagem abaixo do campo \"([^\"]*)\"$")
	public void deve_ser_apresentado_a_mensagem_abaixo_do_campo(String mensagem) throws Exception {
		Assert.assertEquals(mensagem, validarTexto("//div[contains(text(),'Deve ser um e-mail válido')]"));
	//	fecharBrowser();
	}


	


	@Quando("^insiro uma senha incompleta$")
	public void insiro_uma_senha_incompleta() throws Exception {
		
		escrever("password", "123");

	}



	
	@Entao("^deve ser apresentado \"([^\"]*)\" informando a senha incompleta$")
	public void deve_ser_apresentado_informando_a_senha_incompleta(String mensagem) throws Exception {

		Assert.assertEquals(mensagem, validarTexto("//div[@class='error bp-fs-7 mb2 bp-c-warning']"));
	}

	

}
