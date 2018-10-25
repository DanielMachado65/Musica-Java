create database music_bank;
use music_bank;

create table if not exists TipoMidia(
	id int primary key auto_increment,
    midia varchar(100)
);

create table if not exists Pessoa(
	id int primary key auto_increment,
    nome varchar(50),
    nascimento date,
    homepage varchar(200)
);


create table if not exists Album(
	id int primary key auto_increment,
    titulo varchar(100),
    datalancamento date,
    tempoTotal long,
    generoId int,
    foreign key (generoId) references Genero(id)
);

create table if not exists Participacao(
	id int primary key auto_increment,
    descricao varchar(200)
);

create table if not exists Genero(
	id int primary key auto_increment,
    nome varchar(100)
);

create table if not exists PessoaParcitipacao(
	pessoaId int primary key,
    participacaoId int primary key,
    foreign key (pessoaId) references Pessoa(id),
    foreign key (participacaoId) references Participacao(id)
);




create table if not exists PessoPartipaco(
	pessoaId int primary key,
    participacaoId int primary key,
    foreign key (pessoaId) references Pessoa(id),
    foreign key (particapacaoId) references Participacao(id)
);

create table if not exists Musica(
	id int primary key auto_increment,
    titulo varchar(50),
    letra varchar(1000),
    dataComposicao date,
    genero int,
    tag varchar(150),
    link varchar(200),
    generoId int,
    rankMusica int,
    foreign key (generoId) references Genero(id)
);


create table if not exists Faixa(
	albumId int,
    ordem int,
    musicaId int,
    generoId int,
    duracao int,
    foreign key (musicaId) references Musica(id),
    foreign key (generoId) references Genero(id)
);
