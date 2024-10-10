Proposta:

Você deve criar um sistema de gestão de produtos para uma loja. O sistema deve permitir que a loja gerencie diferentes tipos de produtos, com características e comportamentos distintos.

Parte 1: Abstração
Crie uma classe abstrata chamada Produto que tenha os seguintes atributos e métodos:
Atributos:
nome (String)
preco (double)
Métodos:
calcularDesconto(double porcentagem): um método que retorna o preço do produto após aplicar o desconto.
Implemente pelo menos duas subclasses de Produto. Cada uma dessas classes deve implementar o método calcularDesconto() de forma diferente:

Parte 2: Polimorfismo
Crie uma classe chamada Estoque que possua um método chamado exibirPrecosComDesconto(List<Produto> produtos). Esse método deve percorrer a lista de produtos e chamar o método calcularDesconto() de cada um, exibindo o preço após o desconto no console.

Parte 3: Associação
Na classe Estoque, adicione um atributo do tipo List<Produto> que representará os produtos disponíveis. Crie métodos para adicionar e remover produtos dessa lista.No método main, crie uma instância da classe Estoque, adicione alguns produtos a ele e chame o método exibirPrecosComDesconto() para mostrar os preços dos produtos com desconto.
