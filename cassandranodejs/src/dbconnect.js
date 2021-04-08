const cassandra = require('cassandra-driver');
const authProvider = new cassandra.auth.PlainTextAuthProvider('','');
const contactPoints = ['localhost','localhost','localhost']
<<<<<<< HEAD
const client = new cassandra.Client({contactPoints:contactPoints,keyspace:'devops',localDataCenter:'datacenter1'})

const execute = (query,cb)=>{
=======
const client = new cassandra.Client({contactPoints:contactPoints,keyspace:'devops',
localDataCenter: 'datacenter1'})

const execute =(query,cb)=>{

>>>>>>> 2e9d1d54304d71272974b91fe90e3b71f062fc92
    return new Promise((resolve,reject)=>{
        client.execute(query,(err,result)=>{
            if(err){
                reject(err)
            } else{
                cb(err,result);
                resolve()
            }
        })
<<<<<<< HEAD
    })
=======

    })

>>>>>>> 2e9d1d54304d71272974b91fe90e3b71f062fc92
}

const query1 = 'SELECT * from devops.books_by_author';

<<<<<<< HEAD
execute(query1,(err,result)=>{
    if(err) {console.log('execute ',err)}
    else {
    console.log(`books by author name is ${result.rows[0].author_name} publish year ${result.rows[0].publish_year}`)
}
}).then(()=>{
    console.log('exit');
    process.exit()})
=======

execute(query1,(err,result)=>{
  if(err){console.log('execute ',err)}
  else{
  console.log(`books by author name is ${result.rows[0].author_name}  publish year ${result.rows[0].publish_year}`)  
  }
}).then(()=>{
    console.log('exit');
    process.exit()})
>>>>>>> 2e9d1d54304d71272974b91fe90e3b71f062fc92
