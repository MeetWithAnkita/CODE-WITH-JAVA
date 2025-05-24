//  here i use two type of event handling (i) ActionListner (ii) windowlistner
import java.awt.* ;
import java.awt.event.* ;
class event_test extends Frame implements ActionListener 
{
    Frame f ;
    Button b ;
    TextField tf;
    event_test() //constructor
    {
        f = new Frame("Test");
        b = new Button("Click");
        tf = new TextField(10);

        // text field and button structure set up 
        tf.setBounds(50,100,150,30);
        b.setBounds(220,100,60,30);

        // add button and text field to frame 
        f.add(b); f.add(tf);

        // frame set up 
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

        // register button to the event handling
        b.addActionListener(this); //this acts as an ActionListener here, not just a Frame

        // Add window close functionality
        f.addWindowListener(new WindowAdapter()
        {
             public void windowClosing(WindowEvent e)
        {
                f.dispose();
        }
        }
        );
    }
    // code for action listner
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        tf.setText(str);
    }
    public static void main(String args[])
    {
        event_test et = new event_test();
    }
}
