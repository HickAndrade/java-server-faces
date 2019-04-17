import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	private List<String> listaSelecionados;
	private String quantidade;
	private String pagamento;
	
	
	public List<Forma> getFormasPagamento(){
		List<Forma> formas = new ArrayList<Forma>();		
		formas.add(new Forma(1, "Credito"));
		formas.add(new Forma(2, "Debito"));
		formas.add(new Forma(3, "Dinheiro"));
		return formas;	
	}
	
	public void Comprar() {
		for (String valor : listaSelecionados) {
			System.out.println(valor);
		}
	
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Forma Pagamento: "+ getPagamento());
	}

	public List<Produto> getProduto() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "Dell"));
		produtos.add(new Produto(2, "Iphone"));
		produtos.add(new Produto(3, "Samsung"));
		return produtos;
	}

	
	
	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> listaSelecionados, String quantidade, String pagamento) {
		super();
		this.listaSelecionados = listaSelecionados;
		this.quantidade = quantidade;
		this.pagamento = pagamento;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
