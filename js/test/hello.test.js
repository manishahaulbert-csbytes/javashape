import { sum, multiply } from '../src/hello.js';

describe('hello module', () => {
  describe('sum()', () => {
    test('adds positive numbers', () => {
      expect(sum(2, 3)).toBe(5);
    });
    test('handles negatives and zero', () => {
      expect(sum(-1, 1)).toBe(0);
      expect(sum(0, 0)).toBe(0);
    });
    test('works with floats', () => {
      expect(sum(2.5, 3.5)).toBe(6);
    });
  });

  describe('multiply()', () => {
    test('multiplies positive numbers', () => {
      expect(multiply(2, 3)).toBe(6);
    });
    test('handles negatives and zero', () => {
      expect(multiply(-2, 3)).toBe(-6);
      expect(multiply(0, 999)).toBe(0);
    });
    test('works with floats', () => {
      expect(multiply(2.5, 2)).toBe(5);
    });
  });
});
