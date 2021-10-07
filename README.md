# Recarga de celular

A recarga de celular acontece quando a pessoa que é correntista informa o número do celular (com o DDD) a operadora e o valor de recarga. O serviço então se comunica com o sistema da operadora que pede para efetuar a recarga.

Contudo, a operadora não efetua a recarga na hora, ela é apenas registrada e o saldo é adicionado aos créditos do celular em outro momento.

Sabendo disso, vamos as tarefas:

1. Comunicando a operadora de uma operação de crédito

---

## Recarregando um celular

### Necessidades

Para recarregar o celular a pessoa informa o valor da recarga, o número com DDD e a operadora

### Restrições

- Só pode ser efetuada a recarga quando o saldo for maior ou igual ao valor
- Caso o sistema da operadora esteja fora do ar, não será possível efetuar a recarga, logo, não há necessidade de debitar o valor da conta
   
### Resultado Esperado
- Em caso de sucesso:
   - Devolver um status de sucesso (2xx) 
   - Debitar o valor da conta
   - A pessoa deve receber um email com a transação feita
   - O Extrato deve ser atualizado com a nova transação

- Em caso de falha:
   - Retornar um status **422** com a mensagem de erro caso o saldo não seja suficiente
   - Retornar um status **5xx** caso o serviço da operadora esteja indisponível

### Pontos de atenção
- É importante notar quantos serviços estão envolvidos nessa operação
- Qual o melhor lugar para deixar a lógica de verificação de saldo?
