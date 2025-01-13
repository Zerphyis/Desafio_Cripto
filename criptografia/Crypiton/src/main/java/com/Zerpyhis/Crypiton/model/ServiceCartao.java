package com.Zerpyhis.Crypiton.model;

import com.Zerpyhis.Crypiton.transacao.Cartao;
import com.Zerpyhis.Crypiton.transacao.DadosCartao;
import com.Zerpyhis.Crypiton.tratamento.TransationException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ServiceCartao {
    @Autowired
    RepositoryCartao repository;

    @Transactional
     public ResponseEntity adicionarCartao( DadosCartao dados){
         var novoCartao=new Cartao(dados);
         repository.save(novoCartao);
         return ResponseEntity.ok(novoCartao);
     }

    @Transactional
     public ResponseEntity autalizarCartao( Long id , DadosCartao dados){
         var verificarId=repository.findById(id);

         if (verificarId.isEmpty()) {
             throw new TransationException("Não foi possível encontrar o usuário");
         }

         Cartao cartaoAutalizado = verificarId.get();
         if (dados.userDocument() != null) {
             cartaoAutalizado.setUserDocument(dados.userDocument());
         }
         if (dados.creditCardToken() != null) {
             cartaoAutalizado.setCreditCardToken(dados.creditCardToken());
         }
         if (dados.values() != null) {
             cartaoAutalizado.setValues(dados.values());
         }
         repository.save(cartaoAutalizado);
         return ResponseEntity.ok(cartaoAutalizado);
     }

    @Transactional
     public ResponseEntity deletarCartao(Long id){
         var verificar= repository.findById(id);
         if (verificar.isEmpty()) {
             throw new TransationException("Não foi possível encontrar o usuário pelo id");
         }
         repository.deleteById(id);

         return ResponseEntity.noContent().build();
     }

     @Transactional
     public ResponseEntity listarCartao() {
         var cartaos = repository.findAll();
         return ResponseEntity.ok(cartaos);
     }



}



