import axios from 'axios';

export default axios.create({                           // give http://localhost:8080 for local run. 
    baseURL:'http://localhost:8080',
    headers: {"ngrok-skip-browser-warning": "true"}
});