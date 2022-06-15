<h1 align = "center"> GUIA JAVA </h1>
<h2> IMPORTANTE SABER </h2>

<p> JAVA é uma linguagem de programação ORIENTADA AOS OBJETOS, mas o que significa isso? O objetivo da orientação aos objetos é aproximar o manuseio das estruturas de um programa, do manuseio das coisas do mundo real. Esse paradigma se baseia em 4 pilares, são eles: </p>

<li> HERANÇA > É uma forma de eliminar repetições no código, onde, como o próprio nome sugere, um objeto pode herdar características de outra classe, sem necessidade de se reescrever essas mesmas características. Ao criar uma entidade Pessoa, podemos afirmar que toda Pessoa possui um Nome. Por outro lado, todo Aluno também deveria ter um Nome, sendo assim, para que todo Aluno tenha um Nome, fazemos com que o Aluno, herde o Nome de Pessoa, pois todo Aluno é uma Pessoa.
<li> POLIMORFISMO > Se refere à capacidade de dois ou mais objetos responderem à mesma mensagem, cada um de seu próprio modo. Suponhamos os objetos Colaborador, Gerente e Presidente, para inserir quem exerce cada função, deveríamos colocar insereColaborador, insereGerente e inserePresindente, com o polimorfismo podemos colocar apenas insere para todos os objetos.
<li> ABSTRAÇÃO > Isola de um objeto somente os conceitos que são necessários para o funcionamento do programa. 
<li> ENCAPSULAMENTO > Propriedade que esconde os atributos de um objeto, tornando nossa aplicação mais segura. Vamos criar uma analogia, imagine uma conta bancária onde qualquer pessoa possa alterar o saldo? Isso seria horrível para nossa aplicação, então encapsulamos o saldo e manipulamos através de métodos como sacar, depositar e transferir.

<p> VANTAGENS DA PROGRAMAÇÃO ORIENTADA AOS OBJETOS - Permite que você represente melhor o mundo real em seus programas. Praticamente tudo no mundo pode ser descrito como um conjunto de propriedades e ações, que é exatamente como os objetos são organizados; Pode ser mais rápido programar. Permite reutilização de objetos em outros programas. Em vez de criar um código do zero, você pode usar um objeto ou método existente e apenas modificar ele para se adequar ao seu programa.
<p> ADVANTAGES OF OBJECT ORIENTED PROGRAMMING - Allows you to better represent the real world in your programs. Virtually everything in the world can be described as a set of properties and actions, which is exactly how objects are organized; It might be faster to program. Allows reuse of objects in other programs. Instead of creating code from scratch, you can use an existing object or method and just modify it to suit your program.

<p> S - O - L - I - D > É um acrônimo que representa os cinco princípios da programação orientada aos objetos.
<li> Single responsibility > Esse princípio declara que uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade.
<li> Opened and closed > Esse princípio declara que quando novos comportamentos e recursos precisam ser adicionados, devemos estender e não alterar o código fonte original.
<li> Liskov substitution > Esse princípio declara que uma classe derivada deve ser substituível por sua classe base.
<li> Interface segregation > Esse princípio declara que é melhor criar interfaces mais específicas que uma única interface genérica.
<li> Dependency inversion > Esse princípio declara que módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração. Declara também que abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.
	
<p> S - O - L - I - D > It is an acronym that stands for the five principles of object-oriented programming.
<li> Single responsibility > This principle states that a class must be specialized in a single subject and have only one responsibility.
<li> Opened and closed > This principle states that when new behaviors and features need to be added, we should extend and not change the original source code.
<li> Liskov substitution > This principle declares that a derived class must be substitutable for its base class.
<li> Interface segregation > This principle states that it is better to create more specific interfaces than a single generic interface.
<li> Dependency inversion > This principle states that high-level modules should not depend on low-level modules. Both must depend on abstraction. It also states that abstractions should not depend on details. Details must depend on abstractions.
