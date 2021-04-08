const Cassandra =require('express-cassandra');

const models = Cassandra.createClient({
    clientOptions:{
        contactPoints:['127.0.0.1'],
        protocolOptions:{port: 9042},
        keyspace: 'newdevops',
        queryOptions:{consistency:Cassandra.consistencies.one}

    },
    ormOptions:{
        defaultReplicationStrategy:{
            class:'SimpleStrategy',
            replication_factor:1
        },
        dropTableOnSchemaChange: false,
        createKeyspace: true,
        drop: false
    }
})

const ProductSchema = models.loadSchema('products',{
    fields:{
        product_id:'int',
        product_name:'text',
        product_code:'text',
        price:'double',
        image_url:'text',
        rating:'double'
    },
    key:['product_id']
})
ProductSchema.syncDB((err,result)=>{
    if(err)
    console.log(err)
    else
    console.log(result)
});
module.exports = models;