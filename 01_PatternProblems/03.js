// *
// * *
// * * *
// * * * *
// * * * * *

function print(n) {
  for (let i = 1; i <= n; i++) {
    let str = "* ";
    console.log(str.repeat(i));
  }
}
print(5);

console.log("------------------------------------------------------------");

function print1(n) {
  for (let i = 1; i <= n; i++) {
    let str = "";
    for (let j = 1; j <= i; j++) {
      str += "* ";
    }
    console.log(str);
  }
}
print1(5);

console.log("------------------------------------------------------------");

// * * * * *
// * * * *
// * * *
// * *
// *

function print2(n) {
  for (let i = n; i >= 1; i--) {
    let str = "* ";
    console.log(str.repeat(i));
  }
}

print2(5);

console.log("------------------------------------------------------------");

//     *
//    ***
//   *****
//  *******
// *********

function print3(n) {
  for (let i = 1; i <= n; i++) {
    let star = "*";
    let space = " ";
    console.log(`${space.repeat(n - i)}${star.repeat(2 * i - 1)}`);
  }
}

print3(5);

console.log("------------------------------------------------------------");

// *********
//  *******
//   *****
//    ***
//     *

function print4(n) {
  for (let i = 1; i <= n; i++) {
    let star = "*";
    let space = " ";
    console.log(`${space.repeat(i - 1)}${star.repeat(2 * (n - i) + 1)}`);
  }
}

print4(5);

console.log("------------------------------------------------------------");

//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

function print5(n) {
  for (let i = 1; i <= n; i++) {
    let star = "*";
    let space = " ";
    console.log(`${space.repeat(n - i)}${star.repeat(2 * i - 1)}`);
  }
  for (let i = 1; i <= n; i++) {
    let star = "*";
    let space = " ";
    console.log(`${space.repeat(i - 1)}${star.repeat(2 * (n - i) + 1)}`);
  }
}

print5(5);

console.log("------------------------------------------------------------");

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

function print6(n) {
    for (let i = 1; i <= n; i++) {
      let star = "*";
      console.log(star.repeat(i));
    }
    for (let i = n-1; i > 0; i--) {
      let star = "*";
      console.log(star.repeat(i));
    }
}

print6(5)

console.log("------------------------------------------------------------");

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
