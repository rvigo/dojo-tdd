# Dojo TDD

O sistema deverá implementar uma regra de `calculo de taxa` com base no `valor do titulo`, `tipo de pagamento`
e `tipo de produto`.  
O valor da taxa deverá ser:

* somado ao valor do titulo e salvo em um banco de dados atraves do `repositorio` junto ao `id do titulo`
* retornado pelo metodo `execute` do `Service`   

As regras de validação devem respeitar a tabela abaixo:

| valor           | tipo de pagamento |  tipo de produto   | taxa |
|-----------------|-------------------|:------------------:|------|
| <= 2500         | PIX               |     CREDIARIO      | 10%  |
| <= 3000         | PIX               |     BOLETAO_DO_FAUSTAO      | 12%  |
| > 2500 & < 5000 | BOLETO            | CREDIARIO | 10%  |
| > 3000 & < 5000 | BOLETO            | BOLETAO_DO_FAUSTAO | 15%  |
| => 5000  < 7500 | DEBITO            |     CREDIARIO      | 25%  |
| => 5000  < 8000 | DEBITO            |     BOLETAO_DO_FAUSTAO      | 25%  |
| => 7500         | CREDITO           | CREDIARIO | 90%  |
| => 8000         | CREDITO           | BOLETAO_DO_FAUSTAO | 100%  |


Qualquer combinação que nao se encaixe nessas regras deverá lançar uma `exceção`

Cada dev será reponsavel pela implementação de um conjunto utilizando as classes disponibilizadas no pacote `domain`  
Estas classes _**não podem**_ ser alteradas.

O uso de frameworks externos (`mockK`, `mockito`, entre outros) não é permitido.

_Boa sorte!_
