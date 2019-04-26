import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;

	public String logar() {
		if ("Hick".equals(getLogin()) && "1234".equals(getSenha())) {
			System.out.println("Bem vindo caralhudo: " + getLogin());
			return "cadastro?faces-redirect=true";
			
		} else {
			System.out.println("Usuario não altorizado");
			FacesMessage mensagem = new FacesMessage("Usuario invalido!");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
			
			FacesMessage mensagem2 = new FacesMessage("senha invalido!");
			FacesContext.getCurrentInstance().addMessage(null, mensagem2);
			return "login";
		}
	}

	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
	}

	public LoginBean() {
		super();
	}

	public LoginBean(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
