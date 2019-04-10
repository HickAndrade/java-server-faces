import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	private int codigo;
	private String item;
	private int qtd;
	private String pagamento;

	
	public void Carrinho() {
		
	}
	
	
	
	
	public CarrinhoBean(int codigo,String item, int qtd, String pagamento) {
		super();
		this.codigo = codigo;
		this.item = item;
		this.qtd = qtd;
		this.pagamento = pagamento;
	}

	
	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}




	public CarrinhoBean() {
		super();
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

}
