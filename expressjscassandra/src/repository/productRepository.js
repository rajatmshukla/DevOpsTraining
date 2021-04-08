const models = require('../model/product')

class ProductRepository{
    // insert into products values (?,?,?,?,?)
    saveNewProduct(product){
        return new models.instance.products(product).saveAsync();
    }
    loadAllProducts(){
        models.instance.products.find({},{ raw: true, allow_filtering: true }, function(err, products){
            if(err) throw err;
            //people is an array of model instances containing the persons with name `John`
            console.log('Found ', products);
        });
    }
    loadProductsByPriceGt(productprice){
        const query={
           
            price:{'$gt':productprice}
          
        }
          models.instance.products.find(query,{ raw: true, allow_filtering: true },(err,result)=>{
              if(err){
                  console.log(err)
              }
              console.log(result)
          })
    }
    remove(id){
        const query={
            product_id:id
        }
        models.instance.products.delete(query,(err,result)=>{
            if(err){
                console.log(err)
            }
            console.log('delete ',result)
        })
    }
}
 const repository = new ProductRepository();
repository.saveNewProduct({product_id:2,product_name:'Iphone12',product_code:'Iphone1mini',
price:45000,image_url:'http://images.com/apple',rating:4.9})
.then(product=>console.log(product))
//repository.loadProductsByPriceGt(50000.0).then(products=>console.log(products))
repository.loadAllProducts()
//repository.loadProductsByPriceGt(50000.6)
//repository.remove(2)