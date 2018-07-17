# spring-graphqldemo

## Endpoints

- GraphQL: /graphql
- GraphIQL: /graphiql

## Test Query HTTP

```
POST localhost:8080/graphql
Content-Type: application/json

{
	"query":"{findAllBooks { id title } }"
}
```

## Test Query GraphIQL

```
query {
  findAllAuthors {
    id
    firstName
  }
}
```
