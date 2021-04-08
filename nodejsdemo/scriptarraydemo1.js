let products =[
    {
        productId:1,
        productName:'Iphone',
        price: 78567.5,
        description: 'IPhone12'
        
    },
    {
        productId:3,
        productName:'MacbookPro',
        price: 178567.5,
        description: 'MacbookproPentium Processor 9'
        
    },
    {
        productId:4,
        productName:'Ipad',
        price: 48567.5,
        description: 'Iad12'
        
    }
]

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






