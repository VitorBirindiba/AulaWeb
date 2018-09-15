import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonnymousInnerClass {

	public void ordenar(List<Frutas> frutas) {
		Collections.sort(frutas,

				new Comparator<Frutas>() {
					public int compare(Frutas fruta2, Frutas fruta1) {
						return fruta1.nome.compareTo(fruta2.nome);

					}

				});
	}


}
