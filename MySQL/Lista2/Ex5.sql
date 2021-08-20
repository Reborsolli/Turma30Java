CREATE DATABASE db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

 create table tb_categoria (
id_categoria bigint(10),
 Tipo varchar(20),

PRIMARY KEY (id_categoria)
);

create table tb_produto (
id_material bigint (10),
material varchar(20),
preco decimal (5,2),
id_categoria bigint (20),

 foreign key (id_categoria)  references tb_categoria  ( id_categoria),
 primary key (material)) engine = InnoDB;
 
 insert into tb_categoria ( id_categoria , tipo) 
 values (001 ," Tintas" ) , (002 ," Piso " ),(003 ," Materiais Ele" ),
 (004 ," Materiais hidra " ),(005 ,"Telhas " );
 
 insert into tb_produto ( id_material , material , preco , id_categoria)
 values (111, "TintaSuvinil ", 75.00 , 001) , (222, "PisoPorcelna", 155.00 ,  002),
  (333, "Fio Verde ", 15.00 , 003), (444, "Cano T " , 5.00 ,  004),
  ( 555 , " TelhaIncolor " , 100.00 ,  005) , (666 , "AzulejoBranco " , 50.00 ,  002 ),
  (777, "Cano2m" , 10.00 ,  004) , ( 888 , " Tintax" , 80.00 , 004);
  
  select * from tb_produto where  preco >55 ;

select* from tb_produto where preco  >= 3.00  <= 60.00 ;

 select * from tb_produto where material LIKE '%C%';

select * from tb_produto
Inner join tb_categoria on tb_produto.id_categoria = tb_categoria.id_categoria;

select * from tb_produto  where id_categoria like 002 ;
 
