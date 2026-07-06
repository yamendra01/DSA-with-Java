Math/NimGame.java

LeetCode 292 - Nim Game
Difficulty: Easy

Topic:
- Math
- Game Theory

Time Complexity: O(1)
Space Complexity: O(1)


class Solution {
       public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }else{
            return true;
        }
    }
}
