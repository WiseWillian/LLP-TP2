# Software gerenciador de serviços
Esse programa foi desenvolvido para fins de estudo. Ele consiste em um sistema computacional, criado a partir do paradigma de orientação a objetos para gerir um pequeno sistema de atribuição e monitoramento de serviços para a área de TI.

### Enunciado
Você foi contratado para desenvolver um software para gerenciar um sistema de
serviços de informática e manutenção em computadores e celulares. O sistema deverá
ser capaz de realizar as seguintes operações:
- Cadastro de administradores do sistema (Administradores)
- Cadastro de profissionais que prestam serviços (Qualquer pessoa)
- Cadastro de clientes (Qualquer pessoa)
- Cadastro dos tipos de serviços (Qualquer pessoa)
- Cadastro dos valores dos serviços prestados por um profissional. (Profissional)
- Orçamento de serviços (Clientes)
- Validação/ativação de tipos de serviços (Administradores)

### Modelagem
Temos como entidades da nossa aplicação as seguintes classes que demonstram o escopo dos objetos a serem manipulados
1. Pessoa (Administrador, Cliente, Profissional)
2. Serviço
3. Pedido
4. Orcamento

### Armazenamento de dados e sessão
O armazenamento dos dados é salvo em arquivos. O responsável por fazer essas modificações é a classe SessionHandler. Ela armazena o usuário atual, manipula arquivos de armazenamento durante a abertura e fechamento do programa e provê os dados para uso da aplicação.
