package com.app.schoolmanager.Controller;

import com.app.schoolmanager.Models.Classroom;
import com.app.schoolmanager.Models.Student;
import com.app.schoolmanager.interfaces.StudentInterface;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerStudent  implements Initializable {

    @FXML
    private Button register;

    @FXML
    private DatePicker date;

    @FXML
    private TextField first;

    @FXML
    private TextField last;

    @FXML
    private TextField place;

    @FXML
    private ComboBox<String> classroomText;

    private int currentClassroomIndex=0;
    private Classroom classroom;
    private final Student student = new Student();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        classroom = new Classroom();
        classroomText.getItems().clear();


        try {
            System.out.println(classroom.list().size());
            for (int i = 0; i < classroom.list().size(); i++) {
                classroomText.getItems().add(classroom.list().get(i).getName());

            }

        } catch (Exception e) {

        }
        EventHandler<ActionEvent> classroomsEvent =
                e -> {
                    currentClassroomIndex = classroomText.getSelectionModel().getSelectedIndex();

                };
        classroomText.setOnAction(classroomsEvent);
    }

        @FXML
    private void onSubmitProduct() throws SQLException {
        String firstname = first.getText().trim();
        String lastname = last.getText().trim();
        String placeOfBirth = place.getText().trim();
        String dateOfBirth = String.valueOf(date.getValue());
        String classroom = String.valueOf(classroomText.getTooltip());




        if (!firstname.isEmpty() &&  !lastname.isEmpty() && !placeOfBirth.isEmpty() && !dateOfBirth.isEmpty() && !classroom.isEmpty()) {
            try {
                student.setFirstname(firstname);
                student.setLastname(lastname);
                student.setClassroom(this.classroom.list().get(currentClassroomIndex));



                student.setDateOfBirth(dateOfBirth);
                student.setPlaceOfBirth(placeOfBirth);


               // StudentInterface student;
                if (student.getId() == 0) {
                    student.create(student);
                } else {

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
