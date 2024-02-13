// 1
// 12
// 123
// 1234
// 12345

function print(n) {
  for (let i = 1; i <= n; i++) {
    let str = "";
    for (let j = 1; j <= i; j++) {
      str = str + `${j}`;
    }
    console.log(str);
  }
}
print(5);

console.log("------------------------------------------------------------");

// 1
// 22
// 333
// 4444
// 55555

function print1(n) {
    for (let i = 1; i <= n; i++) {
      let str = "";
      for (let j = 1; j <= i; j++) {
        str = str + `${i}`;
      }
      console.log(str);
    }
  }
  print1(5);

console.log("------------------------------------------------------------");


// 12345
// 1234
// 123
// 12
// 1

function print2(n) {
  for (let i = 1; i <= n; i++) {
    let str = "";
    for (let j = n-i+1; j > 0; j--) {
      str = str + `${j}`;
    }
    console.log(str);
  }
}
print2(5);