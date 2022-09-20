package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	private String login;
	private String senha;
	private boolean termo;

	public LoginBean(String login, String senha, boolean termo) {
		super();
		this.login = login;
		this.senha = senha;
		this.termo = termo;
	}

	public LoginBean() {
		super();
	}

	public void logar() {
		if ("HenriqueAndrade".equals(getLogin()) && "Cuzinho".equals(getSenha())) {
			System.out.println("Usuario logado: " + getLogin() + " bem vindo seu arrombadinho! ");
		System.out.println(isTermo());
		}else {
			System.out.println("Usuario com senha incorreta");
	}}

	
	
	public boolean isTermo() {
		return termo;
	}

	public void setTermo(boolean termo) {
		this.termo = termo;
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