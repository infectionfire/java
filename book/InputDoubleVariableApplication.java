import javax.swing.JOptionPane;
class InputDoubleVariableApplication{
    public static void main(String[] args) {
        //declaring variables
        double mass,height,bmi;
        String result;
        //enter the value
        result=JOptionPane.showInputDialog("How much do you weigh?");
        mass=Double.parseDouble(result);
        result=JOptionPane.showInputDialog("What is your height in meters");
        height=Double.parseDouble(result);
        //BMI calculation
        bmi=mass/height/height;
        //rounding
        bmi=Math.round(bmi*100)/100.0;
        //output
        JOptionPane.showMessageDialog(null,"Your bmi: "+bmi);
    }
}