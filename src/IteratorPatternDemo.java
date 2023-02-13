
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NombreRepositorio NombreRepositorio = new NombreRepositorio();

        for (Iterador iter = NombreRepositorio.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
