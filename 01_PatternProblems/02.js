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
    for (let j = n - i + 1; j > 0; j--) {
      str = str + `${j}`;
    }
    console.log(str);
  }
}
print2(5);

console.log("------------------------------------------------------------");

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

function print3(n) {
  let start = 1

  for (let i = 1; i <= n; i++) {
    let str = ""
    if (i % 2 === 0)
      start = 0
    else
      start = 1

    for (let j = 1; j <= i; j++) {
      str += `${start} `

      start = 1 - start;
    }
    console.log(str);
  }
}

print3(5)

console.log("------------------------------------------------------------");

function print4(n) {
  for (let i = 1; i <= n; i++) {
    let str = ""
    for (let j = 1; j <= i; j++) {
      if ((i + j) % 2 === 0)
        str += "1 "
      else
        str += "0 "
    }
    console.log(str)
  }
}

print4(5)

console.log("------------------------------------------------------------");

// 1          1
// 12        21
// 123      321
// 1234    4321
// 12345  54321
// 123456654321

function print5(n) {
  for (let i = 1; i <= n; i++) {
    let str = "";
    for (let j = 1; j <= i; j++) {
      str += `${j}`;
    }
    for (let k = 1; k <= 2 * (n - i); k++) {
      str += " "
    }
    for (let l = i; l > 0; l--) {
      str += `${l}`
    }
    console.log(str);
  }
}

print5(5)

console.log("------------------------------------------------------------");

// 1
// 2 3
// 4 5 6 
// 7 8 9 10
// 11 12 13 14 15 

function print6(n) {
  let count = 1;
  for (let i = 1; i <= n; i++) {
    let str = ""
    for (let j = 1; j <= i; j++) {
      str+=`${count} `
      count++
    }
    console.log(str)
  }
}

print6(5)

