// import java.awt.* ;
// class menu_test extends Frame 
// {
//     menu_test() //constructor 
//     {
//         MenuBar mbar = new MenuBar(); // menubar create 
//         //Frame f = new Frame(); // frame create
//         this.setMenuBar(mbar); // set menubar in this frame 
//         ////***set the Frame***////
//         this.setLayout(new FlowLayout()); // set frame layout=> Flowlayout
//         this.setVisible(true); //to visible the frame => true
//         this.setSize(500,500); //to set the size of frame 

//         Menu m = new Menu("File"); // menu create 
//         // two variable of menuitem 
//         MenuItem m1 = new MenuItem("New");  // menuitem create
//         m.add(m1); // menuitem add in menu
//         MenuItem m2 = new MenuItem("Open");
//         m.add(m2);

//         mbar.add(m); // add menu in menubar 
//     }
//     public static void main (String args[])
//     {
//         new menu_test();
//     }
// } 
import java.awt.* ;
class menu_test extends Frame 
{
    menu_test() //constructor 
    {
        Frame f = new Frame(); // frame create
        MenuBar mbar = new MenuBar(); // menubar create 
        f.setMenuBar(mbar); // set menubar in this frame 
        ////***set the Frame***////
        f.setLayout(new FlowLayout()); // set frame layout=> Flowlayout
        f.setVisible(true); //to visible the frame => true
        f.setSize(500,500); //to set the size of frame 

        Menu m = new Menu("File"); // menu create 
        // two variable of menuitem 
        MenuItem m1 = new MenuItem("New");  // menuitem create
        m.add(m1); // menuitem add in menu
        MenuItem m2 = new MenuItem("Open");
        m.add(m2);

        mbar.add(m); // add menu in menubar 
    }
    public static void main (String args[])
    {
        menu_test mt = new menu_test();
    }
} 