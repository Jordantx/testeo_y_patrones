package simple_instrumento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simple_instrumento.servise.InstrumentoSimple;

@RestController
@RequestMapping("/instrumento")
public class InstrumentoController {

	 @GetMapping
	    public String getInstrumento() {
	        return "Instrumento actual: " + InstrumentoSimple.getInstance().getInstrumento();
	    }

	    @PostMapping("/{nuevoInstrumento}")
	    public String setInstrumento(@PathVariable String nuevoInstrumento) {
	    	InstrumentoSimple.getInstance().setInstrumento(nuevoInstrumento);
	        return "Nuevo Instrumento asignado: " + nuevoInstrumento;
	    }
}
