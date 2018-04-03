"use strict";

function problem() {
    for (let a=1;a<1000;a++){
        for (let b=a+1;b<1000;b++){
            const c=1000-a-b;
            if (a*a+b*b==c*c){
                return a*b*c;
            }
        }
    }
    return -1;
}

module.exports = problem;