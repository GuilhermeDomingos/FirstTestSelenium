package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class informacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp(){

        //Abrindo o navegador
        System.setProperty("webdriver.chrome.diver","/home/guilherme/Documentos/driver/chromedriver");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //Navegando para a pagina do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");
    }
    @Test
    public void testAdicionarInformacaoUsuario(){

        //Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        //Identificando o formulario de login
        WebElement formularioSignBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que esta dentro do formulario de id "signinbox" e texto "julio0001"
        formularioSignBox.findElement(By.name("login")).sendKeys("julio0001");

        //Difitar no campo com name "password" que esta dentro do formulario de if "signinbox" e texto "123456"
        formularioSignBox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link com o texto "SING IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Clicar em um link que possui a class "me"
        navegador.findElement(By.className("me")).click();

        //Clicar em um link que possui um text "moredataaboutyou
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        //Clicar no botao atraves do seu Xpath
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        //Identificar a popup onde esta o formulario de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        //No campo de name "type" escolher a opcao "Phone"
        WebElement campoType = popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText("Phone");

        // No campo de name "contact" digitar "+559999999"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("+55999999999");

        //Clicar no Link de text "SAVE" qie esta na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        //Na mensagem de id "toast-container" validar que o texto "Your contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();

        assertEquals("Your contact has been added!", mensagem);
    }

    @After
    public void tearDown(){
        //Fechar o navegador
        navegador.quit();
    }

}
