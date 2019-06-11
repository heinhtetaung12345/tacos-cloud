package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
	private  String id;
	private  String name;
	private  Type type;
	
	public static enum Type{
		WRAP,PROTEIN,VEGIES,CHEESE,SAUCE
	}

}
