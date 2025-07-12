import React, { useState } from 'react';
import { TimeInput } from './Component/TimeInput';
import { SpokenTimeDisplay } from './Component/SpokenTimeDisplay';
import { useTimeSpeak } from './hooks/useTimeSpeak';

export default function App() {
  const [input, setInput] = useState('');
  const [submittedTime, setSubmittedTime] = useState('');
  const { spoken, error } = useTimeSpeak(submittedTime);

  const handleSubmit = () => {
    setSubmittedTime(input);
    setInput('');
  };

  return (
      <div style={{ padding: '2rem', fontFamily: 'Arial, sans-serif' }}>
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
