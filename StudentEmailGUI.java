import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class StudentEmailGUI extends JFrame {
    // Constants:

    /**
     *
     */
    private static final long serialVersionUID = 4062571071256416159L;

    // GUI Componet:
    JTextArea studentTextArea = new JTextArea();

    JLabel idLabel = new JLabel("ID: ");
    JTextField idTextField = new JTextField(10);
    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameTextField = new JTextField(10);

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton displayAllButton = new JButton("Display All");
    JButton exitButton = new JButton("Exit");

    // Class Instance Data:
    private LinkedList<StudentEmail> studentLinkedList = new LinkedList<StudentEmail>();

    public StudentEmailGUI() {
        JPanel flow1Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel = new JPanel(new GridLayout(2, 1));

        // prevent to jpannel to be edit
        studentTextArea.setEditable(false);

        flow1Panel.add(idLabel);
        flow1Panel.add(idTextField);
        flow1Panel.add(nameLabel);
        flow1Panel.add(nameTextField);

        flow2Panel.add(addButton);
        flow2Panel.add(deleteButton);
        flow2Panel.add(displayAllButton);
        flow2Panel.add(exitButton);

        gridPanel.add(flow1Panel);
        gridPanel.add(flow2Panel);

        add(studentTextArea, BorderLayout.CENTER);
        add(gridPanel, BorderLayout.SOUTH);

        addButton.addActionListener(event -> addStudent());

    }

    private void addStudent() {
        studentLinkedList.add(new StudentEmail(nameTextField.getText(), idTextField.getText()));
        studentTextArea.setText("");

        for (StudentEmail stud : studentLinkedList) {
            studentTextArea.append(stud + "\n");
        }
    }

    public static void main(String[] args) {
        StudentEmailGUI app = new StudentEmailGUI();
        app.setVisible(true);
        app.setSize(500, 310);
        app.setLocation(200, 100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
