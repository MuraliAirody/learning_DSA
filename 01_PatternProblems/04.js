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