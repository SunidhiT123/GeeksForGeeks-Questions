class Solution {

    void printNos(int N) {
        if(N==1){
            System.out.print( 1+" ");
            return;
        }
        
        System.out.print(N + " ");
        printNos(N-1);
    }
}