package net.bounceme.chronos.springbatch.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Employee implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4295163387144838851L;

	private String name;

    private String lastName;

    private int age;
}
