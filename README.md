<img src="img/img.png" >

<h2>
Tecnologias e frameworks ultilizados
</h2>

<p>Flyway - Para a  criação de tabelas do banco de dados </p>
<p>SpringBoot - Para o mapeamento das requisições rest </p>
<h2>
Como está funcionando a atividade
</h2>

<p>
O projeto está organizado em pacotes cada um com sua responsabiliade
</p>


<img src="img/img_1.png">



**Controller** : Responsável por receber as requisições do usuário a partir das rotas definidas
<br>
**DtoCreate e DtoResponse**: Responsáveis por gerenciar e filtrar os dados que é criado e mostrado pelo usuário para que não seja acessado os dados diretamente do banco
<br>
**Model**: Responsáveis por mapear os elementos das tabelas e transformar em objeto Java
<br>
**Repository**: Gerencias os dados do banco o que é criado e o que é retornado
<br>
**Service**: Define regras sobre como manipular os dados e o que pode ou não ser feito



