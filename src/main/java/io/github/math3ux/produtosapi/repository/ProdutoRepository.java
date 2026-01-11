package io.github.math3ux.produtosapi.repository;

import io.github.math3ux.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
