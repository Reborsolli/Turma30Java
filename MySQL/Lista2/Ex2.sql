CREATE DATABASE db_pizzaria_legal ;
use db_pizzaria_legal;
create table tb_categoria (
id_categoria bigint(20),
categoria varchar(20),

PRIMARY KEY (id_categoria)
);

create table tb_pizza (
id_sabor bigint(20),
sabor varchar (20),
preco decimal (5,2),
id_categoria bigint(20) ,

 foreign key ( id_categoria)  references tb_categoria  ( id_categoria),
 primary key (id_sabor )) engine = InnoDB;
 
 insert into tb_categoria ( id_categoria , categoria) 
 values (001 ," Salgada" ) , (002 ," Doce " ),(003 ," Vegetariana" ),
 (004 ," Salgada Especial" ),(005 ,"Doce especial " );
 
 insert into tb_pizza ( id_sabor ,sabor , preco  , id_categoria)
 values (111, "Mussarella", 35.00 , 001) , (222, "Calabresa", 35.00 ,  001),
  (333, "Palmito", 45.00 , 003), (444, "Brocolis" , 45.00 ,  003),
  ( 555 , " Carne seca" , 50.00 ,  004) , (666 , " 5 queijos " , 50.00 ,  004 ),
  (777, "Chocolate " , 55.00 ,  002) , ( 888 , "Morango" , 60.00 , 005);
  
  select * from tb_pizza where  preco >45 ;

select* from tb_pizza where preco >= 29  <= 60 ;

 select * from tb_pizza where sabor LIKE '%C%';

select * from tb_pizza 
Inner join tb_categoria on tb_pizza.id_categoria = tb_categoria.id_categoria;

select * from tb_pizza  where id_categoria like 004 ;
 

