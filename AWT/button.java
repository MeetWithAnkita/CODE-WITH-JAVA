import java.awt.* ;

class button 
{
    button() // constructor
    {
        Frame f = new Frame();
        Button b = new Button("Click Here!");
        //The function b.setBounds(x, y, width, height) in Java (typically used with AWT or Swing components like Button, Label, TextField, etc.) 
        // sets the position and size of a component. and setBounds() is used only when layout manager is set to null.
        // frame.setLayout(null);
        // Otherwise, layout managers (like FlowLayout, BorderLayout, etc.) will ignore the bounds.
        b.setBounds(50,100,130,80); // button set up
        f.add(b);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String [] args)
    { 
        button bt = new button();
    }
}