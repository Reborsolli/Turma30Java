CREATE DATABASE db_cursoDaMinhaVida ;
use db_cursoDaMinhaVida ;
create table tb_categoria (
id_categoria bigint(20),
 Tipo varchar(20),

PRIMARY KEY (id_categoria)
);

create table tb_produto (
id_curso bigint (20),
curso varchar(20),
preco decimal (5,2),
id_categoria bigint (20),

 foreign key (id_categoria)  references tb_categoria  ( id_categoria),
 primary key (curso)) engine = InnoDB;
 
 insert into tb_categoria ( id_categoria , tipo) 
 values (001 ," Informatica " ) , (002 ," Linguas " ),(003 ," Arte " ),
 (004 ," Dança " ),(005 ,"Luta" );
 
 insert into tb_produto ( id_curso , curso , preco , id_categoria)
 values (111, "Java", 150.00 , 001) , (222, "Git ", 55.00 ,  001),
  (333, "Frances", 125.00 , 002), (444, "Ingles" , 75.00 ,  002),
  ( 555 , " Dança Ventre" , 10.00 ,  004) , (666 , " Pintura " , 10.00 ,  003 ),
  (777, "BOXES" , 75.00 ,  005) , ( 888 , "Origani" , 20.00 , 003);
  
  select * from tb_produto where  preco >55 ;

select* from tb_produto where preco >= 3  <= 60 ;

 select * from tb_produto where curso LIKE '%J%';

select * from tb_produto
Inner join tb_categoria on tb_produto.id_categoria = tb_categoria.id_categoria;

select * from tb_produto  where id_categoria like 001 ;
 
