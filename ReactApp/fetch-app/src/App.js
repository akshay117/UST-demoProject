
import React , {Component} from 'react';
import Todos from './components/Todos'


class App extends Component {
  state ={
    todos:[
      {
        id:1,
      title:"Apex Legends",
      completed:false
      },
      {
        id:2,
        title:"Titan Fall 2",
        completed:true
      },
      {
        id:3,
        title:"Silent Hill",
        completed:false
      }
    ]
  }

  markComplete = (id) => {
this.setState({todos: this.state.todos.map( todo => {
  if(todo.id === id){
    todo.completed = !todo.completed
  }

  return todo
})})
  }
delTodo = (id) =>{
  console.log(id)
} 
  render(){

    return (
      <div >
       
        <Todos todos={this.state.todos} 
        markComplete = {this.markComplete}
        delTodo ={this.delTodo}

        />
      </div>
    );
  }
  
}

export default App;
