// frontend/src/hooks/useTimeSpeak.js
import { useState, useEffect } from 'react';
import { fetchSpokenTime } from '../services/TimeApi';
import axios from 'axios';
export function useTimeSpeak(timeInput) {
    const [spoken, setSpoken] = useState('');
    const [error, setError] = useState('');

    useEffect(() => {
        if (!timeInput) return;

        setError('');
        axios.get('/api/time/speak', { params: { input: timeInput } })
            .then(res => {
                setSpoken(res.data.spoken);
            })
            .catch(err => {
                setSpoken('');
                setError(err.response?.data?.error || err.message);
            });
    }, [timeInput]);

    return { spoken, error };
}
