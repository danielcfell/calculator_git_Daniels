package ec.edu.epn.calculator;

public class Calculator {
    private int answer;
    public int addition(int a, int b){
        return a+b;
    }
    public int subtraction(int a, int b){
        return a-b;
    }
    public int producto(int a ,int b){
        return a*b;
    }
   @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b){
        return a/b;
    }

    public void timeOut(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getAnswer(){
        return answer;
    }
    public void setAnswer(int answer){
        this.answer=answer;
    }
}
