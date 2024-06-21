const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
let [N, K] = input.shift().split(' ').map(Number);
const STUFFS = input.map(v => v.split(' ').map(Number));

let dp = new Array(K + 1).fill(0);

for (const [WEIGHT, VALUE] of STUFFS) {
    for (let i = K; i >= WEIGHT ; i--) {
        dp[i] = dp[i - WEIGHT] + VALUE > dp[i] ? dp[i - WEIGHT] + VALUE : dp[i];
    }
}
console.log(dp[K]);