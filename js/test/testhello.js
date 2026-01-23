import { sum, multiply } from '../src/hello.js';
import assert from 'node:assert/strict';

// Sum tests
assert.equal(sum(2, 3), 5);
assert.equal(sum(-1, 1), 0);
assert.equal(sum(0, 0), 0);
assert.equal(sum(2.5, 3.5), 6);

// Multiply tests
assert.equal(multiply(2, 3), 6);
assert.equal(multiply(-2, 3), -6);
assert.equal(multiply(0, 999), 0);
assert.equal(multiply(2.5, 2), 5);

console.log('All JS tests passed.');