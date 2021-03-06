package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ITEM_CARRINHO")
@SequenceGenerator(name = "item", sequenceName = "SQ_T_ITEM_CARRINHO", allocationSize = 1)
public class ItemCarrinho {

	@Id
	@Column(name = "cd_item")
	@GeneratedValue(generator = "item", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@ManyToOne
	@JoinColumn(name = "cd_carrinho")
	private CarrinhoCompras carrinho;
	
	@ManyToOne
	@JoinColumn(name="cd_produto")
	private Produto produto;

	@Column(name = "nr_itens")
	private int quantidade;

	@Column(name = "vl_item")
	private double valor;

}
