// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

/**

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

*/


//Brute force :
class Solution {
    
    public boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        // Initial all element in boolean are false
        // If any condition is true then it changed to true in first for loop
        // if we not found it return false
        // ascii 'a'=97
        //        'b'=98
        //        |
        //        'z' = 97+26=  123
        for(int i=0;i< sentence.length();i++){
            arr[sentence.charAt(i)-'a'] = true;
            // arr[sentence.charAt(i)-'a'] == true;
            // dont use == use only =
            //Because every index is by default false 
            // Why we have to substract it with 97,
            // example : b is given whose ascii number is  98
            // 98-97=1, then for loop goes in that index and make it true nothing else.
        }
        for(int i=0;i<26;i++){
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    } 
}

// There is another method also by using bit manipulation but I will upload it soon