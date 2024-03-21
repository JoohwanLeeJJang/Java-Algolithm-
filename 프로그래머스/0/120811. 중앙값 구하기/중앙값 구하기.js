function solution(array) {
    array.sort((a, b) => a - b);
    

    return array[Math.floor(array.length / 2)];
    // return array[Math.floor(length / 2)];
}