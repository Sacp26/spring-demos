# spring-graphql
spring boot with graphql

After server is up on localhost:8080
1> open chrome plugin - graphql playground
2> http://localhost:8080/graphql
3> query -
query{
  customers{
    id
    firstName
    lastName
    email
  }
}

query{
  getCustomerById(id: 2){
    id
    firstName
    lastName
    email
  }
}

4> Mutation - add entry payload
mutation{
  addCustomer(input:{
    firstName: "Mahesh"
    lastName: "Samgir"
    email: "maheshsamgir999@gmail.com"
    phoneNumber: "8888888"
    address: "Veer"
    city: "purandar"
    state: "MH"
    zipCode: "41234"
  })
  {
    id
    firstName
    lastName
    email
  }
}
