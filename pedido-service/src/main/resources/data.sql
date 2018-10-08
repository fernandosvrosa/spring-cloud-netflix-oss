insert into pedido (id, usuario_id) values (1, 1);

insert into produto (id, descricao, nome, valor)
values  (1, 'Iphone 10 128GB', 'Iphone 10', 8.000);

insert into produto (id, descricao, nome, valor)
values  (2, 'Sansung S9 128GB', 'Sansung S9', 4.000);

insert into produto_pedido(pedido_id, produto_id) values (1, 1);

insert into produto_pedido(pedido_id, produto_id) values (1, 2);