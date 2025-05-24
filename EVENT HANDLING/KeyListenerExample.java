// import java.awt.*;
// import java.awt.event.*;

// public class KeyListenerExample extends Frame implements KeyListener {
//     Label label;
//     TextField textField;

//     KeyListenerExample() 
//     {
//         // Create components
//         label = new Label("write what you want:");
//         textField = new TextField();

//         // Set layout and bounds
//         setLayout(null);
//         textField.setBounds(50, 100, 200, 30);
//         label.setBounds(50, 150, 300, 30);

//         // Add components
//         add(textField);
//         add(label);

//         // Register KeyListener
//         textField.addKeyListener(this);

//         // Frame settings
//         setTitle("KeyListener Demo");
//         setSize(400, 300);
//         setVisible(true);

//         // Handle window closing
//         addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent e) {
//                 dispose();
//             }
//         });
//     }

//     public void keyPressed(KeyEvent e) {
//         label.setText("Pressed: " + e.getKeyChar());
//     }

//     // Called when a key is released
//     public void keyReleased(KeyEvent e) {
//         // Required by interface, even if you don't use it
//     }

//     // Called when a key is typed (pressed and released)
//     public void keyTyped(KeyEvent e) {
//         label.setText(label.getText() + " | Typed: " + e.getKeyChar());
//     }

//     public static void main(String[] args) {
//         new KeyListenerExample();
//     }
// }
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Label label;
    TextField textField;

    KeyListenerExample() {
        // Create components
        label = new Label();
        textField = new TextField();

        // Set layout and bounds
        setLayout(null);
        textField.setBounds(50, 100, 200, 30);
        label.setBounds(50, 150, 300, 30);

        // Add components
        add(textField);
        add(label);

        // Register KeyListener
        textField.addKeyListener(this);

        // Frame settings
        setTitle("KeyListener Demo");
        setSize(400, 300);
        setVisible(true);

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Called when a key is pressed
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    // Called when a key is released
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    // Called when a key is typed (pressed and released)
    public void keyTyped(KeyEvent e) {
        // Optional to use
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
