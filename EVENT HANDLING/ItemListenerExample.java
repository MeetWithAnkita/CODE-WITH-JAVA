import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample extends Frame implements ItemListener {
    Choice languageChoice;
    Label resultLabel;

    ItemListenerExample()
    {
        // Create components
        languageChoice = new Choice();
        resultLabel = new Label("Select a language");

        // Add items to Choice dropdown
        languageChoice.add("Java");
        languageChoice.add("Python");
        languageChoice.add("C++");
        languageChoice.add("JavaScript");

        // Set layout and positions
        setLayout(null);
        languageChoice.setBounds(50, 100, 150, 30);
        resultLabel.setBounds(50, 150, 250, 30);

        // Add components to frame
        add(languageChoice);
        add(resultLabel);

        // Register item listener
        languageChoice.addItemListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("ItemListener Demo");
        setVisible(true);

        // Add window close functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle item events
    public void itemStateChanged(ItemEvent e) {
        String selected = languageChoice.getSelectedItem();
        resultLabel.setText("You selected: " + selected);
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
