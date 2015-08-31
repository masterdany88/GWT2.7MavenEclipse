/**
 * 
 */
package pl.derp.server.entity;

/**
 * @author Korbel Daniel
 *
 */
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;



@Entity
public class Pizza {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private Integer version;
	private String name;
//	private List<Ingredient> ingredients;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public List<Ingredient> getIngredients() {
//		return ingredients;
//	}

//	public void setIngredients(List<Ingredient> ingredients) {
//		this.ingredients = ingredients;
//	}
	public Pizza() {}
	public Pizza(Long id) {
		this.id = id;
	}
}