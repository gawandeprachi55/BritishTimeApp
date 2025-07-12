// frontend/src/services/TimeApi.js
import axios from 'axios';

export async function fetchSpokenTime(input) {
    const res = await axios.get('/api/time/speak', {
        params: { input }
    });
    return res.data.spoken;
}
