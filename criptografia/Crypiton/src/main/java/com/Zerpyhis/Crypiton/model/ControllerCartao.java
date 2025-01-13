package com.Zerpyhis.Crypiton.model;

import com.Zerpyhis.Crypiton.transacao.Cartao;
import com.Zerpyhis.Crypiton.transacao.DadosCartao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class ControllerCartao {

    @Autowired
    ServiceCartao service;

    @PostMapping("/adicionar")
    public ResponseEntity<Cartao> adicionarUsuario(@RequestBody DadosCartao dadosCartao) {
        return service.adicionarCartao(dadosCartao);
    }


    @PutMapping("/atulizar/{id}")
    public ResponseEntity<Cartao> atualizarUsuario(@PathVariable Long id, @RequestBody DadosCartao dadosCartao) {
        return service.autalizarCartao(id, dadosCartao);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id) {
        return service.deletarCartao(id);
    }


    @GetMapping("/buscar")
    public ResponseEntity<List<Cartao>> listarUsuarios() {
        return service.listarCartao();
    }
}
