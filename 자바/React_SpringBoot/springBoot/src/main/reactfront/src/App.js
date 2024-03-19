import React, {useState, useEffect} from 'react';
import axios from 'axios';

const App = () => {

    const [posts, setPosts] = useState([]);

    useEffect(() => {
      /*
      axios 통신 방법 1
      axios({
        method : 'GET',
        url:'https://jsonplaceholder.typicode.com/photos' // fake api url
      }).then(response => setPosts(response.data))
      */
     
      // 방법 2 
      /*
      axios.get('https://jsonplaceholder.typicode.com/photos')
           .then(response => setPosts(response.data))
      */

      // 방법 3
      async function fetchData(){
        const response = await axios.get('https://jsonplaceholder.typicode.com/photos')  
        setPosts(response.data);
      }

     try {
      fetchData();
     } catch(error){
      console.log(error);
     }
      
    })

    return (
      <ul>
        {posts.map(post => (
          <li key={post.id}>
            <div>{post.title}</div>
            <div><img src={post.thumbnailUrl}/></div>
          </li>
        ))}
      </ul>
    )
}

export default App;
