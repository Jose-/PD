import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import upm.jbb.IO;


public final class PruebaIterator {
	private PruebaIterator() {
	}

	public static void main(String[] args) {
		Collection<String> lista = new ArrayList<String>();
		lista.add("uno");
		lista.add("");
		lista.add("dos");
		lista.add("tres");
		IO.out.println("--------- for each------------");
		for (String item : lista) {
			IO.out.println(item);
		}
		IO.out.println("--------- Iterator------------");
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if ("".equals(s)) {
				it.remove(); // función opcional
			} else {
				IO.out.println(s);
			}
		}
	}
}