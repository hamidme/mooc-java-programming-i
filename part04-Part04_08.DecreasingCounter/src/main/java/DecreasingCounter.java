
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        int result;
        if(this.value == 0){
           result = this.value; 
        } else {
            result = this.value-=1;
        }
       
    }

    // reset the counter
    public void reset(){
        this.value = 0;
    }
    
}
