# Sistema de Monitoramento da Jardineira - README

## Visão Geral

O Sistema de Monitoramento da Jardineira é um projeto desenvolvido para o Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE), campus Maracanaú, com o objetivo de proporcionar um rastreamento em tempo real do veículo oficial "Jardineira". A "Jardineira" é utilizada para transportar alunos e funcionários entre o campus e a estação de metrô mais próxima, mas a falta de informações sobre sua localização e tempo de chegada tem causado atrasos e inconveniências para os usuários.

Este projeto visa solucionar esse problema, fornecendo um sistema completo composto por três partes principais: o front-end, o back-end e o banco de dados. Além disso, será implementado um sistema embarcado no veículo, composto por um ESP32, um sensor acelerômetro e giroscópio, e um módulo GPS, para coletar e enviar informações sobre a localização e status do veículo para o sistema.

## Componentes do Sistema

### Front-end

O front-end do sistema será implementado em React, uma biblioteca JavaScript amplamente reconhecida para a criação de interfaces de usuário responsivas e interativas. Ele será a interface principal para os usuários finais, permitindo que eles visualizem em tempo real a localização da "Jardineira", obtenham informações sobre o horário de chegada e tenham acesso a notificações relevantes.

### Back-end

O back-end do sistema será desenvolvido com o uso do Spring Boot, um framework Java robusto para a criação de aplicações web. Ele será responsável por receber os dados enviados pelo sistema embarcado no veículo, processar essas informações e disponibilizá-las para o front-end. Além disso, o back-end gerenciará o armazenamento das informações no banco de dados PostgreSQL.

### Banco de Dados

O banco de dados PostgreSQL será utilizado para armazenar as informações das viagens da "Jardineira". Ele garantirá que os dados sejam consistentes e seguros, permitindo que sejam acessados e consultados de maneira eficiente. As informações armazenadas incluirão registros de viagens, localizações, horários e status do veículo.

### Sistema Embarcado

Para obter os dados de localização do veículo, será implementado um sistema embarcado que consiste em um ESP32, um sensor acelerômetro e giroscópio, e um módulo GPS. Esse sistema estará acoplado à "Jardineira" e enviará continuamente informações sobre sua posição e status para o back-end.

### Sistema Push

O projeto também incluirá um sistema de notificações push para smartphones Android e iOS. Isso permitirá o envio de notificações aos usuários sobre o status e a localização da "Jardineira", mantendo-os informados e reduzindo a incerteza sobre a chegada do veículo.

## Objetivos do Projeto

- Fornecer um rastreamento em tempo real da "Jardineira" para os usuários do campus Maracanaú do IFCE.
- Reduzir atrasos e desperdício de tempo ao informar os usuários sobre o horário de chegada estimado.
- Facilitar o controle da manutenção, segurança e eficiência do veículo por parte da administração do campus.
- Melhorar a experiência dos usuários ao disponibilizar informações atualizadas sobre o status do veículo.

## Próximos Passos

O projeto está atualmente em fase de desenvolvimento e os próximos passos incluem a implementação das partes do sistema, testes de integração e a criação da interface de usuário. A equipe responsável pelo projeto está comprometida em fornecer uma solução eficaz que atenda às necessidades da comunidade do campus Maracanaú do IFCE.

## Como Contribuir

Se você deseja contribuir para este projeto, fique à vontade para entrar em contato com a equipe de desenvolvimento. Sua expertise e apoio são bem-vindos para tornar este sistema ainda mais robusto e útil para a comunidade do IFCE. Juntos, podemos melhorar a experiência de transporte e monitoramento da "Jardineira".
