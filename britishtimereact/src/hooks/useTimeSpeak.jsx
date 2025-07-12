// frontend/src/hooks/useTimeSpeak.js
import { useState, useEffect } from 'react';
import { fetchSpokenTime } from '../services/timeApi';

export function useTimeSpeak(timeInput) {
    const [spoken, setSpoken] = useState('');
    const [error, setError] = useState('');

    useEffect(() => {
        if (!timeInput) return;

        setError('');
        fetchSpokenTime(timeInput)
            .then(setSpoken)
            .catch(e => {
                setSpoken('');
                setError(e.response?.data?.message || e.message);
            });
    }, [timeInput]);

    return { spoken, error };
}
