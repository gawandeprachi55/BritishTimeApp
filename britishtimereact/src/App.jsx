// frontend/src/App.jsx
import React, { useState } from 'react';
import { TimeInput } from './components/TimeInput';
import { SpokenTimeDisplay } from './components/SpokenTimeDisplay';
import { useTimeSpeak } from './hooks/useTimeSpeak';

export default function App() {
    const [input, setInput] = useState('');
    const [submittedTime, setSubmittedTime] = useState('');
    const { spoken, error } = useTimeSpeak(submittedTime);

    const handleSubmit = () => setSubmittedTime(input);

    return (
        <div style={{ padding: '2rem', fontFamily: 'sans-serif' }}>
            <h1>British Time Speaker</h1>
            <TimeInput
                value={input}
                onChange={setInput}
                onSubmit={handleSubmit}
            />
            <SpokenTimeDisplay spoken={spoken} error={error} />
        </div>
    );
}
