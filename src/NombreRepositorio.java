
public class NombreRepositorio implements Contenedor{
	 public String names[] = { "Robert", "John", "Julie", "Lora" };

	    @Override
	    public Iterador getIterator() {
	        return new NombreIterador();
	    }

	    private class NombreIterador implements Iterador {

	        int index;

	        @Override
	        public boolean hasNext() {

	            if (index < names.length) {
	                return true;
	            }
	            return false;
	        }

	        @Override
	        public Object next() {

	            if (this.hasNext()) {
	                return names[index++];
	            }
	            return null;
	        }
	    }
	}

