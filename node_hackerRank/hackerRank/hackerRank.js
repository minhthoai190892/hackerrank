/**
  // https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true
  https://www.youtube.com/watch?v=MIJt9H69QVc
 * 
 * @param {*} a 
 * @param {*} b 
 * @returns 
 */
export const solveMeFirst = (a, b) => {
  return a + b;
};
/**
 https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
 * @param {*} array 
 * @returns 
 */
export const simpleArraySum = (array) => {
  let sum = 0;
  for (let index = 0; index < array.length; index++) {
    sum = sum + array[index];
  }
  return sum;
};
/**
  // https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
 * 
 * @param {*} a 
 * @param {*} b 
 * @returns 
 */
export function compareTriplets(a, b) {
  let counterAlice = 0;
  let counterBob = 0;
  for (let index = 0; index < a.length; index++) {
    if (a[index] > b[index]) {
      counterAlice++;
    } else if (a[index] < b[index]) {
      counterBob++;
    }
  }
  return [counterAlice, counterBob];
}
/**
 *https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 * @param {*} ar nhận một mảng [1000000001,1000000002,1000000003,1000000004,1000000005]
 * @returns trả về tổng số
 */
export function aVeryBigSum(ar) {
  //
  let sum = BigInt(0);
  for (let index = 0; index < ar.length; index++) {
    sum = sum + BigInt(ar[index]);
  }
  return sum;
}
/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
 * @param {*} arr
 */
export function diagonalDifference(arr) {
  // tạo biến tính tổng cho 2 đường chéo
  let primaryDiagonalSum = 0;
  let secondaryDiagonalSum = 0;
  //   lấy độ dài của mảng
  let n = arr.length;
  for (let index = 0; index < n; index++) {
    // console.log(arr[index][index]);
    primaryDiagonalSum += arr[index][index];
    secondaryDiagonalSum += arr[index][n - 1 - index];
    // console.log(index+" "+arr[index]);
    console.log(index);
  }

  return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
}
/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
 * @param {*} arr
 */

export function plusMinus(arr) {
  const total = arr.length;
  let countPositive = 0;
  let countNegative = 0;
  let countZero = 0;
  for (let index = 0; index < arr.length; index++) {
    const element = arr[index];
    if (element > 0) {
      countPositive++;
    } else if (element < 0) {
      countNegative++;
    } else {
      countZero++;
    }
  }
  console.log((countPositive / total).toFixed(6));
  console.log((countNegative / total).toFixed(6));
  console.log((countZero / total).toFixed(6));
}

/**
 * https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 * @param {*} n
 */
export function staircase(n) {
  // Write your code here
  for (let i = 1; i <= n; i++) {
    const space = " ".repeat(n - i);
    const hash = "#".repeat(i);
    console.log(space + hash);
  }
}
/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
 * @param {*} arr
 */
export function miniMaxSum(arr) {
  // Write your code here
  const sortArray = arr.sort((a, b) => a - b);
  const mini = sortArray
    .slice(0, 4)
    .reduce((previousValue, currentIndex) => previousValue + currentIndex, 0);
  const max = sortArray
    .slice(1)
    .reduce((previousValue, currentIndex) => previousValue + currentIndex, 0);
  console.log(mini, max);
}
/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
 * @param {*} candles
 */
export function birthdayCakeCandles(candles) {
  // tìm giá trị lớn nhất
  const height = Math.max(...candles);
  // đếm số candles có chiều cao bằng với height
  const count = candles.filter((candle) => candle === height).length;
  console.log(count);
}
/**
 * https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
 * @param {*} s
 */
export function timeConversion(s) {
  // Write your code here
}
