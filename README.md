# 🛠️ Challenge Motiva Sprint 1 e 2
> Solução em Java para monitoramento inteligente de manutenção preditiva e orquestração de ordens de serviço na malha metroviária.

---

## 👨‍💻 Autores e Contribuidores

| Integrante | RM |
| :--- | :--- |
| **Bruno Ventura** | 568316 |
| **Diogo Henrique Alves Magalhães** | 568541 |
| **Gilberto Hideaki Matsunaga** | 568191 |
| **Giovanna Pellegrino Zagaroli** | 567572 |
| **Vinicius Nathan** | 567105 |

---

## 📌 Descrição do Projeto

O **Motiva Management System** foi projetado para resolver falhas operacionais e paralisações não planejadas de escadas rolantes, administrados pela **Motiva** em estações de transporte público.

A aplicação utiliza modelagem orientada a objetos para monitorar horas de funcionamento dos componentes, prevendo desgastes e emitindo alertas de substituição preventiva. Além disso, o sistema aplica padrões polimórficos de projeto para coordenar a emissão e execução de ordens de serviço (Preventivas, Corretivas e Preditivas), garantindo a segurança dos passageiros e a continuidade dos serviços.

---

## 🎬 Demonstração / Preview

Ao executar a classe `Main.java`, a aplicação realiza a simulação do fluxo operacional no terminal:

> 📝 Emitindo Ordem de Serviço [PREVENTIVA] para a escada: ESC-L4-01
> ⚙️ Processando Ordem ID: 9910 via serviço genérico.
> 🔧 [PREVENTIVA] Executando rotina programada na Escada: ESC-L4-01
>    -> Técnico Gilberto Matsunaga realizando manutenção e testes de sensores preventivos.
>
> ⚠ ALERTA CRÍTICO: O componente 'Degrau' atingiu o limite máximo (12000.0/12000.0 hrs). Substituição imediata necessária!
> 🔄 Escada ESC-L4-01 teve o status alterado de [OPERACIONAL] para [EM_MANUTENCAO].

---

## ⚙️ Funcionalidades (Features)

- **Análise Preditiva de Componentes:** Monitoramento de horas operacionais vs. limite máximo com cálculo automático de percentual de vida útil e geração de alertas (`ComponenteService`).
- **Gestão Operacional de Equipamentos:** Alteração e acompanhamento seguro de status das escadas e elevadores (`OPERACIONAL`, `MANUTENCAO`, `PARADO_SEGURANCA`).
- **Emissão e Gestão de Ordens de Serviço:** Vinculação de chamados a estações, equipamentos e técnicos especialistas (`OrdemServicoService`).
- **Processamento Polimórfico de Manutenções:**
    - `ProcessadorPreventiva`: Execução de inspeções programadas e testes em sensores.
    - `ProcessadorCorretiva`: Atendimento emergencial com bloqueio do equipamento.
    - `ProcessadorPreditiva`: Coleta de telemetria e dados de desgaste em tempo real.

---

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17 ou superior)
- **Paradigma:** Orientação a Objetos (OO) e Domain-Driven Design (DDD)
- **Estruturas de Dados:** Java Collections (`ArrayList`, Enums)
- **IDE Recomendada:** IntelliJ IDEA, VS Code ou Eclipse

---

## 📋 Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- JDK (Java Development Kit) 17+
- Git (para clonar o repositório)

---

## 🔧 Instruções de Instalação e Uso

1. **Clonar o repositório:**
    - git clone [https://github.com/gmatsuna/2esps_challenge_ddd_java_sprint_1_e_2.git](https://github.com/gmatsuna/2esps_challenge_ddd_java_sprint_1_e_2.git)

2. **Acessar a pasta do projeto:**
    - cd 2esps_challenge_ddd_java_sprint_1_e_2

3. **Compilar o projeto via terminal (opcional):**
    - javac -d bin src/**/*.java

4. **Executar a aplicação:**
    - **Via IDE:** Abra o projeto em sua IDE, navegue até `src/Main.java` e execute a classe.
    - **Via Terminal:** java -cp bin Main

---

## 🧪 Execução dos Testes

Os testes de integração e validação das regras de negócio do sistema estão centralizados na execução da classe `Main.java`.

1. **Para rodar a verificação de fluxo completo:**
    - java -cp bin Main

2. **A suíte de simulação testará:**
    - [x] Validação de parâmetros nulos e lançamento de `IllegalArgumentException` / `ManutencaoException`.
    - [x] Cálculos de percentual de uso e alertas de manutenção preditiva.
    - [x] Transição de enums de status operacional.
    - [x] Execução polimórfica das instâncias de `ProcessadorServicoManutencao`.