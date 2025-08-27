public class ImplementtwoStacks {
    int[] arr;
    int size;
    int top1,top2;

    public ImplementtwoStacks(int n){
        arr = new int[n];
        size = n;
        top1 =n/2+1;
        top2 =n/2;
    }

    public void push1(int data){
        if(top1<size){
            arr[top1++] =data;
        }else{
            System.out.println("Stack is overflow");
        }
    }
    public void push2(int data){
        if(top2>=0){
            arr[top2--]= data;
        }
    }
    public int pop1(){
        if(top1>size/2){
            return arr[--top1];
        }
        else{
            return -1;
        }

    }
    public int pop2(){
        if(top2<size/2){
            return arr[++top2];
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        ImplementtwoStacks s = new ImplementtwoStacks(6);
        s.push1(12);
        s.push1(45);
        s.push2(56);
        System.out.println(s.pop1()+" ");
        System.out.println(s.pop2()+" ");
        System.out.println(s.pop2()+" ");
    }
}
