package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student<Integer> anna, petr;
//    private Student<String> bob, phil;

    @BeforeEach
    void setUp() {
        anna = new Student<>("Anna");
        ArrayList<Integer> grades1 = new ArrayList<>(Arrays.asList(3, 4, 3));
        petr = new Student<>("Petr", grades1);
//        ArrayList<String> grades2 = new ArrayList<>(Arrays.asList("good", "fail"));
//        bob = new Student<>("Bob", grades2);
//        phil = new Student<>("Phil", e -> e.length() > 3);
    }

    @Test
    @DisplayName("getName возвращает имя студента")
    void getName_ReturnValidName() {
        assertEquals("Anna", anna.getName());
    }

    @Test
    @DisplayName("setName меняет имя студента")
    void setName_ChangeName_CheckIt() {
        assertEquals("Petr", petr.getName());
        petr.setName("Petr First");
        assertEquals("Petr First", petr.getName());
    }

//    @Test
//    void addGradeTest() {
//        bob.addGrade("3");
//        ArrayList<String> expected = new ArrayList<>(Arrays.asList("good", "fail", "3"));
//
//        assertEquals(expected, bob.getGrades());
//    }
//
//    @Test
//    void addGradeTestWithRightCriteria() {
//        phil.addGrade("good");
//
//        assertEquals("Phil: [good]", phil.toString());
//    }
//
//    @Test
//    void addGradeTestWithWrongCriteria() {
//        Exception thrown = assertThrows(Exception.class, () -> {
//            phil.addGrade("3");
//        });
//
//        assertEquals("Оценка 3 не соответствует заданным условиям!", thrown.getMessage());
//    }
//
//    @Test
//    void delGradeTest() {
//        petr.delGrade(3);
//        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
//
//        assertEquals(expected, petr.getGrades());
//    }
//
//    @Test
//    void delLastGradeTest() {
//        petr.delLastGrade();
//        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
//
//        assertEquals(expected, petr.getGrades());
//    }
//
//    @Test
//    void getGradesTest() {
//        ArrayList<String> expected = new ArrayList<>(Arrays.asList("good", "fail"));
//
//        assertEquals(expected, bob.getGrades());
//    }
//
//    @Test
//    void testEqualsTest() {
//        assertFalse(anna.equals(petr));
//        petr = new Student<>("Anna");
//        assertTrue(anna.equals(petr));
//    }
//
//    @Test
//    void testHashCodeTest() {
//        assertNotEquals(anna.hashCode(), petr.hashCode());
//        petr = new Student<>("Anna");
//        assertEquals(anna.hashCode(), petr.hashCode());
//    }
//
//    @Test
//    void testToStringTest() {
//        String expected = "Anna: []";
//        assertEquals(expected, anna.toString());
//    }
//
//    @Test
//    void undoTest() {
//        anna.setName("Ivan");
//        anna.addGrade(5);
//        anna.addGrade(4);
//        anna.addGrade(5);
//        anna.addGrade(3);
//        anna.delGrade(5);
//        anna.delLastGrade();
//
//        anna.undo();
//        assertEquals("Ivan: [5, 4, 3]", anna.toString());
//
//        anna.undo();
//        assertEquals("Ivan: [5, 4, 5, 3]", anna.toString());
//
//        anna.undo();
//        assertEquals("Ivan: [5, 4, 5]", anna.toString());
//
//        anna.undo();
//        assertEquals("Ivan: [5, 4]", anna.toString());
//
//        anna.undo();
//        assertEquals("Ivan: [5]", anna.toString());
//
//        anna.undo();
//        assertEquals("Ivan: []", anna.toString());
//
//        anna.undo();
//        assertEquals("Anna: []", anna.toString());
//
//        anna.undo();
//        assertEquals("Anna: []", anna.toString());
//
//    }
}