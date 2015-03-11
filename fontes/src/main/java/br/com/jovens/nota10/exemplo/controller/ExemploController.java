package br.com.jovens.nota10.exemplo.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class ExemploController {

	@Inject
	private Result result;

	@Get("/hello")
	public void hello() {

		result.include("mensagem", "Parabésns você conseguiu!");
	}

}
