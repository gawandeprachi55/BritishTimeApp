// frontend/src/components/SpokenTimeDisplay.jsx
import React from 'react';
export function SpokenTimeDisplay({ spoken, error }) {
    if (error) return <p style={{ color: 'red' }}>{error}</p>;
    return spoken ? <p><strong>{spoken}</strong></p> : null;
}
