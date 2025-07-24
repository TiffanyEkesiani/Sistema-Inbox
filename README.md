# Sistema-Inbox
# 💬 Projeto: Sistema de Mensagens em Java

Este projeto é um sistema simples de mensagens implementado em Java, utilizando os conceitos de Programação Orientada a Objetos (POO), como **herança**, **classe abstrata** e **métodos sobrescritos**.

---

## 🧠 Conceitos aplicados

- ✅ `Classe abstrata`: define a estrutura genérica de uma mensagem.
- ✅ `Herança`: as subclasses herdam comportamentos da superclasse `Mensagem`.
- ✅ `Sobrescrita de métodos` com `@Override`: cada subclasse implementa sua própria versão dos métodos abstratos.
- ✅ `Encapsulamento`: atributos privados com getters públicos.
- ✅ `LocalDateTime` e `DateTimeFormatter` para lidar com data e hora.

---

## 📁 Estrutura do projeto

ProjetosParalelos/
└── sistemainbox/
├── Mensagem.java // Classe abstrata base
├── MensagemTexto.java // Subclasse concreta: mensagem de texto
└── Main.java // Classe com método main para testes

yaml
Copiar
Editar

---

## ⚙️ Como funciona

1. O programa cria uma instância da subclasse `MensagemTexto`.
2. Exibe:
   - Um resumo com remetente e data formatada.
   - O conteúdo da mensagem.
3. A classe `Mensagem` define a estrutura base e não pode ser instanciada diretamente.

---

## ▶️ Exemplo de saída

De: Tiffany | Data: 24/07/2025 14:30
Mensagem de texto:
Olá! Esta é uma mensagem de teste.

yaml
Copiar
Editar

---

## 🛠️ Tecnologias usadas

- Java 17+
- `java.time.LocalDateTime`
- Programação Orientada a Objetos (POO)

---

## 🚀 Possíveis melhorias futuras

- [ ] Criar outras subclasses (como `MensagemImagem`, `MensagemEmail`, etc.)
- [ ] Adicionar menu com Scanner para criar mensagens dinamicamente
- [ ] Armazenar mensagens em um ArrayList
- [ ] Salvar mensagens em arquivo `.txt`

---

Desenvolvido com ❤️ por Tiffany Ekesiani
