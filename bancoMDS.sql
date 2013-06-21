CREATE TABLE Cidade (
  id_cidade INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  UF_id_uf INTEGER UNSIGNED NOT NULL,
  descricao_cidade VARCHAR NULL,
  PRIMARY KEY(id_cidade),
  INDEX Cidade_FKIndex1(UF_id_uf)
);

CREATE TABLE Cliente (
  id_cliente INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Conta_id_conta INTEGER UNSIGNED NOT NULL,
  Endereco_id_endereco INTEGER UNSIGNED NOT NULL,
  Estado_civil_id_estcivil INTEGER UNSIGNED NOT NULL,
  Sexo_id_sexo INTEGER UNSIGNED NOT NULL,
  nome_cliente VARCHAR NULL,
  telefone_cliente VARCHAR NULL,
  cpf_cliente VARCHAR NULL,
  PRIMARY KEY(id_cliente),
  INDEX Cliente_FKIndex1(Sexo_id_sexo),
  INDEX Cliente_FKIndex2(Estado_civil_id_estcivil),
  INDEX Cliente_FKIndex3(Endereco_id_endereco),
  INDEX Cliente_FKIndex4(Conta_id_conta)
);

CREATE TABLE Conta (
  id_conta INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Funcionario_id_funcionario INTEGER UNSIGNED NOT NULL,
  valor_conta VARCHAR NULL,
  PRIMARY KEY(id_conta),
  INDEX Conta_FKIndex1(Funcionario_id_funcionario)
);

CREATE TABLE Endereco (
  id_endereco INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Cidade_id_cidade INTEGER UNSIGNED NOT NULL,
  cep VARCHAR NULL,
  rua VARCHAR NULL,
  bairro VARCHAR NULL,
  numero INTEGER UNSIGNED NULL,
  PRIMARY KEY(id_endereco),
  INDEX Endereco_FKIndex1(Cidade_id_cidade)
);

CREATE TABLE Estado_civil (
  id_estcivil INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao_estcivil VARCHAR NULL,
  PRIMARY KEY(id_estcivil)
);

CREATE TABLE Funcionario (
  id_funcionario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Sexo_id_sexo INTEGER UNSIGNED NOT NULL,
  Estado_civil_id_estcivil INTEGER UNSIGNED NOT NULL,
  Endereco_id_endereco INTEGER UNSIGNED NOT NULL,
  nome_funcionario VARCHAR NULL,
  telefone_funcionario VARCHAR NULL,
  cpf_funcionario VARCHAR NULL,
  PRIMARY KEY(id_funcionario),
  INDEX Funcionario_FKIndex1(Endereco_id_endereco),
  INDEX Funcionario_FKIndex2(Estado_civil_id_estcivil),
  INDEX Funcionario_FKIndex3(Sexo_id_sexo)
);

CREATE TABLE Pedido (
  id_pedido INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Conta_id_conta INTEGER UNSIGNED NOT NULL,
  Tipo_pedido_id_tipopedido INTEGER UNSIGNED NOT NULL,
  Funcionario_id_funcionario INTEGER UNSIGNED NOT NULL,
  Cliente_id_cliente INTEGER UNSIGNED NOT NULL,
  custo_pedido INTEGER UNSIGNED NULL,
  hora_pedido VARCHAR NULL,
  obs_pedido VARCHAR NULL,
  duracao_pedido INTEGER UNSIGNED NULL,
  PRIMARY KEY(id_pedido),
  INDEX Pedido_FKIndex1(Tipo_pedido_id_tipopedido),
  INDEX Pedido_FKIndex2(Funcionario_id_funcionario),
  INDEX Pedido_FKIndex3(Cliente_id_cliente),
  INDEX Pedido_FKIndex4(Conta_id_conta)
);

CREATE TABLE Produto (
  id_produto INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Pedido_id_pedido INTEGER UNSIGNED NOT NULL,
  nome_produto VARCHAR NULL,
  qtde_produto INTEGER UNSIGNED NULL,
  custo_produto VARCHAR NULL,
  duracao_produto INTEGER UNSIGNED NULL,
  PRIMARY KEY(id_produto),
  INDEX Produto_FKIndex1(Pedido_id_pedido)
);

CREATE TABLE Sexo (
  id_sexo INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao_sexo VARCHAR NULL,
  PRIMARY KEY(id_sexo)
);

CREATE TABLE Tipo_pedido (
  id_tipopedido INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao_tipopedido VARCHAR NULL,
  PRIMARY KEY(id_tipopedido)
);

CREATE TABLE UF (
  id_uf INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  descricao_uf VARCHAR NULL,
  PRIMARY KEY(id_uf)
);


