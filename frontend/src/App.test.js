import {render, screen} from '@testing-library/react';
import axios from 'axios';
import App from './App';

jest.mock('axios');

test('renders navbar brand and add user button', async () => {
    axios.get.mockResolvedValue({data: []});
    render(<App/>);
    expect(screen.getByText(/full stack application/i)).toBeInTheDocument();
    expect(await screen.findByRole('link', {name: /add user/i})).toBeInTheDocument();
});
