package com.Zerpyhis.Crypiton.model;

import com.Zerpyhis.Crypiton.transacao.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCartao extends JpaRepository<Cartao,Long> {
}
