export const round = (value: number, precision: number): number => {
    const multiplier = Math.pow(10, precision || 0);
    const result = Math.round(value * multiplier) / multiplier;
    return result;
}
