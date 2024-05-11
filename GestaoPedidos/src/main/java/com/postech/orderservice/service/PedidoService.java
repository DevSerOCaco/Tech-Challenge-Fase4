package com.postech.orderservice.service;

import com.postech.orderservice.entities.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> listarPedidos();

    Pedido buscarPedidoPorId(Long id);

    Pedido criarPedido(Pedido pedido);

    Pedido atualizarPedido(Long id, Pedido pedidoNovo);

    void deletarPedido(Long id);

}
