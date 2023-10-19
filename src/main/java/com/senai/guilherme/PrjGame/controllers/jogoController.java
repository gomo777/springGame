package com.senai.guilherme.PrjGame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.guilherme.PrjGame.entities.Jogo;
import com.senai.guilherme.PrjGame.servicies.jogoService;

@RestController
@RequestMapping("/jogos")
public class jogoController {
private final jogoService jogoService;
	
	@Autowired
	public jogoController(jogoService JogoService) {
		this.jogoService = JogoService ;
	}
	
	@PostMapping
	public Jogo createProduct(@RequestBody Jogo Jogo ) {
		//return produtoService.saveProduto(produto);
		return jogoService.SaveJogo(Jogo);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Jogo> getJogo(@PathVariable Long id) {
		Jogo jogo = jogoService.getJogoByid(id);
		if(jogo != null) {
			return ResponseEntity.ok(jogo);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/home")
	public String paginaInicial() {
		return "index" ; // nome do seu arquivo HTML , (sem a extensão)
	}
	
	@GetMapping
	public List<Jogo> getAllJogo(){
		return jogoService.getAllJogo();
	}
	@DeleteMapping("/{id}")
	public void deleteJogo(@PathVariable Long id) {
		jogoService.deleteJogo(id);
	}
	
}
