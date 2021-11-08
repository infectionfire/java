import javax.swing.JOptionPane;
class InputInVariablesApplication{
    public static void main(String[] args) {
        //declaring variables
        int age,year,birth;
        String result;
        //input data year, age
        result=JOptionPane.showInputDialog("What is the year now?");
        year=Integer.parseInt(result);
        result=JOptionPane.showInputDialog("How old are you?");
        age=Integer.parseInt(result);
        //calculating age
        birth=year-age;
        //show dialog message
        JOptionPane.showMessageDialog(null,"You were born in the "+birth+" year");

    }
}