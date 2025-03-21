package simple_instrumento.servise;


public class InstrumentoSimple {

	 private static InstrumentoSimple instance;
	    private String intrumento;

	    private InstrumentoSimple() {
	        this.intrumento = "Sin intrumento"; 
	    }

	    public static InstrumentoSimple getInstance() {
	        if (instance == null) {
	            instance = new InstrumentoSimple();
	        }
	        return instance;
	    }

	    public String getInstrumento() {
	        return intrumento;
	    }

	    public void setInstrumento(String nuevoIntrumento) {
	        this.intrumento = nuevoIntrumento;
	    }
}
