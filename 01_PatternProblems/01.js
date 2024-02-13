// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

function print(n) {
  for (let index = 1; index <= n; index++) {
    let str = "* ";
    console.log(str.repeat(n));
  }
}

print(5);

console.log("------------------------------------------------------------");

function print1(n) {
  for (let index = 0; index < n; index++) {
    let str = "";
    for (let i = 0; i < n; i++) {
      str += "* ";
    }
    console.log(str);
  }
}

print1(5);

console.log("------------------------------------------------------------");

function print2(n) {
  for (let index = 0; index < n; index++) {
    for (let i = 0; i < n; i++) {
      process.stdout.write("* ");
    }
    console.log();
  }
}

print2(5);



