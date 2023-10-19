package com.senai.guilherme.PrjGame.servicies;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.guilherme.PrjGame.entities.Jogo;
import com.senai.guilherme.PrjGame.repository.jogoRepository;

@Service
public class jogoService {
private final jogoRepository JogoRepository;	
	@Autowired
	public jogoService(jogoRepository JogoRepository ) {
		this.JogoRepository = JogoRepository;
	}
	
	public Jogo SaveJogo(Jogo Jogo) {
		return JogoRepository.save(Jogo);
	}
	public List<Jogo> getAllJogo(){
		return JogoRepository.findAll();
	}
	
	public Jogo getJogoByid(Long id) {
		return JogoRepository.findById(id).orElse(null);			
	}
	
	public void deleteJogo(Long id) {
		JogoRepository.deleteById(id);
	}
	
	
}
