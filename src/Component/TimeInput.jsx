// frontend/src/components/TimeInput.jsx
import React from 'react';

export function TimeInput({ value, onChange, onSubmit }) {
    return (
        <form
            onSubmit={e => {
                e.preventDefault();
                onSubmit();
            }}
        >
            <input
                type="text"
                placeholder="HH:MM"
                value={value}
                onChange={e => onChange(e.target.value)}
            />
            <button type="submit">Speak</button>
        </form>
    );
}
