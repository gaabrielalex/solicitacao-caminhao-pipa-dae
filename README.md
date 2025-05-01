# 🚛 Sistema de Solicitação de Caminhão-Pipa

Este projeto é uma aplicação web desenvolvida em **Java** utilizando o framework **Spring Boot**. Ele implementa um sistema para gerenciar solicitações de caminhões-pipa para o **DAE (Departamento de Água e Esgoto)** de Várzea Grande.

---

## **🔧 Funcionalidades**

- 📝 **Cadastro de solicitações de caminhões-pipa**, incluindo informações como nível de urgência.
- 🔍 **Pesquisa e listagem de solicitações cadastradas**.
- ✅ **Validação de dados no backend** para garantir a integridade das informações.
- 📱 **Interface amigável e responsiva** para interação com o sistema.

---

## **🛠️ Tecnologias Utilizadas**

### **Backend**
- 💻 **Spring Boot**: Framework principal para desenvolvimento da aplicação.
- 🔗 **Spring Data JPA**: Para integração com o banco de dados e manipulação de entidades.
- 🗃️ **Hibernate**: Implementação de JPA para persistência de dados.
- 🛢️ **MySQL**: Banco de dados relacional utilizado para armazenar as informações.

### **Frontend**
- 🌐 **Thymeleaf**: Motor de templates para renderização de páginas HTML dinâmicas.
- 🎨 **Bootstrap**: Framework CSS para estilização e responsividade.
- ⚡ **JavaScript**: Para interatividade e manipulação de elementos no frontend.

### **Outras Dependências**
- 🔄 **Thymeleaf Layout Dialect**: Para reutilização de layouts em páginas HTML.
- ⚠️ **SweetAlert2**: Para exibição de alertas e mensagens amigáveis ao usuário.

---

## **📐 Arquitetura**

O projeto segue a arquitetura **MVC (Model-View-Controller)**:

1. **Model**:
   - Representado pelas classes de domínio, como `SolicitacaoCaminhaoPipa`.
   - Define os dados e suas regras de negócio.

2. **View**:
   - Implementada com templates HTML no diretório `src/main/resources/templates`.
   - Exemplos:
     - `CadastroSolicitacaoCaminhaoPipa.html`: Formulário de cadastro.
     - `PesquisaSolicitacaoCP.html`: Listagem de solicitações.

3. **Controller**:
   - Controladores como `SolicitacaoCaminhaoPipaController` gerenciam as requisições HTTP e conectam o modelo à visão.
   - Exemplo: O método `salvar` processa o envio de uma nova solicitação e retorna a página de cadastro com uma mensagem de sucesso.

---

## **⚙️ Fluxo de Funcionamento**

1. O usuário acessa a aplicação via navegador (porta configurada: `9010`).
2. A aplicação exibe páginas HTML renderizadas dinamicamente com dados do backend.
3. O usuário pode:
   - Cadastrar uma nova solicitação.
   - Pesquisar solicitações existentes.
4. O backend valida os dados e interage com o banco de dados para salvar ou recuperar informações.
