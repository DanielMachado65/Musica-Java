create database music_bank;
use music_bank;

-- Genero da Música
create table if not exists Genero(
  id int primary key auto_increment,
  nome varchar(100) not null
);

-- TipoMdia onde que foi lançada
create table if not exists TipoMidia(
	id int primary key auto_increment,
  midia varchar(100)
);

-- Pessoa do tipo usuário
create table if not exists Pessoa(
	id int primary key auto_increment,
  nome varchar(50),
  nascimento date,
  homepage varchar(200)
);

-- Participacao da Pessoa
create table if not exists Participacao(
	id int primary key auto_increment,
    descricao varchar(200)
);

-- Relacionamento NxN para Pessoa e Participacao
create table if not exists PessoaPartipacao(
  pessoaId int primary key,
  participacaoId int primary key,
  foreign key (pessoaId) references Pessoa(id),
  foreign key (particapacaoId) references Participacao(id)
);

-- Album
create table if not exists Album(
	id int primary key auto_increment,
  titulo varchar(100),
  datalancamento date,
  tempoTotal long,
  tipoMidiaId int,
  generoId int,
  foreign key (generoId) references Genero(id),
  foreign key (tipoMidiaId) references TipoMdia(id)
);

-- Musica
create table if not exists Musica(
	id int primary key auto_increment,
  titulo varchar(50),
  letra varchar(1000),
  dataComposicao date,
  tag varchar(150),
  link varchar(200),
  generoId int,
  rankMusica int,
  foreign key (generoId) references Genero(id)
);

-- Tabela mais dificil
create table if not exists Faixa(
  ordem int,
	albumId int,
  musicaId int,
  generoId int,
  duracao int,
  foreign key (musicaId) references Musica(id),
  foreign key (generoId) references Genero(id),
  foreign key (albumId) references Album(id),
  primary key (musicaId, generoId)
);
