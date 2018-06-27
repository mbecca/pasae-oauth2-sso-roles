'use strict';
import Cookies from 'universal-cookie';
const React = require('react');
const ReactDOM = require('react-dom');
import './style.css';

class App extends React.Component {
	  constructor(props) {
	    super(props);
	    
	    this.state = {
	      data: []
	    };
	  }
	  
	  componentDidMount() {   
		 const cookies = new Cookies();
		 var that = this;
		 fetch('http://localhost:8082/user/list', 
				  { 
			   method: 'GET',
			   headers: new Headers({
			     'Authorization': 'Bearer '+ cookies.get('access_token'),
			     'Content-Type': 'application/json'
			   })})
		  .then(function(response) {
		    if (response.status >= 400) {
		      throw new Error("Bad response from server");
		    }
		    return response.json();
		  })
		  .then(function(data) {
		    that.setState({data: data});
		  });
		}
	  
	  render() {
	    if (this.state.data.length > 0) {
	      return (
	    	<ul>
	          {
	            this.state.data.map(function (person) {
	              return <li>{person.username}</li>
	            })
	          }
	        </ul>
	      );
	    }
	    return (<span>Loading...</span>);
	  }
	}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)

