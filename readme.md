# Test Tema Carlos Andrade

Projeto api Rest Carta - HearthStone

## Run

Para rodar o projeto basta executar 'mvn spring-boot:run' , O projeto irá rodar no localhost porta 8080

# Ambiente de Desenvolvimento

> Obs.: Recomenda-se o uso de Sistema Operacional Unix para o desenvolvimento, apesar de que a solução pode ser desenvolvida em qualquer sistema operacional.

## 1. Git

A solução de versionamento utilizada será o **Git**, que deve ser baixado no link a seguir:

[https://git-scm.com/downloads](https://git-scm.com/downloads)

> Opcionalmente, no Linux, é possível instalar utilizando a solução de gerenciados de pacotes (ex: apt-get, yum)

> Caso o sistema operacional utilizado seja Windows, após a instalação adicione o seguinte path nas variáveis de ambiente: <raiz do git>\usr\bin


## 2. Java

O **Java** é utilizado como a linguagem de programação do projeto e portanto será necesária para o desenvolvimento. Para realizar sua instalação baixe e instale a **versão 1.8 da JDK** disponível no link abaixo:

[https://www.java.com/pt-BR/download/](https://www.java.com/pt-BR/download/)

> Opcionalmente, no Linux, é possível instalar utilizando a solução de gerenciados de pacotes (ex: apt-get, yum)

## 3. Maven

O **Maven** é utilizado para estruturar os módulos do projeto e organizar as dependências utilizadas. Instale a **versão 6.3.X do Maven** pelo link a seguir:

[https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

### 4 Banco de Dados H2

Para acessar o banco de dados H2 basta entrar no path /h2-console
path = /h2-console
url = jdbc:h2:mem:testdb
username=sa
password=

## 5. IDE

Para realizar o desenvolvimento será necessária uma IDE que dê suporte ao desenvolvimento de JavaEE. O projeto utiliza por padrão o IntelliJ porém não há restrições quanto ao uso de outras soluções de escolha. Abaixo seguem os links para o download e instalação das principais IDEs de mercado:

Intellij: [https://www.jetbrains.com/idea/promo/ultimate/](https://www.jetbrains.com/idea/promo/ultimate/)
Eclipse: [https://www.eclipse.org/downloads/packages/](https://www.eclipse.org/downloads/packages/)
NetBeans: [https://netbeans.org/downloads/8.2/rc/](https://netbeans.org/downloads/8.2/rc/)

## 6. Dependências

Antes de iniciar o desenvolvimento e também com o objetivo de validar a montagem do ambiente recomenda-se rodar uma construção do projeto. Para construir o projeto instalando suas dependências, acesse o diretório do projeto e execute o comando a seguir:

`mvn clean install`


