package br.com.modeloArquitetura.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TA_FUNCIONARIO")
@PrimaryKeyJoinColumn(name="ID_PESSOA", referencedColumnName="ID_PESSOA")
public class Funcionario extends Pessoa{

	@Column(name="SALARIO")
	private Double salario;
	@Column(name="DATA_ADMISSAO")
	private Date dataAdmissao;	
	@ManyToOne
	private Departamento departamento;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	
}
