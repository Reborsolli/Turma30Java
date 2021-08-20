CREATE DATABASE db_generation_game_online;
use db_generation_game_online;

 CREATE TABLE tb_classe(
 id_jogo int not null,
 nome_jogo varchar(30),
 fabricante varchar(20),
primary key (id_jogo)) engine=InnoDB;

 CREATE TABLE tb_personagem(
 id_personagem int (5) not null ,
 nome_personagem varchar(20) not null, 
 nivel_ataque int,
 nivel_defesa int,
 id_jogo int not null ,
 classe_personagem varchar (20),
 foreign key ( id_jogo)  references tb_classe  ( id_jogo),
 primary key (id_personagem )) engine = InnoDB;


INSERT INTO tb_classe ( id_jogo , nome_jogo, fabricante )
values ( 123 , 'Mario Bros', "Nintendo") , ( 124 , 'SONIC' , "Nintendo") ,
 (125 , "Donkey Kong " , " Nintendo "), (126 , "Bomberman" , "Nintendo") ,
 ( 127 , "Street Fighr" , "Nintendo");

INSERT INTO tb_personagem ( id_personagem , nome_personagem ,
 nivel_ataque , nivel_defesa , id_jogo, classe_personagem)
 values (111," Mario" , 2000, 2000 , 123 , "Aventura") , (222," Luigi" , 2000, 2000 , 123 , "Aventura"),
 (333," Donkey Kong" , 2500, 1000 , 125 , "Aventura") , ( 444 , "Bomberman" , 500, 500, 126 , "Aventura"),
 (555 , " Ryu " , 1000,  1000 , 127 , "Luta" ) , (666 , " Chun-li " , 1300,  2000 , 127 , "Luta" ) ,
 (777 , " Ken " , 500,  1000 , 127 , "Luta" ) , ( 888 , "Sagat" , 1000, 1500, 127 , " Luta");
 
select *from tb_personagem;
select *from tb_personagem where  nivel_ataque > 2000;
select *from tb_personagem where nivel_defesa  >=1000  <= 2000;
select *from tb_personagem where nome_personagem like '%C%';
select *from tb_personagem
inner join tb_classe on tb_classe.id_jogo = tb_personagem.id_jogo;
select *from tb_personagem
left join tb_classe on tb_classe.id_jogo = tb_personagem.id_jogo;
select *from tb_personagem
right join tb_classe on tb_classe.id_jogo = tb_personagem.id_jogo;
select *from tb_personagem where classe_personagem = "Aventura" ; 
   
  
  