package com.Ashish.All.StackNQueue.Stack.CustomNDynamicStack;

public class DynamicStack extends CustomStack{
    //Dynamic stack - these stack will never be full we can add as many
    //item as we want
    public DynamicStack(){
        super(); // it will call CustomStack()
    }
    public DynamicStack(int size){
        super(size); // it will call CustomStack(int size)
    }

    @Override // if we of DynamicStack not of parent class CustomStack (we use override method)
    public boolean push(int item) {
        // this will check when the stack is full
        if (this.isFull()){
            //double the array
            int[] temp = new int[data.length*2];

            //copy all the item in temp array from data[];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;  // data to temp;
         }
        //at this point we know that our array is not full
        //so insert the item;
        return super.push(item);

    }
}
