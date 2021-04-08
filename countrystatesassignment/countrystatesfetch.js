class CountryStateService{

    
    getCountryStates=()=>{
       return fetch(`http://localhost:8086/countrystates`)
        .then(response=>response.json())

    }

}
const countryStateService = new CountryStateService();
let countryStates =[]
countryStateService.getCountryStates().then(data=>countryStates = data.countries)
document.getElementById('countries').addEventListener('click',()=>{
    var op=document.getElementById('countries')

    for(i=0;i<countryStates.length;i++){
        let option=new Option(countryStates[i],countryStates[i])
        document.getElementById('countries').appendChild(option)
    }
})
document.getElementById('countries').addEventListener('change',()=>{
    let countrySelected=document.getElementById('countries').value
    var opt=document.getElementById('states')
    let len=opt.options.length
    for(i=len-1;i>0;i--)
    opt.options[i]=null
    for(i=0;i<countryStates.countries.length;i++){
        if(countryStates.countries[i].country==countrySelected){
            for(j=0;j<countryStates.countries[i].states.length;j++){
                let opti=new Option(countryStates.countries[i].states[j])
                document.getElementById('states').appendChild(option)
            }
        }
    }
})