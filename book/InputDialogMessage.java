import javax.swing.JOptionPane;
class InputDialogMessage{
    public static void main(String[] args) {
        String text;
        text=JOptionPane.showInputDialog("enter the text");
        JOptionPane.showMessageDialog(null,"Your text:\n"+text);

    }
}