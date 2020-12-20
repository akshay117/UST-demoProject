import React, { Component } from 'react'
import './App.css'

export class App extends Component {

constructor(props){
  super(props);
  this.state={
    items:[],
    isLoaded:false
  }
}

componentDidMount(){
  fetch('https://fakestoreapi.com/products')
            .then(res=>res.json())
            .then(json=>{
              this.setState({
                isLoaded:true,
                items: json,
              })
            })
}
  render() {

    var {isLoaded,items} = this.state;

    if(!isLoaded){
      return <div><h1>Loading...</h1></div>

    } 
    else {
    
    
    return (
      <div className="App">

           <ul>

            {items.map(item => (
             <li key = {item.id}  >
                      <h1> {item.title} </h1>
                     <h2>$ {item.price}</h2> 
                      <h3>{item.category}</h3> 
                       
                       
                       
             </li>
            ))}

           </ul>


      </div>
    )
    }
  }
}

export default App





