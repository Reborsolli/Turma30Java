CREATE DATABASE db_cidade_das_carnes2 ;
use db_cidade_das_carnes2 ;
create table tb_categoria (
id_categoria bigint(20),
 Tipo varchar(20),

PRIMARY KEY (id_categoria)
);

create table tb_produto (
id_carne bigint (20),
carne  varchar(20),
preco decimal (5,2),
id_categoria bigint (20),

 foreign key (id_categoria)  references tb_categoria  ( id_categoria),
 primary key (carne)) engine = InnoDB;
 
 insert into tb_categoria ( id_categoria , tipo) 
 values (001 ," Vaca" ) , (002 ," Porco " ),(003 ," Peixe" ),
 (004 ," Embutido" ),(005 ,"Vegana " );
 
 insert into tb_produto ( id_carne , carne , preco , id_categoria)
 values (111, "Musculo", 35.00 , 001) , (222, "Contrafile", 55.00 ,  001),
  (333, "Bisteca", 25.00 , 002), (444, "Cacão" , 45.00 ,  003),
  ( 555 , " Sardinha" , 10.00 ,  004) , (666 , "Soja " , 10.00 ,  005 ),
  (777, "Camarao" , 75.00 ,  005) , ( 888 , "Linguiça" , 20.00 , 004);
  
  select * from tb_produto where  preco >55 ;

select* from tb_produto where preco >= 3  <= 60 ;

 select * from tb_produto where sabor LIKE '%C%';

select * from tb_produto
Inner join tb_categoria on tb_pizza.id_categoria = tb_categoria.id_categoria;

select * from tb_produto  where id_categoria like 001 ;
 
