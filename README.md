# spring-graphqldemo

## Endpoints

- GraphQL: /graphql
- GraphIQL: /graphiql

## Test Query

```
POST localhost:8080/graphql
Content-Type: application/json

{
	"query":"{findAllBooks { id title } }"
}
```
