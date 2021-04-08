class FetchUserDetails{
    fetchData(){
        document.getElementById('search')
        .addEventListener('click',()=>{
           const username= document.getElementById('username').value

           fetch(`http://jsonplaceholder.typicode.com/users?username=${username}`)
           .then(response=>response.json()).then(data=>{
               document.getElementById('email').value=data[0].email
               document.getElementById('city').value=data[0].address.city
               document.getElementById('lat').value=data[0].address.geo.lat
               document.getElementById('longitude').value=data[0].address.geo.lng
           })

        })
    }
}
new FetchUserDetails().fetchData()