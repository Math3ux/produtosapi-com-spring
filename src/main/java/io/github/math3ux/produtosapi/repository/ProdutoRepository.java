package io.github.math3ux.produtosapi.repository;

import io.github.math3ux.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
