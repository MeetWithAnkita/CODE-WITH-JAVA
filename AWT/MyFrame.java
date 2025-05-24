// AWT UI COMPONENTS ................................
import java.awt.* ;
class MyFrame extends Frame 
{
    Label l1,l2 ;
    TextField t1, t2 ;
    TextArea ta ;
    Button b ;
    List l ;
    Choice ch ;
    Checkbox c1,c2,c3,c4,c5 ;
    CheckboxGroup cbg ;
    Panel p1 , p2, p3 ;
    MyFrame(String s) //constructor
    {
        super(s); //set the title of the frame 
        //label
        l1 = new Label("Enter the Username :");  l2 = new Label("Enter the password :");
        // text field
        t1 = new TextField(10); t2 = new TextField(10);
        // textarea 
        ta = new TextArea(5,10);
        //Button
        b = new Button("Submit!");
        //List
        l = new List(3, true);
        l.add("Kolkata"); l.add("Bangalore"); l.add("Pune"); l.add("Mumbai"); l.add("Chenni"); l.add("Hydrabad");
        //Choice
        ch = new Choice();
        ch.add("BCA"); ch.add("BBA"); ch.add("Bsc"); ch.add("B.Tech"); ch.add("MCA"); ch.add("MBA"); ch.add("Msc"); ch.add("M.Tech");
        //Checkbox
        c1 = new Checkbox("Music"); c2 = new Checkbox("Movie"); c3 = new Checkbox("Sports"); 
        cbg = new CheckboxGroup();
        c4 = new Checkbox("Male", cbg, true );
        c5 = new Checkbox("Female", cbg, true );
        //panels
        p1 = new Panel();  p2 = new Panel(); p3 = new Panel();
        p1.setBackground(Color.RED); p2.setBackground(Color.GREEN); p3.setBackground(Color.BLUE);
        // add components to panel 
        p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2); p1.add(ta);

        p2.add(c1); p2.add(c2); p2.add(c3); p2.add(c4); p2.add(c5);

        p3.add(l); p3.add(ch); p3.add(b);

        //add panels to frame with border layout 
        add(p1,BorderLayout.NORTH); add(p2,BorderLayout.CENTER); add(p3,BorderLayout.SOUTH);    
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[])
    {
        // nMyFrame mf = 
        new MyFrame("My Frame") ;
    }
}