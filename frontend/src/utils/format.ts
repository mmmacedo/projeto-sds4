import {format} from 'date-fns';

export const round = (value: number, precision: number): number => {
    const multiplier = Math.pow(10, precision || 0);
    const result = Math.round(value * multiplier) / multiplier;
    return result;
}

export const formatLocalDate = (date: string, pattern: string): string => {
    const dt = new Date(date);
    const dtDateOnly = new Date(dt.valueOf() + dt.getTimezoneOffset() * 60 * 1000);
    return format(dtDateOnly, pattern);
}
