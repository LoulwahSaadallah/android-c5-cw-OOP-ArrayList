package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */
        ArrayList<Student> students = new ArrayList<>();
       Student s1 = new Student("Yousef", 14, 12, R.drawable. boy1);
       Student s2 = new Student("Salman" , 13 ,10, R.drawable. boy1 );
       Student s3 = new Student("Majed", 15, 11, R.drawable. boy1);

       students.add(s1);
       students.add(s2);
       students.add(s3);
       System.out.println("Student name " +students.get(0).getStudentName());
       System.out.println("Student age" + students.get(0).getStudentAge());
       System.out.println("Student grade" + students.get(0).getStudentGrade());
       System.out.println("Student img" + students.get(0).getStudentImg());

        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}