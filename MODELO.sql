>>>
CREATE TABLE pessoa {
	id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
	nome VARCHAR(20) NOT NULL,
	nascimento DATE
}
INSERT INTO pessoa (nome, nascimento) VALUES ('João', '2000 02 03')
INSERT INTO pessoa (nome, nascimento) VALUES ('Maria', '2003 04 14')
INSERT INTO pessoa (nome, nascimento) VALUES ('Aparecida', '1977 10 30')
>>>
