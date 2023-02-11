package org.example;

public class TestStudentByClass {

//    @RunWith(MockitoJUnitRunner.class)
//    public class ClientBusinessObjectImplTest {
//
//        @Mock
//        private StudentDataObject studentDataObject;
//
//        private ClientBusinessObjectImpl clientBusinessObjectImpl;
//        private List<Student> students;
//
//        @Before
//        public void setUp() {
//            students = Arrays.asList(
//                    new Student("Joy Ma", "Spanish"),
//                    new Student("Julio Hernandez", "Algebra"),
//                    new Student("Jenny Jones", "Calculus")
//            );
//            when(studentDataObject.getAllStudents()).thenReturn(students);
//
//            clientBusinessObjectImpl = new ClientBusinessObjectImpl(studentDataObject);
//        }
//
//        @Test
//        public void testGetAllStudentsBySubject_math() {
//            List<Student> expected = Arrays.asList(
//                    new Student("Julio Hernandez", "Algebra"),
//                    new Student("Jenny Jones", "Calculus")
//            );
//            List<Student> result = clientBusinessObjectImpl.getAllStudentsBySubject("math");
//
//            assertEquals(expected, result);
//        }
//    }
    //  @Mock
    //  ClassDataObject classDataObject;
    //
    //  @InjectMocks
    //  ClientBusinessObjectImpl clientBusinessObjectImpl;
    //
    //  @Test
    //  public void testMarkCurrentClassesInactive() {
    //    Class geometry = new Class("Geometry", "Summer 2022");
    //    Class environmentalScience = new Class("Environmental Science", "Fall 2022");
    //    Class comparativeLiterature = new Class("Comparative Literature", "Spring 2023");
    //    clientBusinessObjectImpl.markCurrentClassesInactive(geometry, environmentalScience, comparativeLiterature);
    //    verify(classDataObject, times(1)).markInactive(geometry);
    //    verify(classDataObject, never()).markInactive(environmentalScience);
    //    verify(classDataObject, never()).markInactive(comparativeLiterature);
    //  }


// First: Setup
//
//    @Captor
//    ArgumentCaptor<Class> classArgumentCaptor;

// Next:
//
//    @Test
//    public void testMarkInactive_argumentCaptor() {
//        // Given
//        Class geometry = new Class(“Geometry”, “Summer 2022);
//        Class envSci = new Class(“Environmental Science”, “Fall 2022”);
//        Class compLit = new Class(“Comparative Literature”, “Spring 2023”);
//        List<Class> allClasses = Arrays.asList(geometry, envSci, compLit);
//
//        given(classDataObject.getAllClasses()).willReturn(allClasses);
//
//        // When
//        clientBusinessObjectImpl.markCurrentClassesInactive();
//
//        // Then
//        verify(classDataObject).markInactive(classArgumentCaptor.capture());
//
//        assertEquals(geometry, classArgumentCaptor.getValue());
//    }

    //To write tests to make sure the methods
    // InstructorDataObject.getClassesByInstructor(instructor_id) and ClassDataObject.getStudentsInClass(class_id) work,
    // we would need to make some assumptions regarding classes and initializing objects of those classes.
    //
    //Assuming that the InstructorDataObject and ClassDataObject classes are already implemented and
    // we have access to their methods, we can write tests as follows:
    //
    //For the method InstructorDataObject.getClassesByInstructor(instructor_id):
    //Create an instance of the InstructorDataObject class and initialize it with some data
    //Call the getClassesByInstructor method and pass an instructor id as a parameter
    //Assert that the returned list of classes is as expected
    //For the method ClassDataObject.getStudentsInClass(class_id):
    //Create an instance of the ClassDataObject class and initialize it with some data
    //Call the getStudentsInClass method and pass a class id as a parameter
    //Assert that the returned list of students is as expected


    //Example Code for above information
    // public class InstructorDataObjectTest {
    //    private InstructorDataObject instructorDataObject;
    //
    //    @Before
    //    public void setUp() {
    //        // Initialize the InstructorDataObject with some data
    //        instructorDataObject = new InstructorDataObject();
    //    }
    //
    //    @Test
    //    public void testGetClassesByInstructor() {
    //        int instructorId = 1;
    //        List<Class> expectedClasses = Arrays.asList(new Class("Math"), new Class("History"));
    //
    //        List<Class> classes = instructorDataObject.getClassesByInstructor(instructorId);
    //
    //        // Assert that the returned list of classes is as expected
    //        assertEquals(expectedClasses, classes);
    //    }
    //}
    //
    //public class ClassDataObjectTest {
    //    private ClassDataObject classDataObject;
    //
    //    @Before
    //    public void setUp() {
    //        // Initialize the ClassDataObject with some data
    //        classDataObject = new ClassDataObject();
    //    }
    //
    //    @Test
    //    public void testGetStudentsInClass() {
    //        int classId = 1;
    //        List<Student> expectedStudents = Arrays.asList(new Student("John"), new Student("Jane"));
    //
    //        List<Student> students = classDataObject.getStudentsInClass(classId);
    //
    //        // Assert that the returned list of students is as expected
    //        assertEquals(expectedStudents, students);
    //    }
    //}

}
