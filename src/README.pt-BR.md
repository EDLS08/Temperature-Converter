# Conversor de Temperatura CLI

Uma aplicação simples em Java via console que realiza a conversão de temperaturas entre as escalas Celsius e Fahrenheit. O projeto aplica validação básica de dados e execução contínua através de loops estruturados.

Disponível em outros idiomas: [English (Inglês)](README.md)

## Funcionalidades
* **Conversão Celsius / Fahrenheit:** Converte os valores utilizando fórmulas matemáticas básicas.
* **Validação de Entrada:** Dispara uma `IllegalArgumentException` caso o usuário escolha uma opção inexistente no menu.
* **Loop Resiliente:** Utiliza um laço `while` combinado com um bloco `try-catch` para capturar exceções e reiniciar o programa automaticamente em vez de fechar com erro.

## Como Executar

### Pré-requisitos
* Java Development Kit (JDK) 8 ou superior.

### Passos para Execução
```bash
# 1. Clone o repositório
git clone https://github.com

# 2. Acesse o diretório
cd nome-do-seu-repositorio

# 3. Compile a aplicação
javac TemperatureConverter.java

# 4. Execute o programa
java TemperatureConverter
```
