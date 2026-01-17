package io.github.math3ux.produtosapi.controller;

import io.github.math3ux.produtosapi.model.Produto;
import io.github.math3ux.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody final Produto produto){

        System.out.println("Produto salvo: " + produto);

        String id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterProdutoPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }
}
