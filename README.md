# 🧩 Sudoku Interativo em Java

Um jogo de Sudoku desenvolvido em **Java**, utilizando **Swing** para interface gráfica, com funcionalidades interativas de inserção, remoção, verificação de status e rascunho de números.  
Este projeto foi implementado como parte de um desafio de programação.

---

## 🚀 Funcionalidades

O jogo possui um menu interativo com as seguintes opções:

1. **Iniciar novo jogo**  
   - Exibe o tabuleiro inicial com os números fixos pré-definidos (informados via `args` no método `main`).  

2. **Colocar novo número**  
   - Solicita número, índice horizontal e índice vertical.  
   - Impede colocar número em posição já preenchida (fixo ou informado pelo jogador).  

3. **Remover número**  
   - Solicita índices horizontal e vertical.  
   - Números fixos não podem ser removidos (mensagem de aviso exibida).  

4. **Visualizar jogo**  
   - Exibe a situação atual do tabuleiro.  

5. **Verificar status do jogo**  
   - Possíveis estados:  
     - **Não iniciado** (sempre sem erros)  
     - **Incompleto** (com ou sem erros)  
     - **Completo** (com ou sem erros)  
   - Identifica conflitos de números nas linhas, colunas ou blocos.  

6. **Limpar jogo**  
   - Remove apenas os números inseridos pelo jogador, mantendo os fixos.  

7. **Finalizar jogo**  
   - Permite encerrar apenas se todos os espaços estiverem preenchidos corretamente.  

8. **Modo rascunho**  
   - Permite inserir anotações provisórias dentro dos quadrados, seguindo o modelo proposto na sessão “modelo de rascunho”.  

---

## 🖥️ Interface Gráfica

O projeto utiliza **Swing/AWT** para:  
- Criar o tabuleiro do Sudoku.  
- Permitir interação por botões, caixas de texto e menus.  
- Exibir mensagens de erro, aviso e status do jogo.

---

## 📦 Tecnologias Utilizadas

- **Java** (versão 8+)
- **Swing / AWT** para interface gráfica
- Programação Orientada a Objetos (POO)

---

## 📜 Como Executar

1. **Clonar repositório**
   ```bash
   git clone https://github.com/milenamorais20/dio-desafio-sudoku/

2. **Compilar e executar**
```bash
cd sudoku-interativo-java
javac src/*.java
java Main <numeros_iniciais>
```

##📌 Regras do Jogo

- Não é permitido alterar ou remover números fixos.

- Todos os números devem estar entre 1 e 9.

- Um número não pode se repetir na mesma linha, coluna ou bloco 3x3.

## ✨ Autor

Desenvolvido por Milena Morais 💻

