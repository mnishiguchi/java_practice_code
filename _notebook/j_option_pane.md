# JOptionPane

- https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
- [create your own Custom JDialog to check user input etc before closing](http://stackoverflow.com/a/13055405/3837223)

```java
import javax.swing.JOptionPane;

//...

String input = JOptionPane.showInputDialog("How many cards do you want: ");
int num = Integer.parseInt(input);
```

==

## Input validation

### using try and catch

```java
import javax.swing.JOptionPane;

//...

int num = 0;

boolean inputAccepted = false;
while(!inputAccepted) {
  String input = JOptionPane.showInputDialog("How many cards do you want: ");
  
  try {
    num = Integer.parseInt(input);
    inputAccepted = true;

  } catch(NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter only numbers");
  }
}
```

## using if else with specific requirements

```java
import javax.swing.*;

//...

int num = 0;

boolean inputAccepted = false;
while(!inputAccepted) {
  String input = JOptionPane.showInputDialog("How many cards do you want: ");
  
  if (input == null || input.isEmpty() || !input.matches("[A-Za-z]*")) {
    num = Integer.parseInt(input);
    inputAccepted = true;

  } else {
    JOptionPane.showMessageDialog(null, "Please enter only numbers");
  }
}
```

