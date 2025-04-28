import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Serialization.Student;

public class SerializationExample {

    public static void main(String[] args) {
        try{
            Student student = new Student(101, "Alpha");

            try(FileOutputStream fileOutput = new FileOutputStream("Student.ser")){

            ObjectOutputStream out = new ObjectOutputStream(fileOutput);

            out.writeObject(student);
            out.close();
        }
        System.out.println("Serialization done!....");
    } catch (Exception e){
        e.printStackTrace();
    }
    }
    
}
