/**
 * 
 */
package br.com.jrodrigues.ProjetoSpringEbac.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 */
@Entity
@Table(name = "TB_GAMES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Games {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
	private Long id;
	@Column(name = "gender", nullable = false, length = 50)
	private String gender;
	@Column(name = "tittle", nullable = false, length = 50)
	private String tittle;
	@Column(name = "price", nullable = false)
	private Double price;
	
	
}
