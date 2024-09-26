# Desafio Cloud
-Pesquisar e Subir uma API sua em Spring ou uma pagina Angular para um servidor em nuvem gratuito.

-Entrega deve ser feita por vídeo, mostrando o código e o projeto rodando em nuvem.

-Não precisa usar camadas de segurança.

### Implementação

Foi criada uma API com operações CRUD de funcionários, e feito o deploy no Render com o plano gratuito

Url base: https://java-desafio-cloud.onrender.com 

Endpoints:

```bash
GET /employees
```
Retorna todos os funcionários

---
```bash
GET /:employeeId
```
Retorna funcionário de acordo com Id passada

---
```bash
POST /employees
```
```json
{
    "employeeId": 4,
    "name": "John Murray",
    "department": "Security",
    "salary": 5000.0
}
```
Adiciona funcionário

---
```bash
PUT /employees/:employeeId
```
```json
{
    "employeeId": 4,
    "name": "John Murray",
    "department": "CEO",
    "salary": 99999999.0
}
```
Atualiza informações do funcionário

---
```bash
DELETE /employees/:employeeId
```
Deleta funcionário



