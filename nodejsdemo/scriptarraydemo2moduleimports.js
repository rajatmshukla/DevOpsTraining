
const products = require('./products')

//console.log(products.sort(function(product1,product2){return product1.price-product2.price}));

//console.log(products.sort((product1,product2)=> product1.price-product2.price))

//console.log(products.sort((product1,product2)=>product1.productName.localeCompare(product2.productName)))


// console.log(products.filter()
// .map(product=>product.price).reduce((accumulator,currentValue)=>accumulator+=currentValue))


//const productFilter1=function(product){return product.price>50000 }


const productfilter = product => product.price>50000

const productMap = product => product.price

const sum =(accumulator,currentValue) => accumulator+=currentValue

console.log(products.filter(productfilter).map(productMap).reduce(sum,0))






