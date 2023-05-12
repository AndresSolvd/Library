package com.solvd.util;

import com.solvd.entities.Library;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reflexion {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        //CLASS
        System.out.println("\n--- CLASS ---");

        // Initialize classA
        Class classA = Class.forName("com.solvd.entities.Library");

        // Print all Methods in the Library Class
        System.out.println("\n--- All methods used in the Library CLass --- ");
        System.out.println(Stream.of(classA.getMethods())
                .map(Method::getName)
                .collect(Collectors.toList()));

        // Print only methods that belongs to the Library Class
        System.out.println("\n--- Only all methods that belongs to the Library CLass ---");
        System.out.println(Stream.of(classA.getDeclaredMethods())
                .map(Method::getName)
                .collect(Collectors.toList()));

        //METHOD
        System.out.println("\n--- METHOD ---");
        //Create new library and change its name with reflexion
        System.out.println("\n--- Create Library and Change name with reflexion ---");

        //New library
        Library testLibrary = new Library("LibraryForTest", "none");
        System.out.println("First Library Name: " + testLibrary.getLibraryName());

        //Change the name using the local method with reflexion
        Method setLibraryNamemethod = classA.getDeclaredMethod("setLibraryName", String.class);
        setLibraryNamemethod.invoke(testLibrary, "NewNameByMETHODReflexion");
        System.out.println("Renamed by Field Reflexion: " + testLibrary.getLibraryName());

        //CONSTRUCTOR
        System.out.println("\n--- CONSTRUCTOR ---");
        // Get constructors
        System.out.println("\n--- Get constructor ---");
        Stream.of(classA.getConstructors())
                .map(Constructor -> Arrays.toString(Constructor.getParameterTypes()))
                .forEach(System.out::println);

        //FIELD
        System.out.println("\n--- FIELD ---");
        //Change name by Field reflexion
        System.out.println("\n--- Change name by Field reflexion ---");
        Field field = classA.getDeclaredField("libraryName");
        field.setAccessible(true);
        field.set(testLibrary, "NewNameByFIELDReflexion");
        System.out.println("Renamed by Field Reflexion: " + testLibrary.getLibraryName());
    }
}