package br.alexbispo.templatevarpator.exemplo.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class ExemploController {

	@Inject
	private Result result;

	@Path("/")
	public void hello() {

		result.include("mensagem", "Parabésns você conseguiu!");
	}

}
