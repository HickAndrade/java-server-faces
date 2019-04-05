package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {
	private List<String> listaSelecionados;
	private List<String> listaSelecionados1;

	public void cadastrar() {
		for (String u : listaSelecionados1) {
			System.out.println(u);
			System.out.println("----");
		}
		for (String i : listaSelecionados) {
			System.out.println(i);
		}
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario>  usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Joao Wick", 1));
		usuarios.add(new Usuario("Erick Sonny", 2));
		usuarios.add(new Usuario("Sadia Perdigão", 3));
		return usuarios;
	}
	
	
	
	public List<String> getListaSelecionados1() {
		return listaSelecionados1;
	}

	public void setListaSelecionados1(List<String> listaSelecionados1) {
		this.listaSelecionados1 = listaSelecionados1;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	public CadastroBean(List<String> listaSelecionados) {
		super();
		this.listaSelecionados = listaSelecionados;
	}

	public CadastroBean() {
		super();
	}

	
	
}
