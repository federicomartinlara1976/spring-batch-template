package net.bounceme.chronos.springbatch.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4360575066388340280L;
	
	private String id;
	private String name;
	private String description;
	private BigDecimal price;

}
