import axios from 'axios';

export default axios.create({                           // give http://localhost:8080 for local run. 
    baseURL:'movies-reviews-production.up.railway.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});
