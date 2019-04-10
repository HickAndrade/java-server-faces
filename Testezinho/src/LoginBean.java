import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;
	
	public void logar() {
		if ("Hick".equals(getLogin()) && "1234".equals(getSenha())) {
			System.out.println("Bem vindo caralhudo: " + getLogin());
			
		}else {
			System.out.println("Usuario não altorizado");
		}
		
		System.out.println("CheckBox Conectado: " + termo);
		
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
