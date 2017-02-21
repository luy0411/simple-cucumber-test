# language: pt
Funcionalidade: Imprime Beans

  Cenario: Teste simples de impressao uma lista
    Dado que a base de dados sera limpa
    Quando o processo de insercao na fila for chamado com a lista de evento
    		|id|name|age|
			|1|Luis|25|
			|2|Renato|21|
	Entao a lista sera impressa