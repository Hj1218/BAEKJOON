function solution(w, h) {
    function gcd(a, b){
        let mod = a%b; 
        if(mod==0){
            return b;
        }
        return gcd(b, mod);
    }
    let result = gcd(w,h);
    return w*h-(w+h-result);
}