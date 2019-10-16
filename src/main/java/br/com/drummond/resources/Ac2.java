package br.com.drummond.resources;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ac2 {

	@RequestMapping(value = "/api1/{numero}", method = RequestMethod.GET)
	public String Resultado(@PathVariable Integer numero)
	{
		
		String resultado;
		
		
		if (numero % 2 == 0)
	    {
			resultado = "par";
	    }
		else
		{
			resultado = "impar";
		}
		return resultado;
		
	}
}
