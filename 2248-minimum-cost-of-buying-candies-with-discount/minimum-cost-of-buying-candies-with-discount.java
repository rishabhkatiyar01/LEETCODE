class Solution {
    public int minimumCost(int[] cost) {
     Arrays.sort(cost);
    Stack<Integer> stack=new Stack<>();
    int total=0;
    for(int x:cost){
        stack.push(x);
    }

    while(!stack.isEmpty()){
        if(!stack.isEmpty()){
            total+=stack.pop();

        }
        if(!stack.isEmpty()){
            total+=stack.pop();

        }
        if(!stack.isEmpty()){
            stack.pop();

        }
    }
    return total;
    }
}