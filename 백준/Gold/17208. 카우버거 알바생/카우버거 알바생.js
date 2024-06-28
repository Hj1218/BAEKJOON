const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const [M, N, K] = input[0].split(' ').map(Number);
const orders = input.slice(1).map(line => line.split(' ').map(Number));

const dp = Array.from({ length: N + 1 }, () => Array(K + 1).fill(0));

for (let [hamburger, fries] of orders) {
  for (let i = N; i >= hamburger; i--) {
    for (let j = K; j >= fries; j--) {
      dp[i][j] = Math.max(dp[i][j], dp[i - hamburger][j - fries] + 1);
    }
  }
}

console.log(dp[N][K]);