# Projeto Sorteio

> Projeto Java simples para realizar sorteios de nomes de forma randômica.  
> Criado como exercício de contribuição em projetos Open Source.

---

## 🎯 Objetivo

- Praticar o processo de contribuição em projetos Open Source.  
- Criar um projeto funcional e organizado, pronto para receber melhorias de terceiros.

---

## ⚙️ Funcionalidades

- Adicionar nomes à lista de sorteio
- Listar nomes cadastrados
- Sortear nomes aleatoriamente
- Listar nomes já sorteados
- Recolocar nomes sorteados individualmente ou todos de volta na lista

---

## 🛠 Tecnologias

- Java 17+ (ou superior)
- Estrutura de pacotes:
  - `src` → (raiz do código)
  - `app` → Classe principal `SorteioApp`
  - `ui` → Interface de menu `Menu`
  - `service` → Lógica do sorteio `SorteioService`

---

## 🚀 Como executar

1. Clone o repositório:

git clone <URL_DO_SEU_REPOSITORIO>\
cd sorteio\

Compile o projeto:

cd src
javac */*.java
cd ..

Execute:

java -cp src app.SorteioApp

###📖 Exemplo de uso

===== SISTEMA DE SORTEIO =====

1 - Adicionar nome\
2 - Listar nomes\
3 - Sortear\
4 - Ver sorteados\
5 - Recolocar um nome sorteado\
6 - Recolocar todos os sorteados\
0 - Sair

Escolha: 1\
Digite o nome: Maria\
Escolha: 1\
Digite o nome: João\
Escolha: 3\
Resultado: João\
Escolha: 4\
Nomes já sorteados:\
João\
Escolha: 6\
Todos os nomes sorteados foram recolocados.

## 🤝 Como contribuir

Contribuições são bem-vindas! Você pode:
- Corrigir bugs
- Melhorar a documentação
- Adicionar funcionalidades (ex: persistência, interface gráfica)
- Criar testes unitários

Passos para contribuir:
- Faça um fork do repositório
- Crie sua branch: git checkout -b minha-contribuicao
- Faça commits das suas alterações
- Abra um Pull Request descrevendo sua contribuição


## 📄 Licença

MIT License – este projeto é aberto e pode ser usado para estudo e aprendizado.
