import javax.swing.JOptionPane;
class UsingVariablesApplication{
    public static void main(String[] args) {
        //variables
        int number=123;
        double x=1.23;
        char symb='a';
        boolean state=false;
        String text="Using text variables:\n";
        //integer
        text=text+"integer: "+number+'\n';
        //double
        text=text+"real number: "+x+'\n';
        //char
        text=text+"symbol: "+symb+'\n';
        //boolean
        text=text+"boolean: "+state+'\n';
        //output window
        JOptionPane.showMessageDialog(null,text);
    }
}