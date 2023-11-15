# Projeto de Sistemas Distribuídos - PUC Minas Poços de Caldas

Projeto desenvolvido como parte da disciplina de Sistemas Distribuídos na PUC Minas Poços de Caldas, ministrada pelo Prof. Udo Fritzke Junior.

Autor: André Fonseca de Paiva

## Descrição do Projeto

O projeto consiste em uma aplicação cliente-servidor usando Java RMI (Remote Method Invocation). O servidor fornece um serviço de monitoramento de RAM, enquanto o cliente pode solicitar informações sobre a utilização de memória no servidor.

## Estrutura do Projeto

- **`Server`**: Contém a implementação do servidor RMI (`Server.java`) que fornece o serviço de monitoramento de RAM. O objeto `RAMMonitorMessage` é utilizado para coletar e formatar os dados de RAM.

- **`Client`**: Apresenta a implementação do cliente RMI (`Client.java`), que interage com o servidor para obter informações sobre a RAM.

## Configuração do Projeto

O projeto utiliza o Maven para gerenciamento de dependências e construção.

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.projsisdis.andre</groupId>
    <artifactId>projsisdis</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

</project>
```

## Como Executar

1. Compile as classes Java em ambos os diretórios `Server` e `Client` usando `javac NomeDaClasse.java`.

2. Inicie o Registro RMI no terminal usando `rmiregistry`.

3. Execute o servidor no diretório `Server` com `java Server`.

4. Execute o cliente no diretório `Client` com `java Client`.

## Observações

Certifique-se de ter o JDK instalado no seu sistema para compilar e executar o projeto. Certifique-se também de executar o registro RMI antes de iniciar o servidor e o cliente.

---


