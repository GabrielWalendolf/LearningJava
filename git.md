Show, Gabriel! Vou te passar uma **lista completa e bem explicada dos comandos Git mais usados**, organizada por etapas. Essa lista vai te ajudar a mandar bem tanto em projetos novos quanto quando você já está no meio de um projeto.

---

## 📄 Lista de Comandos Git — Gabriel Walendolf Edition 💻

### 🔧 Configuração Inicial

```
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```
> Define seu nome e e-mail para os commits. Faz uma vez e já vale pra todos os projetos.

```
git config --global credential.helper cache
```
> Armazena as credenciais por um tempo e evita digitar login toda vez.

---

### 📁 Iniciar um novo repositório

```
git init
```
> Inicializa um repositório Git na pasta atual.

---

### 📌 Adicionar e versionar arquivos

```
git add .
```
> Adiciona todos os arquivos para serem versionados.

```
git commit -m "mensagem do commit"
```
> Registra os arquivos adicionados com uma mensagem explicando a mudança.

```
git status
```
> Mostra o que foi modificado, o que tá pronto pra commit, etc.

---

### 🌐 Conectar ao GitHub

```
git remote add origin https://github.com/usuario/repositorio.git
```
> Conecta o repositório local a um repositório remoto.

```
git remote set-url origin https://github.com/usuario/repositorio.git
```
> Atualiza o link do repositório remoto, caso precise trocar.

---

### 🚀 Enviar arquivos para o GitHub

```
git branch -M main
```
> Garante que a branch principal seja chamada `main`.

```
git push -u origin main
```
> Envia seus commits para o GitHub na branch principal.

```
git push
```
> Envia novas alterações depois do primeiro push.

---

### ⬇️ Baixar arquivos do GitHub

```
git pull origin main
```
> Puxa alterações da branch `main` do repositório remoto.

```
git clone https://github.com/usuario/repositorio.git
```
> Baixa uma cópia completa de um repositório remoto.

---

### 🧠 Controle de versões

```
git log
```
> Lista os commits feitos até agora.

```
git diff
```
> Mostra as diferenças entre arquivos modificados e o último commit.

```
git checkout nome-do-arquivo
```
> Volta o arquivo para a última versão confirmada (desfaz mudanças locais).

---

### 🌳 Trabalhando com branches

```
git branch
```
> Lista todas as branches.

```
git branch nome-da-branch
```
> Cria uma nova branch.

```
git checkout nome-da-branch
```
> Muda para outra branch.

```
git merge nome-da-branch
```
> Junta outra branch na branch atual.

---

### 🛠️ Outros úteis

```
git reset --hard
```
> Desfaz **todas** as alterações locais (cuidado!).

```
git stash
```
> Salva alterações temporárias sem fazer commit (ótimo pra trocar de branch rapidinho).

```
git stash pop
```
> Restaura o que foi guardado com `stash`.

---