// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************

function print(n){
    let space = 0;
   for(let i= 1;i<=n;i++){
     let str=""
     for(let j=n;j>=i;j--){
        str+="*"
     }
     for(let k=1;k<=space;k++){
        str+=" "
     }
     for(let l=n;l>=i;l--){
        str+="*"
     }
     space+=2
     console.log(str)
   }
   space=n*2-2
   for(let i= 1;i<=n;i++){
    let str=""
    for(let j=1;j<=i;j++){
       str+="*"
    }
    for(let k=1;k<=space;k++){
       str+=" "
    }
    for(let l=1;l<=i;l++){
       str+="*"
    }
    console.log(str)
    space-=2
  }
}

print(6)

console.log("------------------------------------------------------------");


function printPattern(n) {
    let space = 0;
    // Print upper half
    for (let i = 1; i <= n; i++) {
        let str = "*".repeat(n - i + 1) + " ".repeat(space) + "*".repeat(n - i + 1);
        space += 2;
        console.log(str);
    }
    
    space = n * 2 - 2;
    // Print lower half
    for (let i = 1; i <= n; i++) {
        let str = "*".repeat(i) + " ".repeat(space) + "*".repeat(i);
        space -= 2;
        console.log(str);
    }
}

printPattern(6);

console.log("------------------------------------------------------------");

// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *


function printPattern(n) {
    let space = n * 2 - 2;
    
    // Print upper half
    for (let i = 1; i <= n; i++) {
        let str = "*".repeat(i) + " ".repeat(space) + "*".repeat(i);
        space -= 2;
        console.log(str);
    }
    space = 2;
    // Print lower half
    for (let i = n-1; i >= 1; i--) {
        let str = "*".repeat(i) + " ".repeat(space) + "*".repeat(i);
        space += 2;
        console.log(str);
    }
}

printPattern(6);
