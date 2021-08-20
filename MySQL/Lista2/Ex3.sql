create database db_farmacia_do_bem6;
use db_farmacia_do_bem6;
create table tb_categoria(  
id_marca bigint (10),
marca varchar (30),
tipo varchar(20),
primary key (id_marca)
);

create table tb_produto ( 
produto_id bigint(10),
medicacao varchar(30),
marca_id bigint (10),
tipo varchar(30),
preco decimal (5,2),
quantidade bigint (10),
foreign key (marca_id)  references tb_categoria ( id_marca),
 primary key (produto_id )
 ) ;
 
 
 insert into tb_categoria( id_marca , marca , tipo )
  values ( 111 , "Ache " , "comprimido ") , (222, "Bayer" , "Comprimido"),
  (333, "Eurofarma" , " Comprimido ") , (444, "EMS" , " Comprimido" ) , (555, "Medley" , "Comprimido ");
  
 insert into tb_produto ( produto_id , medicacao , marca_id , tipo , preco , quantidade )
 values (111, "Paracetamol" , 111 , " Comprimido " , 20.00 , 30) ,
 (222, "Dipirona" , 111 , " Comprimido " , 30.00 , 30),(333, "Amoxiiana" , 111 , " Comprimido " , 51.00 , 30),
 (444, "Sertralina" , 111  , " Comprimido " , 15.00 , 60),(555, "Flouxetina" , 111 , " Comprimido " , 50.00 , 30),
 (666, "Rivotril" ,111 , " Comprimido " , 10.00 , 30),(777, "Loratadina" , 111 , " Comprimido " , 20.00 , 10),
 (888, "Inalapril" , 111 , " Comprimido " , 60.00 , 30);

select * from  tb_produto where preco > 50.00 ;
select * from tb_produto where preco >3 <60 ;
select * from tb_produto where medicacao like  '%B%';
select * from tb_produto
Inner join tb_categoria on tb_produto.produto_id= tb_categoria.id_marca;
select * from tb_produto where marca = "Bayer";
select * from tb_categoria;