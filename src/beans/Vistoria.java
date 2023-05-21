package beans;

public class Vistoria {
	private int idVistoria;
	private String cpf;
	private String dataVistoria;
	private String descricao;
	private String statusVistoria;
	
	
	public Vistoria(String cpf, String dataVistoria, String descricao, String statusVistoria) {
		this.cpf = cpf;
		this.dataVistoria = dataVistoria;
		this.descricao = descricao;
		this.statusVistoria = statusVistoria;
	}
	
	public String resultadoVistoria() {
		switch (statusVistoria) {
			case "Reprovado": {
				return "Vistoria reprovada";
			}
			case "Aprovada": {
				return "Vistoria Aprovada";
			}
			case "Erro": {
				return "Ocorreu um erro na vistoria, tente novamente!";
			}
			default: {
				return "Vistoria em análise";
			}
		}
	}
	
	public String relatorioVistoria() {
		return String.format("Relatorio da vistoria - Cpf do usuario: %s, Data: %s, Descricao: %s, Resultado: %s", 
				this.cpf, 
				this.dataVistoria,
				this.descricao,
				this.resultadoVistoria()
				);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdVistoria() {
		return idVistoria;
	}
	
	public void setIdVistoria(int idVistoria) {
		this.idVistoria = idVistoria;
	}
	
	public String getDataVistoria() {
		return dataVistoria;
	}
	
	public void setDataVistoria(String dataVistoria) {
		this.dataVistoria = dataVistoria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatusVistoria() {
		return statusVistoria;
	}
	
	public void setStatusVistoria(String statusVistoria) {
		this.statusVistoria = statusVistoria;
	}
	
	
}
